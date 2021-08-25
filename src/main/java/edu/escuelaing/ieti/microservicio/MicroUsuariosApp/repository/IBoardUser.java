package edu.escuelaing.ieti.microservicio.MicroUsuariosApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.escuelaing.ieti.microservicio.MicroUsuariosApp.data.User;

public interface IBoardUser extends JpaRepository<User,Integer>{

}
