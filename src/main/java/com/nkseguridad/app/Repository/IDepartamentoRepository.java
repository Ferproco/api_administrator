package com.nkseguridad.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Departamento;

@Repository
public interface IDepartamentoRepository extends CrudRepository<Departamento, Long> {

	public List<Departamento> findByCodpais(Long codpais);
}
