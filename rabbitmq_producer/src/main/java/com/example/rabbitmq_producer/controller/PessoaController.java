package com.example.rabbitmq_producer.controller;

import com.example.rabbitmq_producer.model.Pessoa;
import com.example.rabbitmq_producer.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public ResponseEntity cadastra(@RequestBody Pessoa pessoa){


        return ResponseEntity.ok(service.cadastra(pessoa));
    }
}
