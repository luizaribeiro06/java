//abstracte window toolkit - criar interfaces gráficas e gerenciar componentes de janelas
//não serve para web, apenas para SO de computadores
import java.awt.*;

public class Main {

    //RELEMBRANDO
    //static - liberando para ser usado dentro da própria classe
    //public - liberando para outros utilizarem

    //ACOPLAMENTO- cria um objeto de uma dependência qualquer e inicializa ele
    // faz com que ocupe espaço em memória sem necessidade

    //PROPRIEDADES
    // static Frame frame = new Frame("Janela Básica");
    //static Label label = new Label("Hello World!");

    //LOGO ->>>>> partimos para a injeção de dependência
    //APENAS declara as classes e cria o construtor

    //criando janela
    //criando o requadro da janela
    static Frame frame;

    //criando uma caixa de texto
    static Label label;

    //tirar os "static" para fazer os construtores e depois coloca novamente
    public Main(Frame frame, Label label) {
        this.frame = frame;
        this.label = label;
    }

    public static void main(String[] args) {

        //assim, só vai subir para a memória no momento necessário
        frame = new Frame();
        label = new Label("Olá AWT!");

        //definindo o tamanho da janela em pontos
        frame.setSize(300,300);

        //definindo o alinhamento do texto
        //"Label.CENTER" -> é um enum, no qual tem várias opções de centralização
        label.setAlignment(Label.CENTER);

        //adicionando o texto na janela
        frame.add(label);

        //exibindo a janela - último passo
        frame.setVisible(true);

    }
    //pode fazer dessa maneira tbm pois ele não está direto no escopo do main
    public void meuMetodo(){
        frame.setSize(500,500);
    }
}

