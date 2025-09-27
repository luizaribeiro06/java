package models;

//interface é um contrato com todos os métodos que DEVE, ser utilizados me uma classe
public interface ZordVermelho {
    //propriedades
    //são elas:
    //final (constantes)
    //static (pertence à classe, e não ao objeto)
    Dino dino = Dino.TIRANOSSAURO;

    //assinatura dos métodos
    void acoplarZordVermelho();
}
