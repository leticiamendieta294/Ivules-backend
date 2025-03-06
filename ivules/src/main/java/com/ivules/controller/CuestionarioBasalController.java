package com.ivules.controller;

import java.io.ByteArrayInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivules.entity.CuestionarioBasal;
import com.ivules.entity.OpcionesClinica;
import com.ivules.entity.Personas;
import com.ivules.entity.Seguimiento;
import com.ivules.service.CuestionarioBasalService;
import com.ivules.service.OpcionesClinicaService;
import com.ivules.service.PersonasService;
import com.ivules.service.SeguimientoService;
import com.ivules.util.exceptions.SigebiException;



@RestController
@CrossOrigin
@RequestMapping("/auth/cuestionariobasal")
public class CuestionarioBasalController {
	
	@Autowired
	private CuestionarioBasalService cuestionariobasalService;
	
	

	
	private static final String DATE_PATTERN = "yyyy/MM/dd";
	
	@PostMapping
	public ResponseEntity<?> insertar(@Valid @RequestBody CuestionarioBasal cuestionariobasal, BindingResult result) {
		Map<String, Object> response = new HashMap<>();		
		CuestionarioBasal cuestionariobasalNew =  new CuestionarioBasal();
		
		
		
		if( result.hasErrors() ) {

			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '" + err.getField() +"' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		
	   
		
		cuestionariobasalNew = cuestionariobasalService.save(cuestionariobasal);
	    
		
		response.put("mensaje", "El cuestionario basal ha sido creado con éxito!");
		response.put("cuestionariobasal", cuestionariobasalNew);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	
	
	@GetMapping
	public ResponseEntity<?> listar() throws SigebiException {
		List<CuestionarioBasal> cuestionariobasalList = null;
		
		cuestionariobasalList = cuestionariobasalService.findAll();
		
		return new ResponseEntity<List<CuestionarioBasal>>(cuestionariobasalList, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> obtener(@PathVariable("id") Integer id) throws SigebiException {
		CuestionarioBasal cuestionarioBasal = null;
		
		cuestionarioBasal = cuestionariobasalService.findById(id);

		return new ResponseEntity<CuestionarioBasal>(cuestionarioBasal, HttpStatus.OK);
	}
	
	
	@PutMapping
	public ResponseEntity<?> actualizar(@Valid @RequestBody CuestionarioBasal cuestionariobasal, BindingResult result) throws SigebiException {
		Map<String, Object> response = new HashMap<>();
		
		if( result.hasErrors() ) {
			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '" + err.getField() +"' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			throw new SigebiException.BusinessException(errors.toString());
		}
		
		CuestionarioBasal cuestionariobasalUpdated = null;

		cuestionariobasalUpdated = cuestionariobasalService.actualizar(cuestionariobasal);

		response.put("mensaje", "El cuestionario basal ha sido actualizado con éxito!");
		response.put("cuestionariobasal", cuestionariobasalUpdated);

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/pacienteId/{personaId}")
	public ResponseEntity<?> obtenerByPersona(@PathVariable("personaId") Integer id) throws SigebiException {
		CuestionarioBasal cuestionarioBasal = null;
		
		cuestionarioBasal = cuestionariobasalService.findByPersonaId(id);

		return new ResponseEntity<CuestionarioBasal>(cuestionarioBasal, HttpStatus.OK);
	}
	
	/*@GetMapping(value = "/export/cuestionarioBasal/{personaId}")
	public ResponseEntity<InputStreamResource> exportData(@PathVariable("personaId") Integer id) throws Exception {
		ByteArrayInputStream stream = cuestionariobasalService.exportExcelCuestionarioBasal(id);
		
		HttpHeaders headers =  new HttpHeaders();
		
		headers.add("Content-Disposition", "attachment; filename= \"cuestionario_basal"+ new Date()+".xlsx\"");

		return  ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
	}
	*/
	
	@GetMapping(value = "/export")
	public ResponseEntity<InputStreamResource> exportData() throws Exception {
		ByteArrayInputStream stream = cuestionariobasalService.exportExcelCuestionarioBasalModificado();
		
		HttpHeaders headers =  new HttpHeaders();
		final DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		headers.add("Content-Disposition", "attachment; filename= \"CuestionarioBasal"+LocalDateTime.now().format(CUSTOM_FORMATTER)+".xlsx\"");

		return  ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
	}
	

}
