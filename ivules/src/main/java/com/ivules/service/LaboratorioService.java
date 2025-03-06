package com.ivules.service;

import java.io.ByteArrayInputStream;
import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;

import com.ivules.clases.LaboratorioResult;
import com.ivules.entity.Laboratorio;
import com.ivules.entity.Seguimiento;
import com.ivules.util.exceptions.SigebiException;



public interface LaboratorioService {

    public List<Laboratorio> findAll();
	
	public int count();
	
	public Laboratorio findById(int id);
	
	public Laboratorio save(Laboratorio laboratorio);
	
	public void delete(int id);
	
	public List<Laboratorio> buscar(Date fromDate, Date toDate, Laboratorio laboratorio, String orderBy, String orderDir, Pageable pageable);
	
    public Laboratorio actualizar(Laboratorio laboratorio) throws SigebiException;
	
	public Laboratorio findByPersonaIdAndNumero(int id, int numero) throws SigebiException;

	int countByNumero(int numero) throws SigebiException;
	
	public List<String> comprobarEstadoLaboratorio(int id) throws SigebiException;

	List<Laboratorio> findByPersonaId(int id) throws SigebiException;
	
	List<Laboratorio> findByNumeroOrderByPersonas(int numero) throws SigebiException;
	
	public ByteArrayInputStream exportAllData(int numero) throws Exception;

	List<Laboratorio> existByPersonaId(int id);
	
	List<String> searchByUrocultivoAndPersonaId(String urocultivo, int personaId);
	
	List<Laboratorio> excelParaLaboratorio(int numero);
	
	public ByteArrayInputStream exportAllDataModificado(int numero) throws Exception;
}
