public class Soma {
    //Propriedades
    private int valorA;
    private int valorB;

    //Construtor

    public Soma(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    //Getters e Setters

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    //Métod0
    public void Calcular(){
        System.out.println(valorA + valorB);
    };

}
