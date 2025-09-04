//todas as vezes que um recurso estiver fora da mesma pasta que seu arquivo atual, esse recurso deverá ser importado
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

//importando todas as classes de um pacote
//import java.time.*; // isso se todas estiverem comentadas por ex e quisess centralizar
import models.Cliente;

//todas as vezes que rodas a aplicação vai colocar ali na pasta "out", o executável
//sempre checar os imports
//se algum import ficar cinza, pode tirar pois significa que não está sendo usado

public class Pacote {
    public static void main(String[] args) {
        //pacotes que abrigamm classes em comum
        //pasta so para regras de negoico, por ex
        //MVC- MODEL VIEW CONTROLER - região de modelagem, exposição e um intermediário que controla a modelagem/visualização
        //separa as responsabilidades de projetos em camadas
        //SE - STANDARD EDITION

        //em external libraries, tem uma série de pacotes/pastas
        //java.base -> java

        //quando builda um projeto cru, o jdk jga uma copia do core da linguagem, sendo on mínimo para rodar bem

        //trabalhando com pacotes "built in" - construídos dentro da própria aplicação (java.algumacoisa)
        //construindo as zonas de fuso disponíveis (fazendo um for delas)
        ZoneId.getAvailableZoneIds().forEach(umaZona -> System.out.println(umaZona));

        //indicando uma zona a ser utilizada
        ZoneId minhaZona = ZoneId.of("America/Sao_Paulo"); //tem q ser exatamente como é escrito

        //capturando um momento no tempo baseado em uma zona
        //ele pega o relógio do computador
        ZonedDateTime data = ZonedDateTime.now(minhaZona);
        System.out.println(data);

        //indicando um deslocamento baseado em GMT
        ZoneOffset meuFuso = ZoneOffset.ofHours(-3);
        ZonedDateTime data2 = ZonedDateTime.now(meuFuso);
        System.out.println(data2);

        //toda aleatoriedade computacional é baseada no relógio do computador

        //package nomePacote;  nomes de pacote sempre com letras minúsculas
        //trabalhando com pacotes próprios - tem q estar público
        Cliente clienteA = new Cliente();

        //dentro de java tem a obrigatoriedade da classe ter o mesmo nome do arquivvo, mas pode ter outras classes com outros nomes
    }
}