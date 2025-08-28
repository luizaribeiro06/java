import models.Cliente;

public class Main {
    public static void main(String[] args) {
        //POO - conceitos + aprofundados
        //construtores, inicialização de dados e encapsulamento

        //construtores
        //não tem retorno especificado, somente o própri nome da classe
        //bloco de código especial dentro de uma classe, designado para inicializar novos objetos

        //quando já temos o construtor feito, precisa passar os parâmetros que ele pede
        Cliente clienteA = new Cliente("Luiza Ribeiro", "111.111.111-11");
        Cliente clienteB = new Cliente("José Souza", "111.111.111-11");

        //trabalhando com repositórios não inicializados
        //não inicialia os dados, deixa em espera e depois pode colocar, a qualquer momento
        //vantagem: dados não inicializados não irão ocupar espaço em memória até o momento em que for preenchido
        Cliente clienteC;

        //trabalhando com repositórios inicializados
        String nome = "Luiza";
        String cpf = "111.111.111-11";
        Cliente clienteD = new Cliente(nome, cpf);

        //se colocar true ele vai retornar o que pediu, e false não
        System.out.println(clienteD.getNome(true));
    }
}