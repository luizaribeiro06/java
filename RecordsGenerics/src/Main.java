import models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //swift - linguagem da apple
        //struct é uma classe rápida (providencia toda estrutura necessária para uma classe existir) - records em java

        //criando objetos baseados em records
        Documento docA = new Documento("000.000.000-00", "00.000.000-0");
        //docA.cpf() = "111"; -> não consegue acessar pois é imutável, só consegue imprimir/captar
        System.out.println(docA.cpf());
        System.out.println(docA.rg());

        //o <> é um indicativo da utilização de genéricos
        //trabalhando com genéricos - simula um outro tipo (age como se fosse esse otro tipo)
        ArrayList<String> beatles = new ArrayList<>();
        beatles.add("John");
        beatles.add("Paul");
        beatles.add("George");
        beatles.add("Ringo");

        //classes genéricas podem ser criadas

        //trabalhando com tipos sem genéricos
        ImpressoraString dadoA = new ImpressoraString("Teste");
        dadoA.imprimirDado();

        ImpressoraInteger dadoB = new ImpressoraInteger(10);
        dadoB.imprimirDado();

        //utilizando impressora genérica
        //só vai imprimir classe, não trabalha com primitivos
        ImpressoraGenerica<String> dadoC = new ImpressoraGenerica<>("Texto");
        dadoC.imprimirDado();

        ImpressoraGenerica<Float> dadoD = new ImpressoraGenerica<>(18.8f);
        dadoD.imprimirDado();

        //utilizando coordenadas
        Coordenadas<String, Integer> coordA = new Coordenadas("245", 444);

    }
}