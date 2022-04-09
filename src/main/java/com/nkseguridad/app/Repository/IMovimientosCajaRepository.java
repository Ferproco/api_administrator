package com.nkseguridad.app.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nkseguridad.app.Entity.MovimientosCaja;

public interface IMovimientosCajaRepository extends CrudRepository<MovimientosCaja, Integer> {

	public List<MovimientosCaja> findByCodigocaja(String codigocaja);
	
	  /* @Query("SELECT FROM movimientoscaja WHERE codigo='codigocaja'  AND fecha BETWEEN desde AND hasta ")

	   public List<MovimientosCaja> findByAllData(String codigocaja,Date desde,Date hasta);
	*/
}