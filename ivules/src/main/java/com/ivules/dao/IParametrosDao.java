package com.ivules.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ivules.entity.Parametros;

public interface IParametrosDao extends JpaRepository<Parametros, Integer>, JpaSpecificationExecutor<Parametros>  {
    Parametros findByCodigoParametro(String path_reportes);
}
