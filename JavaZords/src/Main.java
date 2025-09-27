import models.MegaZord;

public class Main {
    public static void main(String[] args) {

        //Criando um MegaZord
        MegaZord megaZord = new MegaZord();

        megaZord.acoplarZordVermelho();
        megaZord.acoplarZordAzul();
        megaZord.acoplarZordPreto();
        megaZord.acoplarZordRosa();
        megaZord.acoplarZordAmarelo();

    }
}

//enum é um tipo de classe especial reservada para a criação de enumerações
//é utilizada para criar elementos que indiquem possibilidades finitas de dados, só precisa declarar as propriedades (sem getter e setter)
//propriedades são escritas com letra maiúscula