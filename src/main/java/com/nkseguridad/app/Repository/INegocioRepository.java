package com.nkseguridad.app.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.nkseguridad.app.Entity.Negocio;

@Repository
public interface INegocioRepository extends CrudRepository<Negocio, String> {

	@Query(value = "Select * from public.negocio e WHERE e.idnegocio = :empresaid", nativeQuery = true)
	public Negocio findNegocioById(@Param("empresaid") Long id);
	
	@Query(value = "Select * from public.negocio e WHERE e.codnegocio = :codnegocio", nativeQuery = true)
	public Negocio findNegocioByCodNegocio(@Param("codnegocio") String codnegocio);
}
