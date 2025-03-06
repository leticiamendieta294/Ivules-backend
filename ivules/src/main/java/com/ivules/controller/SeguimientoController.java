package com.ivules.controller;

import java.io.ByteArrayInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
import com.ivules.entity.Seguimiento;
import com.ivules.service.SeguimientoService;
import com.ivules.util.exceptions.SigebiException;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/auth/seguimiento")
public class SeguimientoController {
	
	@Autowired
	private SeguimientoService seguimientoService;

	
	private static final String DATE_PATTERN = "yyyy/MM/dd";
	
	@PostMapping
	public ResponseEntity<?> insertar(@Valid @RequestBody Seguimiento seguimiento, BindingResult result) {
		Map<String, Object> response = new HashMap<>();		
		Seguimiento seguimientoNew = null;
		
		if( result.hasErrors() ) {

			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '" + err.getField() +"' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		
		seguimientoNew = seguimientoService.save(seguimiento);
		
		response.put("mensaje", "El seguimiento ha sido creado con éxito!");
		response.put("seguimiento", seguimientoNew);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}

	
	@PutMapping
	public ResponseEntity<?> actualizar(@Valid @RequestBody Seguimiento seguimiento, BindingResult result) throws SigebiException {
		Map<String, Object> response = new HashMap<>();
		
		if( result.hasErrors() ) {
			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '" + err.getField() +"' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			throw new SigebiException.BusinessException(errors.toString());
		}
		
		Seguimiento seguimientoUpdated = null;

		seguimientoUpdated = seguimientoService.actualizar(seguimiento);

		response.put("mensaje", "El seguimiento ha sido actualizado con éxito!");
		response.put("seguimiento", seguimientoUpdated);

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> obtener(@PathVariable("id") Integer id) throws SigebiException {
		Seguimiento seguimiento = null;
		
		seguimiento = seguimientoService.findById(id);

		return new ResponseEntity<Seguimiento>(seguimiento, HttpStatus.OK);
	}
	
	
	
	@GetMapping(value = "/ver/{personaId}/{numero}")
	public ResponseEntity<?> obtenerByPersonaIdAndNumero(@PathVariable("personaId") Integer id,@PathVariable("numero") Integer numero) throws SigebiException {
		Seguimiento seguimiento = null;
		
		seguimiento = seguimientoService.findByPersonaIdAndNumero(id, numero);

		return new ResponseEntity<Seguimiento>(seguimiento, HttpStatus.OK);
	}
	
	@GetMapping(value = "/export/{numero}")
	public ResponseEntity<InputStreamResource> exportData(@PathVariable("numero") Integer numero) throws Exception {
		ByteArrayInputStream stream = seguimientoService.exportAllDataModificado(numero);
		
		HttpHeaders headers =  new HttpHeaders();
		final DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		headers.add("Content-Disposition", "attachment; filename= \"Seguimiento_"+numero +" "+LocalDateTime.now().format(CUSTOM_FORMATTER)+".xlsx\"");

		return  ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
	}
	
	@GetMapping(value = "/numero/{numero}")
	public ResponseEntity<?> obtenerSeguimientoNumero(@PathVariable("numero") Integer numero) {
		List<Seguimiento> seguimiento = null;
		
		seguimiento = seguimientoService.obtenerSeguimientoNumero(numero);

		return new ResponseEntity<List<Seguimiento>>(seguimiento, HttpStatus.OK);
	}
}
