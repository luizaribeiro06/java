public class introTexts {
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

        //método toString() transforma em string
    }
}
