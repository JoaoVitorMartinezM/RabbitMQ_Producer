package com.example.rabbitmq_producer.service;

import com.example.rabbitmq_producer.model.Pessoa;
import com.example.rabbitmq_producer.repository.PessoaRepository;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repo;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public Pessoa cadastra(Pessoa pessoa){
        Message mensagem = new Message("Pessoa cadastrada com o CPF ".concat(pessoa.getCpf().toString()).getBytes() );
        rabbitTemplate.send("pessoa.ok", mensagem);
        return repo.save(pessoa);

    }
}
