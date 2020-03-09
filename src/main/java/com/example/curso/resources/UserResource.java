package com.example.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso.entities.User;

//Recursoweb que é implementado por um controlador Rest
@RestController
//Nome pro recurso, ("caminho do recurso")
@RequestMapping(value = "/users")
public class UserResource {
	
	
	//endpoint pra acessar os usuários
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria","maria@gmail.com","99999999","123456");
		
		return ResponseEntity.ok().body(u);
		
		
	}
	
	
}
