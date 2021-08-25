package edu.escuelaing.ieti.microservicio.MicroUsuariosApp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.escuelaing.ieti.microservicio.MicroUsuariosApp.data.User;
import edu.escuelaing.ieti.microservicio.MicroUsuariosApp.data.UserHash;


@Service
public class UserServiceHashMap implements UserService{
	
	@Autowired
	private UserHash mapaUsuarios;

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> all() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User update(User user, String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
