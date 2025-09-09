import java.util.ArrayList;

public class wrapperCasting {
    public static void main(String[] args) {

        //Tipos Primitivos
        //Vantagem: Performance maior
        //Desvantagem: Baixo poder de modificação e manipulação
        byte valorByte = 10;
        short valorShort = 100;
        int valorInt = 10000;
        long valorLong = 1000000;
        float valorFloat = 10.5f;
        double valorDouble = 11.555d;
        boolean valorBool = true;
        char valorChar = 'A';

        //Trabalhando com Wrappers - classes empacotadoras (só consegue pegar um número dentro de um texto e trazer para dentro do numero com o parse..)
        //Vantagem: Alto poder de modificação e manipulação
        //Desvantagem: Performance menor
        Byte wrapByte = 10;
        Short wrapShort = 100;
        Integer wrapInt = 10000;
        Long wrapLong = 1000000L; //L é obrigatório
        Float wrapFloat = 10.5f; //f é obrig
        Double wrapDouble = 18.555d;
        Boolean wrapBool = true;
        Character wrapChar = 'T';

        //Onde Utilizar Wrappers?
        //só consegue trabalhar com arraylist se passar uma classe como argumento
        //- Array de java.util só podem utilizar objetos
        ArrayList<Integer> umArray = new ArrayList();

        //- Para fazer parses de dados em String
        //ALERTA!!! A formatação da string deve estar de
        // acordo com o tipo desejado
        Byte byteFromString = Byte.parseByte("10");
        Short shortFromString = Short.parseShort("100");
        Integer intFromString = Integer.parseInt("10000");
        Long longFromString = Long.parseLong("1000000");
        Float floatFromString = Float.parseFloat("10.89");
        Double doubleFromString = Double.parseDouble("88.66");
        Boolean boolFromString = Boolean.parseBoolean("werkjhkqwrej");
        System.out.println(boolFromString);

        //- Criando objetos a partir de valores primitivos
        Byte byteFromByte = Byte.valueOf(valorByte);
        Short byteFromShort = Short.valueOf(valorShort);
        Integer integerFromInt = Integer.valueOf(valorInt);
        Float floatFromFloat = Float.valueOf(valorFloat);
        Double doubleFromDouble = Double.valueOf(valorDouble);
        Boolean boolFromBool = Boolean.valueOf(valorBool);
        Character characterFromCharacter = Character.valueOf(valorChar);

        //type casting - mudannça de tipos de dados
        //widening casting - automática - menor para o maior
        //consegue apenas colocar o menor dentro de maior, jamais ao contrário (ex sala)
        //ocorre automaticamente
        //se torna eficiente quando precisa trabalhar com vários dados e usar o mesmo tipo, melhorando a robustez e faciitando a manutenção

        //encaixa perfeitamente se for seguindo a ordem de menor -> maior
        byte numParaCast = 40;
        short novoNumShort = numParaCast;
        int novoNumInt = novoNumShort;
        long novoNumLong = novoNumInt;
        float novoNumFloat = novoNumLong;
        double novoNumDouble = novoNumFloat;

        //narrowing casting
        //requer a utilização de uma função ou operador específico para fazer a conversão
        //converte o maior para o menor de forma manual
        //não acontece arredondamento automático, então pode perder infos no meio do caminho

        float floatParaCasting = 18.55f;
        int numModificado = (int) floatParaCasting; //essa é a expressão de cast (indica o tipo que quer modificar)
        System.out.println(numModificado);

    }
}