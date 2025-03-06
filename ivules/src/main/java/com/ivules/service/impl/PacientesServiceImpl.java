package com.ivules.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.criteria.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;


import com.ivules.dao.IPacientesDao;
import com.ivules.dao.IPersonasDao;

import com.ivules.entity.Pacientes;

import com.ivules.entity.Personas;

import com.ivules.service.PacientesService;

import com.ivules.service.PersonasService;
import com.ivules.service.UtilesService;
import com.ivules.util.Globales;
import com.ivules.util.exceptions.SigebiException;


@Service
public class PacientesServiceImpl implements PacientesService{

	@Override
	public List<Pacientes> listar() throws SigebiException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pacientes obtener(int id) throws SigebiException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pacientes guardar(Pacientes paciente) throws SigebiException {
		// TODO Auto-generated method stub
		return null;
	}

	



	@Override
	public Pacientes actualizar(Pacientes paciente) throws SigebiException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int id) throws SigebiException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pacientes> buscar(Date fromDate, Date toDate, Pacientes paciente, List<Integer> personasId,
			String orderBy, String orderDir, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pacientes> buscarNoPaginable(Date fromDate, Date toDate, Pacientes paciente, List<Integer> personasId)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pacientes> buscarPacientes(Date fromDate, Date toDate, Pacientes paciente, String orderBy,
			String orderDir, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
