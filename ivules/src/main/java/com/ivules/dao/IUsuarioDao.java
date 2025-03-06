package com.ivules.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ivules.entity.Funcionarios;
import com.ivules.entity.Personas;
import com.ivules.security.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Integer>, JpaSpecificationExecutor<Usuario> {
	//Usuario findByPersonas(Personas personas);	
	Usuario findByFuncionarios(Funcionarios funcionarios);
}
