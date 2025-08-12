import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //repositorio: local que tem end especifico na memoria (memoria be like gaveteiro)
        //local memoria com conteudo e endere~ço (não se modifica ao longo do processo
        // (a variavel é o ato de criar um espaço em memoria para armazenar dados)
        //se interromper a aplicação, o espaço limpa (é volátil)
        var nome = "luiza"; //a jvm joga nas gavetas e guarda o dado la dentro para ficar armazenado

        //tipos explícitos de variaveis: inicia-se pelo tipo de dado a qual ela pertence
        //não tem como modificar esse tipo até o final da aplicação
        int idade = 50;
        String diaSemana = "quarta-feira";

        //infereência automática de tipos: inicia-se com var, não informa o tipo
        var umTexto = "um texto";

        //como consegue então fazer essa inferência automatica de tipo?
        //ele vai entender com base no valor ("": string .f:float 4:inteiro)
        //a utilização do var só é possível a partir do java11

        //palavras reservadas:: normalmente ficam na cor laranja
        //não pode criar uma variavel chamada var, int,
        //int String = "fslfl" tbm nao

        //tipos primitivos de dados não são classes, não da objetos
        //quando cria um int, não está criando uma instância
        //inteiros
        byte numByte = 10; //menor tipo de dado para armazenar numero, ocupa 1 byte (cnsegue até 127)
        short numShort = 1000; //-32000 até 32000..
        int numInt = 10000; //até 2 bilhões
        long numLong = 100000; //+ trilhão

        //decimais
        float decFloat = 7.85459f; //até 7 casas decimais e obrigatoriamente precisa da letra f no final
        double decDouble = 7.656665656f; //armazena o dobro (15 casas) e o uso do "d" no final é opcional

        //menor tipo de dados q existe: boolean
        boolean verdFalse = true; //varia true or false

        //armazena apenas um símbolo ou letra
        //é um dos mais importantes pois quando cria uma coleção, cria-se uma String
        char caractere = 'a'; //não consegue escrever com aspas duplas pois estão reservadas para String

        //como as variáveis funcionamw
        //declaradas, quando executadas armazenadas em memoria ram, conforme solicitadas são usadas
        //são mutaveis (podem ter o seu valor modificado durante a aplicação)

        //criando variaveis finais: não podem ser modificadas
        final int anoIndependencia = 1822; //esse valor não deve ser modificado, então coloca final no inicio

        //alternativas para ""modificar"" a final: criando uma auxiliar

        //trabalhando com valores nulos
        //quer criar um repositorio de dados e não sabe ainda qual valor colocar
        //tomar cuidado com null pois as vezes ele ta esperando um determinado valor e veio nulo, então quebra
        String numDocumento = null;

        //uma string vazia é diferente de estar em branco " ": isBlank or isEmpty para verificar
        //uma coisa nula é nula, é diferente de tudo isso
        //CODING STYLE - Camel Case - questão de ser convencional
        //quando é nome composto separa uma palavra da outra com uma letra em maiúsculo
        String primeiroNome = "antonio";

        //variaveis: lowerCamelCase
        //funções/métodos: lowerCamelCase
        //classes e afins: UpperCamelCase
        //elementos de enum: UPPERCASED_PASCAL_CASE (NOME_DO_ELEMENTO)

        //geralmente codamos da mesma forma com que linguagem e escrita

        //wrappers - são classes q dao mais funcionalidades e caracteristicas para os primitivosm mas sao mais letos
        //todos elementos primitivos são super limitados em alguns aspectos, mas são muito rápidos pois nasceram paa trabalhar na jvm
        Integer numeroInteiro = 10;
        //conforme a evolução da linguagem de programação
        //estruturada --> pré compilada --> orientada a objeto (cada primitivo ganhou uma classe, tudo só q com a Primeira letra maiúscula)

        ArrayList <String> listaFrutas = new ArrayList<>(); //s[o consegue travbalhar com tipo, e não primiritvo
        //tem casos q so conseguem aceitar ujm
    }
}