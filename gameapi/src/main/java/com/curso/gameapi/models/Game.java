package com.curso.gameapi.models;

import jakarta.persistence.*;
import java.time.Year;

@Entity //Responsável por levar uma classe como uma entidade para DB
public class Game {

    //Propriedades
    @Id //Indica chave primária - PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Indica campo auto-gerado
    private Integer id;

    @Column //Indica um campo/coluna em uma entidade
    private String title;

    @Column
    private String publisher;

    @Column
    private String gender;

    @Column
    private Year releaseYear;

    //Contrutores
    public Game(String title, String publisher, String gender, Year releaseYear) {
        this.title = title;
        this.publisher = publisher;
        this.gender = gender;
        this.releaseYear = releaseYear;
    }

    public Game() {
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

    public Year getReleaseYear() {
        return releaseYear;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setReleaseYear(Year releaseYear) {
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
