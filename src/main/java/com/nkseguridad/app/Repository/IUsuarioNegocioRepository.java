package com.nkseguridad.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Negocio;
import com.nkseguridad.app.Entity.UsuarioNegocio;

@Repository
public interface IUsuarioNegocioRepository extends CrudRepository<UsuarioNegocio, Long>{

	@Query(value = "Select * from public.usuarionegocio e WHERE e.idusuario = :usuarioid", nativeQuery = true)
	public List<UsuarioNegocio> findNegocioByIdUsuario(@Param("usuarioid") Long id);
}
