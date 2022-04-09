package com.nkseguridad.app.Repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.nkseguridad.app.Entity.CajaNegocio;

@Repository
public interface ICajaNegocioRepository extends CrudRepository<CajaNegocio, Long>{
	

	@Query(value = "Select * from public.cajanegocio e WHERE e.idusuario = :usuarioid AND e.codnegocio = :negocioid", nativeQuery = true)
	public List<CajaNegocio> findAllCajaSucursal(@Param("usuarioid") Long idusuario,
												 @Param("negocioid") Long idnegocio);
}
