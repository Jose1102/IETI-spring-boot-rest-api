package edu.escuelaing.ieti.microservicio.MicroUsuariosApp.controller;

import edu.escuelaing.ieti.microservicio.MicroUsuariosApp.data.User;
import edu.escuelaing.ieti.microservicio.MicroUsuariosApp.data.UserHash;
import edu.escuelaing.ieti.microservicio.MicroUsuariosApp.dto.UserDto;
import edu.escuelaing.ieti.microservicio.MicroUsuariosApp.repository.IBoardUser;
import edu.escuelaing.ieti.microservicio.MicroUsuariosApp.service.UserServiceHashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/user")
public class UserController {
	
	@Autowired
	private UserServiceHashMap servicio;
	
	@Autowired
	private IBoardUser usuario;
	

	@GetMapping
    ResponseEntity<List<User>> all() {
		List<User> listaUsuarios = usuario.findAll();
        return new ResponseEntity<List<User>>(listaUsuarios, HttpStatus.OK);
    }
	
	@GetMapping( value = "/{id}" )
    public ResponseEntity<Optional<User>> findById( @PathVariable Integer id )
    {
       //TODO implement this method using UserService
		Optional<User> user = usuario.findById(id);
		return new ResponseEntity<Optional<User>>(user, HttpStatus.OK);
     
    }
	
	@PostMapping
    public void create( @RequestBody User usuarioAgregar )
    {
		usuario.save(usuarioAgregar);
    }
}