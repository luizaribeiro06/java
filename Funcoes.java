import org.w3c.dom.ls.LSOutput;

public class Funcoes {
    public static void main(String[]args) {
        //paradigma de programação: são formas de programar
        //programação estruturada: os elementos estão em uma ordem que será executada

        //programação funcional/procedural - programação orientada a função
        //a função main é o executável de uma aplicação java
        //a função println serve para exibir elementos via console (log de comunicação sistema - programador)

        primeiraFuncao();
        somar15mais15();
        soma(2,2);
        String pessoa = identificacao("Luiza", "Ribeiro"); //guarda o processamento do dado, que a função está processando, em uma variavel
        System.out.println(pessoa);

        float subtracaoA = subtrairValores(19.77f,4.55f);
        int subtracaoB = subtrairValores(10,20);
        System.out.println(subtracaoA);
        System.out.println(subtracaoB);
    }

    //agora saímos da função main para conseguir criar outras funções
    //criando uma primeira função
    //o que é uma função? um script de algumas instruções que podem ser utilizadas repetidas vezes (bloco de comando que se repete)

    //tem que chamar a função para ela funcionar

    //sintaxe: modificador retorno nome (parâmetros){instruções a serem executadas}
    //o modificador e a existência de parâmetors é opcionar, o resto é obrigatório
    //lowerCamelCase, sem acentuação as always

    //utilizando modificador, pode chamar uma função dentro de outra função
    //o modificador static torna uma função acessível dentro da própria classe
    //uma função não será do objeto, pode usufruir da funçao dentro da classe na qual ela foi criada
    static void primeiraFuncao(){
        System.out.println("Olá funções");
    }

    static void somar15mais15(){
        System.out.println(15+15);
    }

    //o princípio da orientação a objetos: criam-se classes para classificar objetos
    //não tem obrigatoriedade em relação ao tipo do retorno
    //parâmetros são dados pedidos pela função e devem ser argumentados quando a função é chamada (se tiver) - regras

    //diferença parâmetro e argumento
    //no momento em que preenchemos uma função, passamos argumentos que podem estar ou não dentro dos parâmetros
    //ex: vc preencheu com uma string onde tinha parametro de inteiro, logo, argumentou de forma errada (seu argumento está errado)

    //trabalhando com parâmetros
    static void soma(int num1, int num2){
        int res= num1 + num2;
        String resultado = String.format("A soma dos dois valores é: %s", res);
        System.out.println(resultado);
    }

    //trabalhando com retorno
    //nos dá a possibilidade armazenar valores de uma função em repositório (variável)
    //não utilizar retonno em todas as funções pois ele gera um dado a mais em memória, só cria se quiser utilizar o que será gerado na função no futuro

    static String identificacao(String nome, String sobrenome){
        String nomeCompleto = nome + " " + sobrenome;

        return nomeCompleto;
    }

    //trabalhando com sobrecarga de funções
    //sobrecarga é a habilidade de funções terem o mesmo nome, mas processarem dados de tipos diferentes

    static float subtrairValores(float valorA, float valorB){
        float resultado = valorA - valorB;

        return resultado;
    }

    //ou seja, só mudar o tipo do dado se quiser usar o mesmo nome da função
    static int subtrairValores(int valorA, int valorB){
        int resultado = valorA + valorB;

        return resultado;
    }

}
