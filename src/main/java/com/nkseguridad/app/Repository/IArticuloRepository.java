package com.nkseguridad.app.Repository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;
import com.nkseguridad.app.Entity.Articulo;

@Repository
public interface IArticuloRepository extends CrudRepository<Articulo,Long> {
	
	List<Articulo> findByCodtipoproducto(Long Tipo);
	Articulo findByCodigo(String codigo);
	
	//SELECT DISTINCT p FROM Department d JOIN d.employees e JOIN e.projects p
	//@Query("select ar from Articulo a JOIN a.lstmovimientoskardex ar")
	@Query(value = "Select DISTINCT "
			+ "a.id,"
			+ "a.codigo,"
			+ "a.nomarticulo,"
			+ "a.codmarca,"
			+ "a.codfamilia,"
			+ "a.codunidadmedida,"
			+ "a.codimpuesto,"
			+ "a.codtipoproducto,"
			+ "a.codigobarraprincipal,"
			+ "a.serial,"
			+ "a.referencia,"
			+ "a.status,"
			+ "a.preciosugerido,"
			+ "a.codnegocio,"
			+ "a.descripcionlarga,"
			+ "a.stockminimo,"
			+ "a.stockmaximo,"
			+ "a.cantidadreorden,"
			+ "a.peso,"
			+ "a.talla,"
			+ "a.color,"
			+ "a.tipoiva,"
			+ "a.esimpoconsumo,"
			+ "a.valorimpoconsumo,"
			+ "a.porcentajeimpoconsumo,"
			+ "a.ivaincluido"			
			+ " from Articulo a INNER JOIN Kardex k on a.id=k.articulo_id AND k.fecha BETWEEN :startDate AND :endDate", nativeQuery = true)
	public List<Articulo> findAllFilterProducto(@Param("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            									@Param("endDate")   @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate);
	
	
	@Query(value = "Select DISTINCT "
			+ "a.id,"
			+ "a.codigo,"
			+ "a.nomarticulo,"
			+ "a.codmarca,"
			+ "a.codfamilia,"
			+ "a.codunidadmedida,"
			+ "a.codimpuesto,"
			+ "a.codtipoproducto,"
			+ "a.codigobarraprincipal,"
			+ "a.serial,"
			+ "a.referencia,"
			+ "a.status,"
			+ "a.preciosugerido,"
			+ "a.codnegocio,"
			+ "a.descripcionlarga,"
			+ "a.stockminimo,"
			+ "a.stockmaximo,"
			+ "a.cantidadreorden,"
			+ "a.peso,"
			+ "a.talla,"
			+ "a.color,"
			+ "a.tipoiva,"
			+ "a.esimpoconsumo,"
			+ "a.valorimpoconsumo,"
			+ "a.porcentajeimpoconsumo,"
			+ "a.ivaincluido"			
			+ " from Articulo a INNER JOIN Kardex k on a.id=k.articulo_id AND k.fecha BETWEEN :startDate AND :endDate AND k.codalmacen = :idalmacen", nativeQuery = true)
	public List<Articulo> findAllFilterProductoPorAlmacen(@Param("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            											  @Param("endDate")   @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate,
                  										  @Param("idalmacen") Long codalmacen);
}
