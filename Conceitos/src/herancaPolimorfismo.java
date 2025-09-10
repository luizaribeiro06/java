import models.PessoaFisica;
import models.PessoaJuridica;

public class herancaPolimorfismo {
    public static void main(String[] args) {
        //herança - criar novas classes com base em classes q ja existem permitindo a hierarquia de aspectos dos objetos, evita a duplicação
        //precisa criar uma nova classe (extend) a partir da classe pai, herdando as características da do pai

        //polimorfismo - trata objetos de diferentes classes de maneira uniforme
        //criar/modificar os comportamentos dos métodos herdados pela super classe
        //pode atuar de diferentes formas, mas mantendo o mesmo nome]
        //nome de pacote - minúsculo e preferencialmente no plural
        //nome de classe - primeira letra maiúscula e no singular (cada objeto)
        //usar TODO:Coisas a serem feitas

        //CRIANDO OBJETOS
        PessoaFisica pessoaFisicaA = new PessoaFisica(
                //precisa preencher na ordem que está no construtor
                //no construtor, existe a obrigatoriedade de preenchimento, então precisa passar tudo aqui
                "0000-00",
                "22/02/2022",
                "Luiza Ribeiro",
                "000.000.000-00"
                //não colocar vírgula no final
        );
        pessoaFisicaA.imprimirDados();

        PessoaJuridica pessoaJuridicaA = new PessoaJuridica(
          "1111-11",
          "25/02/2022",
          "LuizaLTDA",
          "00.000.000/0001-0"
        );
        pessoaJuridicaA.imprimirDados();
    }

}