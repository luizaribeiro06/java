import javax.tools.Tool;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaHello {
    public static void main(String[] args) {

        //DONE: criar janela
        //elemento frame - janela
        Frame frame = new Frame("Trabalhando com Frames e Labels");
        frame.setSize(800,600); //definindo o tamanho

        //cálculo para posição centralizada da janela
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamanhoTela.width - frame.getWidth()) / 2;
        int y = (tamanhoTela.height - frame.getHeight()) / 2;
        frame.setLocation(x,y);

        //indicando função para o botão fechar
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                /*CHAMA o métod0 da classe pai- >
                super.windowClosing(e);*/

                System.exit(0);
            }
        });

        //DONE: criar elemenos de interface
        Label label = new Label("Bem vindo(a) ao AWT!");
        label.setAlignment((Label.CENTER)); //tem que colocar isso antes de criar a label

        //para cada elemento de interface gráfica, tem os getters e setters
        //muda o texto na hora que rodar quando clicar no botão, por ex
        label.setText("Texto novo");
        frame.add(label);

        //exibindo janela
        //a posição na qual a janela vem default é 0,0 (a tela começa canto superior esquerdo positivo x e positivo y)
        frame.setVisible(true);
    }
}