package models;

public class Pessoa {

    //Propriedades
    String nome;
    Integer idade;


    //Construtores

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = idade;
    }


    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    //Métodos sobrescritos

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}