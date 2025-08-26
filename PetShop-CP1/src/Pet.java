public class Pet {
    int id;
    String nome;
    String raca;
    String cor;
    int idade;

    void imprimirDados(){
        System.out.println("=====================");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
        System.out.println("=====================");
        System.out.println("");
    }
}