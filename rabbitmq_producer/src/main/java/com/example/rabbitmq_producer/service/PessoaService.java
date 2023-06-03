package com.example.rabbitmq_producer.service;

import com.example.rabbitmq_producer.model.Pessoa;
import com.example.rabbitmq_producer.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repo;

    public Pessoa cadastra(Pessoa pessoa){
        return repo.save(pessoa);

    }
}
