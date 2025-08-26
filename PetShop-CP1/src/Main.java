public class Main {
    public static void main(String[] args) {
        //TUTOR
        Tutor tutorA = new Tutor();
        Tutor tutorB = new Tutor();

        //TUTOR A
        tutorA.nome = "Joaquim José";
        tutorA.idade = 44;
        tutorA.cpf = "111.111.111-11";

        //TUTOR B
        tutorB.nome = "Francisca Maria";
        tutorB.idade = 30;
        tutorB.cpf = "222.222.222-22";

        tutorA.imprimirDados();
        tutorB.imprimirDados();

        //PET
        Pet petA = new Pet();
        Pet petB = new Pet();
        Pet petC = new Pet();
        Pet petD = new Pet();

        //pet A
        petA.id = 1;
        petA.nome = "Caramelo";
        petA.raca = "Vira lata";
        petA.cor = "Amarela";
        petA.idade = 8;

        //pet B
        petB.id = 4;
        petB.nome = "Xuxa";
        petB.raca = "Dálmata";
        petB.cor = "Branca";
        petB.idade = 3;

        //pet C
        petC.id = 3;
        petC.nome = "Lola";
        petC.raca = "Golden Retriever";
        petC.cor = "Amarela";
        petC.idade = 4;

        //pet D
        petD.id = 2;
        petD.nome = "Bolinha";
        petD.raca = "Pinscher";
        petD.cor = "Preta";
        petD.idade = 12;

        petA.imprimirDados();
        petB.imprimirDados();
        petC.imprimirDados();
        petD.imprimirDados();
    }
}