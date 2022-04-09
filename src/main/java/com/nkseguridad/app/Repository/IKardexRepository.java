package com.nkseguridad.app.Repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Kardex;

@Repository
public interface IKardexRepository extends CrudRepository<Kardex, Long> {

	@Query(value = "Select * from Kardex k WHERE k.fecha BETWEEN :startDate AND :endDate AND k.articulo_id = :idarticulo", nativeQuery = true)
	public List<Kardex> findAllMovimientoInventario(@Param("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            										@Param("endDate")   @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate,
            										@Param("idarticulo") Long articulo_id);
	
	@Query(value = "Select * from Kardex k WHERE k.fecha BETWEEN :startDate AND :endDate AND k.articulo_id = :idarticulo AND k.codalmacen = :idalmacen", nativeQuery = true)
	public List<Kardex> findAllMovimientoInventarioPorAlmcen(@Param("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            										@Param("endDate")   @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate,
            										@Param("idarticulo") Long articulo_id,
            										@Param("idalmacen") Long codalmacen);
}
