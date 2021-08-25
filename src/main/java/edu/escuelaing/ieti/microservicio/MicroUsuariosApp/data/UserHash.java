package edu.escuelaing.ieti.microservicio.MicroUsuariosApp.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class UserHash {
	
	private Map<Integer, User> mapaDeUsuarios = new HashMap<>();
	private int valorLlaveActual = 0;

	public Map<Integer, User> getMapaDeUsuarios() {
		return mapaDeUsuarios;
	}

	public void setMapaDeUsuarios(Map<Integer, User> mapaDeUsuarios) {
		this.mapaDeUsuarios = mapaDeUsuarios;
	}
	
	public void setValorLlave(int valor) {
		valorLlaveActual= valor;
	}
	
	

}
