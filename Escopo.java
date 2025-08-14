import java.util.ArrayList; //muitos tipos de coleção

public class Escopo {
    public static void main(String[] args) {
        //conjuntos que dao diferentes formas de atuação
        //trabalhando com () - abrigam tuplas (conjunto) de dados
        //aceita qualquer tipo de dado

        String nome = "Luiza";
        int idade = 19;
        float altura = 1.58f;
        System.out.println(nome + " " + idade + " " + altura);

        //trabalhando com [] - representam coleções de dados
        //um conjunto de dados de um mesmo tipo - {} na frente do tipo
        String[] frutasM = {"Morango", "Mamão", "Melancia"};

        //trabalhando com {} - representam um bloco de execução
        //tudo que estiver lá dentro será executado em ordem

        var horaDia = 10;
        if(horaDia < 18){
            System.out.println("Hora informada: " + horaDia);
            System.out.println("que dia lindo!");
        }
        else{
            System.out.println("Hora informada: " + horaDia);
            System.out.println("que noite linda!");
        }

        //trabalhando com diamante <> - dentro vem um tipo genérico
        //ex: quer fazer uma coleção de inteiros
        //nao da para adicionar varios valores de uma vez, só com for
        ArrayList<Integer> idadeFuncionarios = new ArrayList<>();
        idadeFuncionarios.add(40);
        idadeFuncionarios.add(30);
        idadeFuncionarios.remove(1); //fala o indice q quer remover
        System.out.println(idadeFuncionarios);

        //as coleções primitivas são estáticas, mas no arraylist pode diminuir/aumentar de tamanho
        //coleção primitiva: mais fácil e rápida de ser lida e feita
        //coleção arraylist: menor performance
    }
}
