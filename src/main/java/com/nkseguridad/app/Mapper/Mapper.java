package com.nkseguridad.app.Mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Kardex;
import com.nkseguridad.app.Model.MArticuloKardex;
import com.nkseguridad.app.Model.MKardex;
import com.nkseguridad.app.Service.IArticuloService;

@Component("mapper")
public class Mapper {
	
	
	public static MKardex convertirKardex(Kardex kardex){		
		return new MKardex(kardex);		
	}
	
	public static MArticuloKardex convertirArticuloKardex(Articulo articulo){		
		return new MArticuloKardex(articulo);		
	}

}
