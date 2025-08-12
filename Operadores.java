import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        //atriuindo valores - operador =
        //é opcional, precisa estar antes de quem vai dar valor
        var dado = 10;
        dado = 11;
        dado = 12;

        //operadores matemáticos + - * /
        //só pode operar elementos do mesmo tipo
        var som = 10 + 10;
        var sub = 20 - 10;
        var mul = 3 * 3;
        var div = 30 / 10;

        //atribuindo e operando simultaneamente
        var valorA = 10;
        valorA = valorA + 10;
        System.out.println(valorA);

        //de uma forma mais otimizada (igual python)
        valorA += 10; //pode fazer outros operadores tbm
        System.out.println(valorA);

        //incremento e decremento ++ --
        //conta de 1 em 1
        var valorB = 20;
        valorB ++; //soma 1
        valorB --; //tira 1
        System.out.println(valorB);

        //comparação == != > < >= <=
        //apenas para tipos primitivos de dados
        //gera true or false (boolean)
        var compA = 10;
        var compB = 10;

        System.out.println(compA == compB); //igualdade
        System.out.println(compA != compB); //diferente
        System.out.println(compA < compB);  //menor que
        System.out.println(compA > compB);  //maior que
        System.out.println(compA <= compB); //menor ou igual que
        System.out.println(compA >= compB); //maior ou igual que

        //classificação
        var unario = -10; //age apenas em um valor, o operador - age de um lado só do valor
        var binario = 10 + 10; //age entre dois valores
        //trabalha com a decomposição de 3 etapas -> if expressão booleana ? resultado verdadeiro : resultado falso
        var ternario = (10 > 11) ? "Dez é maior" : "Dez é menor";
        System.out.println(ternario);

        //ex: desenvolva um algoritmo utilizando apenas operadores unarios, binarios e ternarios, onde seja verificada se uma determinada idade está apta para tirar habilitação
        // + leitura de dados para pegar a informação
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        var habilitacao = (18 <= idade) ? "Você está apto a dirigir" : "Você não está apto a dirigir";
        System.out.println(habilitacao);

        //operador lógico: AND &&, OR ||, NOT !(expressão)
        System.out.println('a' == 'a' && 10 > 9); //AND PRECISA SER OS DOIS TRUE
        System.out.println('a' == 'a' || 10 > 11); //OR PRECISA SER APENAS UM TRUE
        System.out.println(!('a' == 'a')); //NEGA A EXPRESSÃO
    }
}
