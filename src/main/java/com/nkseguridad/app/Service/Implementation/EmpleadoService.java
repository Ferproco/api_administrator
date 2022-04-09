package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Contacto;
import com.nkseguridad.app.Entity.Empleado;
import com.nkseguridad.app.Repository.IEmpleadoRepository;
import com.nkseguridad.app.Service.IEmpleadoService;

@Service
public class EmpleadoService implements IEmpleadoService {

	
	@Autowired
	private IEmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado> findAll() {
		// TODO Auto-generated method stub
		return (List<Empleado>)empleadoRepository.findAll();
	}

	@Override
	public Empleado findByCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(codigo).orElse(null);
	}

	@Override
	public List<Empleado> findAllTipoEmpleado(Long Tipo) {
		// TODO Auto-generated method stub
		if (Tipo == 3)
			return (List<Empleado>)empleadoRepository.findAll();
		else
			return (List<Empleado>)empleadoRepository.findByCodtipoempleado(Tipo);
	}

	@Override
	public Empleado findByNumeroIdentificacion(String numero) {
		// TODO Auto-generated method stub
		return empleadoRepository.findByNumeroidentificacion(numero);
	}

	@Override
	public Empleado save(Empleado empleado) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(empleado);
	}

	@Override
	public void eliminar(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoRepository.delete(empleado);
	}
	

}
