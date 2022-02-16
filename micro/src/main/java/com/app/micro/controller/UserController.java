package com.app.micro.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.micro.modelo.User;
import com.app.micro.service.UserService;

import java.util.List;


@RestController
public class UserController {

	@Autowired
	UserService userS ;
	
	
	
	@RequestMapping(value = "/getDatos", method = RequestMethod.GET)
    public List <User> getAllUsers() {
        return userS.getAllUsers();
    }
	
	@RequestMapping(value = "/{valor}", method = RequestMethod.GET)
	@ResponseBody()
    public User  getUser(@PathVariable Integer valor) {
        return userS.buscarByYear(valor) ;
    }
	
	
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody()
    
    public User addNewUser(@RequestBody String str) {
    	
    	JSONObject json = new JSONObject(str);
    	User user = new User();
    	
    	user.setYearUvt(Integer.parseInt(json.get("yearUvt").toString()));
    	user.setValUvt(Float.parseFloat(json.get("valUvt").toString()));
    	user.setUsrRadic(json.get("usrRadic").toString());
    	user.setUsrGestor(json.get("usrGestor").toString());
    	user.setSolicitud(json.get("solicitud").toString());
    	user.setFecha(json.get("fecha").toString());
    	user.setAccEstados(Integer.parseInt(json.get("accEstados").toString()));
    
    	return this.userS.addUser(user);
    }
    
    @RequestMapping(value = "/update/{valor}", method = RequestMethod.POST)
    @ResponseBody
    
    public User filtrar (@PathVariable Integer valor, @RequestBody String str) {
    	
    	User user = new User();
    	JSONObject json = new JSONObject(str);
    	
    	user = userS.buscarByYear(valor);
    	user.setSolicitud(json.toString());
    	return userS.addUser(user);
    }
    
    @RequestMapping(value = "/actualizar/{valor}", method = RequestMethod.POST)
    @ResponseBody
    
    public void actualizar(@PathVariable Integer valor, @RequestBody String json) {
    	userS.actualizarJson(json, valor);
    }
}
