import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //lambda é definida como uma função inline anônima que pode ser utilizada como valor para variavel ou parâmetro de uma função
        //otimizar código - be like atalho
        //SINTAXE:::   (parâmetros) -> {instruções}
        //o operador seta indica a utilização de uma lambda
        //todas as lambdas tem origem a partir de interfaces funcionais (apenas um métod0)

        //trabalhando com lambda built-in
        ArrayList<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Maçã");
        listaFrutas.add("Banana");
        listaFrutas.add("Abacaxi");
        //existefm duas possibilidades de rodas um array

        //sintaxe completa
        listaFrutas.forEach((umaFruta)->{
            System.out.println(umaFruta);
        });
        //consumer (dentro do forEach) - interface funcional

        //podemos suprimir os () quando tivermos apenas um parâmetro:::fica assim ->{instruções}

        //podemos suprimir as {} quando tivermos apenas uma instrução:::fica assim (parâmetros) -> instrução direta(tipo o print ali acima, sem utilizar as chaves)

        //em alguns casos, podemos utilizar um métod0 de referência
        //sintaxe: NomeClasse:: métod0
        listaFrutas.forEach(System.out::println); //classe e métod0

        //utilizando interfaces funcionais com lambdas
        Ola primeiraLambda = () -> {
            System.out.println("Minha primeira lambda.");
        };
        primeiraLambda.mensagem();

        //utilizando lambda customizada com um parâmetro
        //nota-se que lá na interface Impressora está pedindo String obrigatoriamente como param, logo::
        Impressora impA = conteudo -> {
            System.out.println(conteudo);
        };
        impA.imprimir("Um Texto Qualquer");

        //trabalhando com múltiplos parâmetros e múltiplas instruções
        //não precisam ser os mesmos nomes dos parametros do arquivo, só importa a ordem e qtd
        Identidade docA = (numeroRG, numeroCPF) -> {
            System.out.println("RG: " + numeroRG);
            System.out.println("CPF: " + numeroCPF);
        };
        docA.identificar("00.000.000-0", "111.111.111-11");

        //alternativa para POO
        SomaInterface soma = (valorA, valorB) -> {
            int resultado = valorA + valorB;
            System.out.println(resultado);
        };
        soma.calcular(10,10);
    }
    //limitações da lambda:::
    //não podem ter nomes explícitos
    //só pode implementar interfaces funcionais
    //não é ideal para operações grandes
}