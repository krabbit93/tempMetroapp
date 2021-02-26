package com.arkon.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.arkon.dao.DatosUnidadesDao;
import com.arkon.dao.UnidadesDao;
import com.arkon.model.DatosUnidades;
import com.arkon.model.Resp;
import com.arkon.model.Unidades;
import com.arkon.Constantes;

@RestController
@RequestMapping("metrobus")
public class UnidadesRest {

	@Autowired
	private UnidadesDao unidadesDao;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private DatosUnidadesDao datosUnidadesDao;

	
@PostMapping("/save")
public void guardar (@RequestBody Unidades unidades) {
	unidadesDao.save(unidades);
} 

@GetMapping("/leer")
public List<DatosUnidades> listar(){
	ArrayList<DatosUnidades> datos = new ArrayList<>();
	if (conectar()) {
	System.out.println("La conexion con el servidor fue SUCCES");
	datos.addAll(datosUnidadesDao.findAll());
	List<DatosUnidades> consulta = (ArrayList<DatosUnidades>) datos.stream().filter	(e -> e.getVehicle_current_status().equals(2)).collect(Collectors.toList());
	System.out.println("Consulta:::"+consulta.size());
return consulta;
}else
	System.out.println ("La conexion con el servidor fue ERROR, No existen coincidencia");
	datos.set(0, null);
	return datos;
}
@GetMapping("/buscar/{id}")
public List<DatosUnidades> buscar(@PathVariable ("id") Integer id){
	System.out.println("Entrando abuscar");
	ArrayList<DatosUnidades> resultado = new ArrayList<>();
try {
	List<DatosUnidades> consulta = (ArrayList<DatosUnidades>) (datosUnidadesDao.findAll()).stream().filter	(e -> e.getId().equals(id)).collect(Collectors.toList());
	resultado.addAll(consulta);

	} catch (Exception e2) {
		System.err.println("Error en el servidor");
		System.out.println(e2);
	}
	System.out.println("Resultado0 de  los datos de la lista "+resultado);
	return resultado;
}

public boolean conectar () {
	ResponseEntity<Resp> respuesta=null;
	ResponseEntity<List<Resp>> respuestaFinal =null;
	Boolean capa = false;
	try {
		ResponseEntity<Resp> response =
				restTemplate.getForEntity(Constantes.URL_API_MB, Resp.class);
		System.out.println("Respuesta del response  "+response.getBody());
		respuesta = response;
		datosUnidadesDao.saveAll(response.getBody().getResult().getRecords());
		System.out.println("Guardando registros en la base de datos");
	} catch (Exception e) {
		System.out.println("Error en el servicio");
		System.out.println("Exception :::"+e);
	}
	if (respuesta.getStatusCodeValue()==200) {
		System.out.println("URL del servicio :::"+Constantes.URL_API_MB);
		System.out.println("Respuesta de Status... .... "+respuesta.getStatusCodeValue());
		System.out.println("Tamanio de la lista ." +respuesta.getBody().getResult().getRecords().size());
		System.out.println("Respuesta final::: "+respuestaFinal);
        return true;		
	}else {	
		System.out.println("Respuesta de Status... NO JALO"+respuesta.getStatusCodeValue());
		capa=false;
   return false;
	}
}


}
