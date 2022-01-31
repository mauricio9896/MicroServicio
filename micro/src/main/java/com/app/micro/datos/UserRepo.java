package com.app.micro.datos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.micro.modelo.User;


@Repository
public interface UserRepo extends JpaRepository < User, Integer > {
	
}

