package com.blackcode.veterinaria.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackcode.veterinaria.entities.User;

// Prove recursos de interface web para a aplicação
@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	// Método para acessar os dados dos usuários
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@maria.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
