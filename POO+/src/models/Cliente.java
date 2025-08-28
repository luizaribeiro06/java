package models;

//só permite que seja acessada dentro do próprio pacote em que ela foi criada
//para classe tem default | public
public class Cliente {

    //TODOs
    //1. propriedades
    //ao privar propriedades, está sendo iniciado o processo de encapsulamento
    //se quiser pode condicionar o acesso à esses dados
    //private - só pode ser utilizado em uma classe
    private String nome;
    private String cpf;

    //2. construtores - ajudam a construir um objeto que n tenha nenhuma info em nulo (obriga o preenchimento dos dados no momento em que ele é criado)
    //sintaxe: NomeIgualAoDaClasse(){}

    //construtor padrão que é gerado automaticamente
    public Cliente(String nome, String cpf){
        //passar cada parâmetro para sua propriedade correspondente
        //utilizamos a palavra reservada this para indicar a propriedade
        this.nome = nome; //desta classe está recebendo a propriedade nome
        this.cpf = cpf;
    }

    //3. métodos GETTER - permitem fazer a leitura de um dado privado

    //so vai conseguir fazer o get do nome se for gerente, por ex
    public String getNome(boolean eGerente) {
        if(eGerente){
            return nome;
        }
        else{
            return "Acesso não permitido.";
        }
    }

    public String getCpf(boolean eGerente) {
        if(eGerente){
            return nome;
        }
        else{
            return "Acesso não permitido.";
        }
    }

    //4. métodos SETTER - permitem fazer a modificação de um dado privado
    public void setNome(boolean eGerente, String novoNome){
        if(eGerente){
            //vai pegar dessa classse o nome e colocar um novo
            this.nome = novoNome;
        }
        else{
            System.out.println("Acesso não permitido");
        }
    }

    public void setCpf(boolean eGerente, String novoCpf){
        if(eGerente){
            //vai pegar dessa classse o nome e colocar um novo
            this.cpf = novoCpf;
        }
        else{
            System.out.println("Acesso não permitido");
        }
    }

    //5. métodos próprios
    void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
