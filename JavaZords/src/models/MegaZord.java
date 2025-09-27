package models;

public class MegaZord implements  ZordVermelho, ZordAzul, ZordPreto, ZordRosa, ZordAmarelo {
    //Métodos de ZordAmarelo
    public void acoplarZordAmarelo() {
        System.out.println("Aclopou o Zord com o dino" + ZordAmarelo.dino);

    }

    //Métodos de ZordAzul
    public void acoplarZordAzul() {
        System.out.println("Acoplou o Zord com o dino" + ZordAzul.dino);
    }

    //Métodos de ZordPreto
    public void acoplarZordPreto() {
        System.out.println("Acoplou o Zord com o dino" + ZordPreto.dino);
    }

    //Métodos de ZordRosa
    public void acoplarZordRosa() {
        System.out.println("Acoplou o Zord com o dino" + ZordRosa.dino);
    }

    //Métodos de ZoedVermelho
    public void acoplarZordVermelho() {
        System.out.println("Acoplou o Zord com o dino" + ZordVermelho.dino);
    }
}
