package models;

//para indicar uma classe genérica, utilizamos uma prop genérica
//o nome da propriedade genérica pode ser definido por uma letra ->
//letras mais utilizadas:
//T - Type
//E - Element
//N - Number
//K - Key
//V - Value
public class ImpressoraGenerica <T> {
    //DONE: propriedades
    private T dado;

    //DONE: Construtores

    public ImpressoraGenerica(T dado) {
        this.dado = dado;
    }

    //DONE: Getters and Setters
    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    //DONE: Métod0
    public void imprimirDado(){
        System.out.println(dado);
    }
}
