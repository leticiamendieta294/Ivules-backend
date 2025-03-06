package com.ivules.service;

import java.io.ByteArrayInputStream;
import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;

import com.ivules.entity.CuestionarioBasal;
import com.ivules.entity.Laboratorio;
import com.ivules.entity.Seguimiento;
import com.ivules.util.exceptions.SigebiException;



public interface SeguimientoService {
	
    public List<Seguimiento> findAll();
	
	public int count();
	
	public Seguimiento findById(int id);
	
	public Seguimiento save(Seguimiento seguimiento);
	
	public void delete(int id);
	
	public List<Seguimiento> buscar(Date fromDate, Date toDate, Seguimiento seguimiento, String orderBy, String orderDir, Pageable pageable);
	
	public List<Seguimiento> findByPersonaId(int id) throws SigebiException;
	
	public List<String> comprobarEstadoSeguimiento(int id) throws SigebiException;

	public Seguimiento actualizar(Seguimiento seguimiento) throws SigebiException;
	
	public Seguimiento findByPersonaIdAndNumero(int id, int numero) throws SigebiException;
	
	List<Seguimiento> obtenerSeguimientoNumero(int numero);
	Seguimiento obtenerSeguimientoPersonaIdAndNumero(int personaId,int numero);

	int countByNumero(int numero) throws SigebiException;
	
List<Seguimiento> excelParaSeguimiento(int numero);
	
	public ByteArrayInputStream exportAllDataModificado(int numero) throws Exception;

}
