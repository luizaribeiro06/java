import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListas {
    public static void main(String[]args){
        //arrays primitivos - são rápidos, mas limitados
        //é o melhor que se comunica com for
        //só pode ter um tipo de dado na coleção
        //basta usar o colchete
        //!!! TODO ARRAY DE JAVA TEM ÍNDICE DE BASE 0
        int[] numParesUmDigito = {2, 4, 6, 8};

        //array só de string, por exemplo
        String[] beatles = {
                "Paul",
                "Ringo",
                "George",
                "John"
        };

        //imprimindo um elemento de um Array Primitivo - esquema de índice
        //qualquer aplicação que tente acessar um índice que não existe, vai quebrar
        System.out.println(beatles[0]);

        //medindo o tamanho de um array
        System.out.println(beatles.length);

        //acessando o último elemento de um array
        System.out.println(beatles[beatles.length - 1]);

        //todo elemento tem esse ".", no qua conseguimos extrair coisas dele

        //tentando imprimir um array inteiro
        //por enquanto é exibido apenas o endereço de memória
        System.out.println(beatles);

        //são imutáveis em relação quanto ao seu tamanho, mas pode modificar elementos
        //atribuir novo valor a um elemento existente
        beatles[0]= "McCartney";
        System.out.println(beatles[0]); //vai ter mudado

        //com laços de repetição
        //for each (para cada elemento do array)
        //sintaxe: for(tipoDado nomeDeElemento: arraASerUtilizado){instruções a serem executadas}
        for(String beatle: beatles){
            System.out.println(beatle); //imprime tudo que tiver no array, da as voltas necessárias de acordo com o tamamnho
        }

        //transformando um array primitivo em uma lista
        System.out.println(Arrays.toString(beatles));
        //se quiser guardar em variavel
        String lista = Arrays.toString(beatles);
        System.out.println(lista);

        //listas - são mais lentas, mas extremamente cheias de recurso
        //são baseadas em classes
        //podem ser mudadas

        //ArrayList
        //diamante <> - indica utilização de genéricos (algm que pode fazer uma substituição qualquer, mantendo os efeitos desejados)
        //ArrayList <tipoDado> nome = new ArrayList<>();

        // iniciando uma lista que começará vazia
        ArrayList <String> pontosCardeais = new ArrayList<>();

        //adicionando elementos
        pontosCardeais.add("Norte");
        pontosCardeais.add("Sul");
        pontosCardeais.add("Leste");
        pontosCardeais.add("Oeste");

        System.out.println(pontosCardeais);

        //imprimindo na lista de acordo com o índice - método get
        System.out.println(pontosCardeais.get(0));

        //medindo o tamanho de uma lista
        System.out.println(pontosCardeais.size());

        //acessando o último elemento de uma lista
        System.out.println(pontosCardeais.get(pontosCardeais.size() - 1));

        //modificando itens de uma lista - método set
        //passa o índice e conteúdo q deseja
        System.out.println(pontosCardeais.set(2, "Este"));
        System.out.println(pontosCardeais);

        //verificando se existe uma ocorrência em uma lista
        //ex real: cadastro, ver se tem determinado usuário, logo, se já existir não deixa ser criado um igual
        System.out.println(pontosCardeais.contains("Sul")); //retorna true or false

        //removendo um elemento por índice
        System.out.println(pontosCardeais.remove(0));

        //removendo um elemento pelo conteúdo
        //apagar o nome de um produto numa lista, por ex
        System.out.println(pontosCardeais.remove("Sul"));

        //limpando uma lista - todos os elementos são removidos
        pontosCardeais.clear();

        //for each em listas
        //lambda: FUNÇÃO que será passada como um argumento da tupla
        pontosCardeais.forEach(umPonto -> System.out.println(umPonto)); //a cada passo imprime um elemento da lista (até acabar)

        //arraylist de número inteiro não é possível pois ele só trabalha com classe
    }
}

