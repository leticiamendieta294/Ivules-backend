package com.ivules.service.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import javax.persistence.criteria.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ivules.dao.IOpcionesClinicaDao;
import com.ivules.dao.IPersonasDao;
import com.ivules.entity.CuestionarioBasal;
import com.ivules.entity.OpcionesClinica;
import com.ivules.entity.Personas;
import com.ivules.entity.Seguimiento;
import com.ivules.service.CuestionarioBasalService;
import com.ivules.service.OpcionesClinicaService;
import com.ivules.service.PersonasService;
import com.ivules.service.SeguimientoService;
import com.ivules.util.exceptions.SigebiException;

@Service
public class OpcionesClinicaServiceImpl implements OpcionesClinicaService{

	@Autowired
	private IOpcionesClinicaDao opcionesClinicaDao;

	@Autowired
	private PersonasService personaService;
	

	

	
	public OpcionesClinicaServiceImpl(IOpcionesClinicaDao opcionesClinicaDao) {
		super();
		this.opcionesClinicaDao = opcionesClinicaDao;
	}

	@Override
	@Transactional(readOnly = true)
	public List<OpcionesClinica> findAll() {
		return (List<OpcionesClinica>) opcionesClinicaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public OpcionesClinica findById(int id) {
		return opcionesClinicaDao.findById(id).orElse(null);
	}

	@Transactional
	public OpcionesClinica save(OpcionesClinica historialClinico) {		
		return opcionesClinicaDao.save(historialClinico);
	}
	
	@Transactional
	public OpcionesClinica actualizar(OpcionesClinica historialClinico) throws Exception {			
		return opcionesClinicaDao.save(historialClinico);
	}

	@Override
	@Transactional
	public void delete(int id) {
		opcionesClinicaDao.deleteById(id);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	@Transactional(readOnly = true)
	public OpcionesClinica findByPersonaId(int id) {
		
		
		OpcionesClinica opcionesClinica = opcionesClinicaDao.findByPersonas(id);
		return opcionesClinica;
	}

	
	
		
}
