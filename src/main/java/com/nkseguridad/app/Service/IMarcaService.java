package com.nkseguridad.app.Service;

import java.util.List;


import com.nkseguridad.app.Entity.Marca;

public interface IMarcaService {
  public List<Marca> findAll();
  public Marca save(Marca marca);
  public boolean findByExisteCodigo(Long codigo);
}
