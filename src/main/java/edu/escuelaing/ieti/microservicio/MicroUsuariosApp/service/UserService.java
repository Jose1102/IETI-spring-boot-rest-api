package edu.escuelaing.ieti.microservicio.MicroUsuariosApp.service;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import edu.escuelaing.ieti.microservicio.MicroUsuariosApp.data.User;


@Component
public interface UserService {
	
	User create( User user );

    User findById( String id );
    
    List<User> all();

    void deleteById( String id );

    User update( User user, String userId );

}
