package com.ivules.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ivules.security.entity.Rol;
import com.ivules.security.entity.Usuario;
import com.ivules.security.entity.UsuarioRol;

public interface IUsuarioRolDao extends JpaRepository<UsuarioRol, Integer>, JpaSpecificationExecutor<UsuarioRol> {
	List<UsuarioRol> findByUsuario(Usuario usuario);	
	List<UsuarioRol> findByRol(Rol rol);
}
