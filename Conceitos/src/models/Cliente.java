package models;

//cliente será a classe mais abstrata
//dará origem a mais classes do projeto
public class Cliente {

    //DONE: Propriedades
    //simulando um cenário no banco
    private String numConta;
    private String dataAdesao;

    //DONE: Construtores
    //Alt + Insert -> abre a aba "Generate"
    public Cliente(String numConta, String dataAdesao) {
        this.numConta = numConta;
        this.dataAdesao = dataAdesao;
    }

    //DONE: Getters

    public String getNumConta() {
        return numConta;
    }

    public String getDataAdesao() {
        return dataAdesao;
    }

    //DONE: Setters

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setDataAdesao(String dataAdesao) {
        this.dataAdesao = dataAdesao;
    }

    //DONE: Métodos de classe
    public void imprimirDados(){
        System.out.println("====Dados do cliente=====");
        System.out.println("Número da conta: " + numConta);
        System.out.println("Adesão: " + dataAdesao);
        System.out.println("=========================");
    };

}
