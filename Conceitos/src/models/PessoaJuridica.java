package models;

public class PessoaJuridica extends Cliente{

    //DONE: Propriedades
    private String razaoSocial;
    private String cnpj;

    //DONE: Construtores
    public PessoaJuridica(String numConta, String dataAdesao, String razaoSocial, String cnpj) {
        super(numConta, dataAdesao);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    //DONE: Getters

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    //DONE: Setters
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    //TODO: Métodos Sobrescritos

    @Override
    public void imprimirDados() {
        System.out.println("====Dados do cliente=====");
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Adesão: " + getDataAdesao());
        System.out.println("=========================");
    }
}

