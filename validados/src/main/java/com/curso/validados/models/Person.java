package com.curso.validados.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Person {

    //Propriedades
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Nome não pode ser em branco.") //não irá aceitar em branco com msg customizada da exception
    private String name;

    @Min(value = 0, message = "A idade deve ser no mínimo 0.")
    private int age;

    @Email(message = "O email deve ser válido")
    private String email;

    @Pattern(regexp = "\\d{11}", message = "O CPF deve ter 11 dígitos.")
    private String cpf;

    //genérico nao aceita tipo primitivo, por isso temos q passar Integer emid por ex

    //Construtores

    public Person(String name, int age, String email, String cpf) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.cpf = cpf;
    }

    public Person() {
    }

    //Getters

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //ToString
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
