package models;

//records providenciam classes rápidas que são capazes de criar objetos imutáveis (sem exceção)
//produzem automaticamente construtores e getters para as suas propriedades (pq não tem setter? justamente por ser imutável)
//são utilizadas geralmente para abrigar um conceito chamado de DTO - Data Transfer Object
//pega dados de uma outra fonte, trazer para dentro da aplicação rapidamente (pensando em bd por ex)
//toda captura do bd é um estado momentâneo, se o dado se transformar ao longo do tempo, é volátil (logo, o DTO será refeito automaticamente)
//escreve as propriedades dentro do ()
public record Documento(String cpf, String rg) {
    //não precisa programar nada, só se tiver necessidade de algum métod0 a +
}
