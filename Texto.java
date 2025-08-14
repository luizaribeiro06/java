//string
public class Texto {
    public static void main(String[] args) {
        //tipos primitivos - aqueles que começam com a letra minúscula

        int numInt = 10000;
        float decFloat = 7.85459f;
        char caractere = 'b';

        //trabalhando com classe - letra maiúscula
        //String - é a classe para se trabalhar com textos ""
        //até 67 mil caracteres é a recomendação
        //tentar evitar strings vazias ou em branco pois irá retornar aquilo

        String umTexto = "UmTexto";

        //forma 1 - String com conteúdo
        String comConteudo = "Com conteúdo";

        //forma 2 - String vazia (ainda assim é uma String)
        String vazia = "";

        //forma 2 - String em branco (um ou vários espaços em branco)
        String emBranco = " ";

        //problemas com string - dados que a string recebe, mas são de outros tipos
        String data = "08/10/1998";
        String numInteiro = "10";
        String numDecimal = "77.99";

        //numeros inteiros não podem ser começados por 0 e não é possível inserir vários pontos, nem possuir um caractere especial, logo, nesse caso cabe se ruma String
        String cpf = "011.987.678-00";

        //o que vai ppassar do 16, são os caracteres acentuados, marca registrada, etc
        //o tipo char e o boolean também é um tipo numérico (usando apenas 1 byte)
        //serve como base de string
        char texto = 'b';
        char numero = 35; //caractere da tabela ASCII, nesse caso é uma #

        //criando uma string
        char char1 = 'f';
        char char2 = 'i';
        char char3 = 'a';
        char char4 = 'p';

        String fiap = "" + char1 + char2 + char3 + char4;
        System.out.println(fiap);

        //pode acessar com índice, como se fosse um array
        //uma string sempre vai ocupar espaço de muitos caracteres mesmo tendo poucos

        //comparação entre strings NÃO UTILIZAR == para comparar classes
        String compA = "um texto";
        String compB = "Um texto";
        System.out.println(compA.equals(compB)); //ele compara o endereço de memoria, retorna true or false

        //java é 100% case sensitive, faz o comparativo das letras maiúsculas e minúsculas, então s textos podem ser iguais, mas se tiver uma letra maiúscula/minúscula irá retornar como falso pois na tabela são caracteres diferentes

        String transA = compA.toUpperCase();
        String transB = compB.toUpperCase();
        System.out.println(transA.equals(transB));

        //alguns métodos
        String testando = "testando";

        //está vazia?
        System.out.println(testando.isEmpty());

        //está em branco?
        System.out.println(testando.isBlank());

        //verificando se uma String tem um fragmento de texto
        System.out.println(testando.contains("ando"));

        //verificando o tamanho de uma string com base na qtd de caracteres
        System.out.println(testando.length());

        //verificando o primeiro caractere
        //a partir de uma versão recente do java(21 ou 24), nasceu o método .first() - mesma função
        System.out.println(testando.charAt(0)); //acessando com índice

        //verificando o último caractere
        //.last()
        System.out.println(testando.charAt(testando.length() - 1));

        //verifica um intervalo de caracteres dentro de uma String
        System.out.println(testando.substring(0, 3));

        //deixar tudo maisúculo
        System.out.println(testando.toUpperCase());

        //deixar tudo minúsculo
        System.out.println(testando.toLowerCase());

        //trabalhando com a emenda de texto -
        String nome = "Luiza";
        String sobrenome = "Ribeiro";

        //forma 1 - concatenação
        String nomeCompleto = (nome + " " + sobrenome);
        System.out.println(nomeCompleto);

        //forma 2 - interpolação .format()
        //os fragmentados de texto a serem inseridos, devem ser indicados com o scape %s
        String formatada = String.format("Olá, meu nome é %s, e meu sobrenome é %s", nome, sobrenome);
        //depois de forma ordenada, indica oq será inserido
        System.out.println(formatada);

        //trabaho com blocos de texto
        String blocoTexto = """
                oii, isso é tipo a documentação
                em python
                """;
    }
}

