public class CondicoesColecoes {
    public static void main(String[] args) {
        //blocos
        //parênteses () - tupla/conjunto de dados
        //chaves {} - bloco de execução - escopo
        //colchete [] - indicação de coleção
        //diamante <> tipos genéricos

        //expressões booleanas
        boolean lightOn = true;

        //simples - verificar diretamente o próprio boolean
        System.out.println(lightOn);
        //NUNCA FAZER ISSO -> System.out.println(lightOn == true); - redundante

        //média - operadores de comparação
        System.out.println(10 > 9);

        //complexa - operadores lógicos
        System.out.println(10 > 9 && lightOn);

        //Sintaxe do If
        //if(expressão booleana){instruções a serem executadas}
        //não precisa ter else necessariamente, mas e a condição der false ele só vai ignorar o if

        //Sintaxe do else (vem SEMPRE depois do if)
        //else{instruções a serem executadas}

        if(lightOn){
            System.out.println("A luz está ligada!");
        }
        else{
            System.out.println("A luz está apagada!");
        }

        //trabalhando com expressões complexas
        String user = "Admin";
        String password = "1234";

        //valida duas colunas de dados no login: usuario e senha
        //lembrando:: usa-se .equals para ver string
        if(user.equals("FiapUser") && password.equals("Fiap1234")){
            System.out.println("Login efetuado com sucesso!");
        }
        else{
            System.out.println("Erro ao efetuar login.");
        }

        //operador OR ||
        //vai passar se pelo menos um der true
        boolean credito = true;
        boolean debito = false;

        if(credito || debito){
            System.out.println("Compra aprovada!");
        }
        else {
            System.out.println("A compra não foi aprovada!");
        }

        //trabalhando com operador NOT !
        String textField = "Joaquim da Silva";
        //exemplo para saber se a string NAO está vazia
        if(!textField.isEmpty()){
            //System.out.println("Nome encontrado: " + textField);
            //pode fazer em interpolação::
            System.out.println(String.format("Nome encontrado: %s", textField));
        }
        else{
            System.out.println("Preencha o campo corretamente.");
        }

        //trabalhando com if / else if / else
        //else if vale a pena se for usar no máximo 2 vezes, se for mais o ideal é o switch/case
        String semaforo = "Vermelho";
        if(semaforo.equals("Vermelho")){
            System.out.println("PARE!");
        }
        else if(semaforo.equals("Amarelo")){
            System.out.println("ATENÇÃO!");
        }
        else{
            System.out.println("SIGA!");
        }

        //trabalhando com switch/case
        int diaSemana = 1;
        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;

            //caso não seja coberto por um case: //tem o padrão
            //não precisa de break pois só vai cair nele se não cair nos anteriores
            default:
                System.out.println("Dia da semana não encontrado.");
        }

        //trabalhando com operador ternário - operador elvis ?:
        //qualquer if else pode ser substituído por esse operador
        //a terceira possibilidade não existe

        int horaDia = 10;

        String resultado = (horaDia < 18) ? "Que dia lindo!" : "Que noite linda!";
        System.out.println(resultado);

    }
}

