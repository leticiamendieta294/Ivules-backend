package com.ivules.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivules.entity.CuestionarioBasal;
import com.ivules.service.CuestionarioBasalService;
import com.ivules.service.SeguimientoService;
import com.ivules.util.exceptions.SigebiException;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth/informes")
public class InformesController {

	@Autowired
	private CuestionarioBasalService cuestionariobasalService;
	
	@Autowired
	private SeguimientoService seguimientoService;
	@GetMapping
	public ResponseEntity<?> cantidadCuestionarioBasal() throws SigebiException {
		Map<String, String> informes = new HashMap<String, String>();
		
		int cantidadCuestionarioBasal = cuestionariobasalService.count();
		
		informes.put("Cuestionario Basal", String.valueOf(cantidadCuestionarioBasal));
		
		for (int i = 0; i < 4; i++) {
			if(seguimientoService.countByNumero(i+1)==0) {
				informes.put("Seguimiento " + String.valueOf(i+1), String.valueOf(0));
			}else {
				informes.put("Seguimiento " + String.valueOf(i+1), String.valueOf(seguimientoService.countByNumero(i+1)));

			}
		}

		return new ResponseEntity<>(informes, HttpStatus.OK);
	}
}
