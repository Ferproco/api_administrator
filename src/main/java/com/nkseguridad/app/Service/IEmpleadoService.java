package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Empleado;

public interface IEmpleadoService {
	public List<Empleado> findAll();
	public Empleado findByCodigo(Long codigo);
	public List<Empleado> findAllTipoEmpleado(Long Tipo);
	public Empleado findByNumeroIdentificacion(String numero);
	public Empleado save(Empleado empleado);
	public void eliminar(Empleado empleado);
}
