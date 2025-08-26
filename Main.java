public class Main {
    public static void main(String[] args) {
        //criando objetos da classe Carro
        //nomeClasse nomeObjeto = new nomeClasse()
        Carro carroA = new Carro();

        //preenchendo as propriedades de carroA
        carroA.cor = "Azul";
        carroA.fabricante = "VW";
        carroA.modelo = "Fusca";
        carroA.preco = 80.000f;
        carroA.kilometragem = 100000;

        //utilizando os métodos
        carroA.acelerar();
        carroA.frear();

    }
}