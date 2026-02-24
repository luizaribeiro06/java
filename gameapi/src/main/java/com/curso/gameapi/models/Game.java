package com.curso.gameapi.models;

import jakarta.persistence.*;

import java.time.Year;

//responsável por levar uma classe como uma entidade para o banco de dados
@Entity
public class Game {

    //Propriedades

    @Id //indica chave primária (PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //indica campo auto-gerado
    private Integer id;

    @Column //indica um campo/coluna em uma entidade
    private String title;

    @Column
    private String publisher;

    @Column
    private String gender;

    @Column
    private Year releaseYear;

    //Construtores
    public Game(String title, String publisher, String gender, Year releaseYear) {
        this.title = title;
        this.publisher = publisher;
        this.gender = gender;
        this.releaseYear = releaseYear;
    }

    //Getters
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGender() {
        return gender;
    }

    public Year getYear() {
        return releaseYear;
    }

    //Setters (menos do ID pois quem irá tomar conta é o banco de dados)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setYear(Year releaseYear) {
        this.releaseYear = releaseYear;
    }

    //Métodos sobrescritos
    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + releaseYear +
                '}';
    }
}
