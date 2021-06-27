package com.gabriel.jwtspringboot.controller;

import com.gabriel.jwtspringboot.entity.User;
import com.gabriel.jwtspringboot.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    UserRepository repository;

    @PostMapping("/usuarios")
    public ResponseEntity<User> adicionaUsuario(User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(user));
    }

    @GetMapping("/usuarios/{id}")
    public ResponseEntity<User> retornaUsuario(@PathVariable("id") Long id) {

    }
}
