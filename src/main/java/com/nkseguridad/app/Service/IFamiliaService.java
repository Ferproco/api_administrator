package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Almacen;
import com.nkseguridad.app.Entity.Familia;

public interface IFamiliaService {
    public List<Familia> findAll();
    public Familia findByCodigo(Long codigo);
	public Familia save(Familia familia);
	public Familia updateFamilia(Familia familia);
	public boolean findByExisteCodigo(Long codigo);
	public void eliminar(Familia familia);
 
}
