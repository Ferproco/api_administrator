package com.nkseguridad.app.Repository;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Almacen;

@Repository
public interface IAlmacenRepository extends CrudRepository<Almacen,Long>{

	 public List<Almacen> findAllOrderBy(Sort sort);
	 
	 @Modifying
	 @Transactional
	 @Query("update Almacen u set u.principal = false")
	 public void desactivarprincipal();
	 
}
