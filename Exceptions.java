public class Exceptions {
    public static void main(String[] args) {

        //bug: nunca quebra a aplicação, permite continuar rodando
        //como evitar: teste unitário (abertura e fechamento de {}, de integração, interface...)
        //o que vai quebrar é o "crash"

        //provocando exceptions
        String[] frutas = {"Maçã", "Banana", "Mamão"};

        //exemplos mais comuns de exceção::::

        //System.out.println(frutas[3]);
        //ao acessar índices - "ArrayIndexOutOfBoundsException"

        //int divisao = 10/0;
        //divisão por 0 não existe - "ArithmeticException"

        //String nula = null;
        //System.out.println(nula.toUpperCase());
        //"NullPointerException"

        //**erros** são apontados como defeito de sintaxe e sempre são apresentados na pé-compilação
        //java é pré-compilado, então sempre tenta prever algum erro. mas só compila de fato quando terminar e executar
        //exs: falta de símbolos - ; () {} [] <> , . f L
        //declarações não resolvidas
        //incompatibilidade de tipos

        //formas de contornar um exception
        //1. providenciar o que é necessário para não quebrar
        //2. trabalhar com testes automatizados - pirâmide de testes
        //3. estrutura try/catch
        //coloca dentro do bloco try para tentar executar, se não conseguir vai para o bloco catch tratar

        try {
            //tentativa de executar alguma instrução
            System.out.println(frutas[2]);
            System.out.println("Foi!");
        }
        catch (ArrayIndexOutOfBoundsException umaExcep){
            System.out.println("Erro ao executar o código: ");
            System.out.println(umaExcep);
        }

        String umTexto = "Um texto";

        try{
            umTexto = null;
            System.out.println(umTexto.toUpperCase());
            System.out.println("Foi!");
        }

        catch (NullPointerException umaExcep){
            System.out.println("Erro ao executar o código: ");
            System.out.println(umaExcep);
        }

        //criando estrutura try/catch para captar qualquer exception
        //vai quebrar no primeiro erro que achar
        try{
            System.out.println(frutas[0]);
            int div = 84/0;
            umTexto = null;
            System.out.println(umTexto.toUpperCase());
            System.out.println("Foi!");
        }

        catch (Exception umaExcep){
            System.out.println("Erro ao executar o código: ");
            System.out.println(umaExcep);
        }

        //trabalhando com o bloco finally
        try{
            int div = 76/0;
            System.out.println("Foi!");
        }

        catch (Exception umaExcep){
            System.out.println("Não foi :(");
            System.out.println(umaExcep);
        }
        //o finally sempre será executado, independente de quebrar ou não
        finally {
            System.out.println("Chegou no final da execução!");
        }
    }
}
