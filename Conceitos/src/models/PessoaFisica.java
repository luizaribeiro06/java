package models;

//essa classe irá herdar de Cliente
//só pode trablhaar ocm herança simples, não pode herdar mais de uma classe
public class PessoaFisica extends Cliente{

    //DONE: Propriedades
    //lembrando que além dessas props aqui, existem as que herdou de cliente (as básicas)
    private String nome;
    private String cpf;

    //DONE: Construtores
    //ele busca todas as propriedades
    public PessoaFisica(String numConta, String dataAdesao, String nome, String cpf) {
        super(numConta, dataAdesao); //super faz a execução do construtor da classe pai
        this.nome = nome;
        this.cpf = cpf;
    }

    //TODO: Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    //TODO: Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //TODO: Métodos Sobrescritos
    //polimorfismo na prática, pois ele precisa pegar o método imprimirDados() da classe pai e adicionar mais coisa

    //Override: indica que o método é uma sobrescrita, mas a utilização é opcional
    //o @... é uma anotação, que pode ter um metadado (sendo obrigatória) ou apenas indicativa, como nesse caso
    @Override
    public void imprimirDados() {
        //o super também executa o método da classe pai
        //super.imprimirDados();

        System.out.println("====Dados do cliente=====");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        //foi necessário usar os getters pois eles são públicos, os atributos sozinhos não iam funcionar pois eles são privados, apenas da classe pai
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Adesão: " + getDataAdesao());
        System.out.println("=========================");
    }
}
