package com.app.micro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.micro.datos.UserRepo;
import com.app.micro.modelo.User;

@Service
public class UserService {
    @Autowired
    UserRepo userDatos;

    public List<User> getAllUsers() {
        return this.userDatos.findAll();
    }

    public User addUser(User user) {
        return this.userDatos.save(user);
    }
    
    public User buscarByYear(int valor) {
    	return this.userDatos.findByYearUvtEquals(valor);
    }
    
    public void actualizarJson(String path, int valor) {
    	this.userDatos.serializar(valor);
    	this.userDatos.actualizar(path, valor);
    }
}