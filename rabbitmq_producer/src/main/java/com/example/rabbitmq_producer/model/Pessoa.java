package com.example.rabbitmq_producer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "PESSOAS")
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

    @Id
    private Long cpf;

    private String nome;

    private String sobreNome;
}
