package com.aula.poo.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@AllArgsConstructor // construtor
@NoArgsConstructor // construtor vazio
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue
    Long id;
}
