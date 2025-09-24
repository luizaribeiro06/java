package models;

public class Coordenadas <X, Y>{
    private X coordX;
    private Y coordY;

    //Construtor

    public Coordenadas(X coordX, Y coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    //Métod0

    public void imprimirCoordenadas() {
        System.out.println("Coordenada X: " + coordX );
        System.out.println("Coordenada Y: " + coordY );
    }
}
