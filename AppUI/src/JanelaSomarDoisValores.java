import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaSomarDoisValores {
    public static void main(String[] args) {
        //DONE: criar janela
        //elemento frame - janela
        Frame frame = new Frame("Soma de dois valores");
        frame.setSize(600,300); //definindo o tamanho

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

        //não consegue centralizar mais de um elemento em um frame, precisa ser em um painel
        //painel be like container
        //definindo que a janela terá layout com subdivisões
        frame.setLayout(new GridBagLayout());

        //painel que terá um layout fluido q vai utilizar a opção CENTER
        Panel painelCentralizado = new Panel(new FlowLayout(FlowLayout.CENTER));

        //criação dos componentes
        Label labelValorA = new Label("Valor A:");
        Label labelValorB = new Label("Valor B:");
        Label labeResultado = new Label("Resultado:");

        TextField campoValorA = new TextField(5);
        TextField campoValorB = new TextField(5);
        TextField resultado = new TextField(5);
        resultado.setEditable(false);

        Button botaoSomar = new Button("Somar");
        Button botaoLimpar = new Button("Limpar");

        //adicionando componentes
        //primeiro precisa adicionar ao painel ao frame invés de só colocar frame.add(elementos) igual o exemplo da JanelaHello simples
        frame.add(painelCentralizado);

        painelCentralizado.add(labelValorA);
        painelCentralizado.add(campoValorA);

        painelCentralizado.add(labelValorB);
        painelCentralizado.add(campoValorB);

        painelCentralizado.add(labeResultado);
        painelCentralizado.add(resultado);

        painelCentralizado.add(botaoSomar);
        painelCentralizado.add(botaoLimpar);

        //criando o listener para o botão somar
        botaoSomar.addActionListener(new ActionListener() { //esse parametro será uma nova classe
            @Override
            public void actionPerformed(ActionEvent e) {
                //usando try caso aconteça algum erro tipo digitar errado
                try{
                    double valorA = Double.parseDouble(campoValorA.getText());
                    double valorB = Double.parseDouble(campoValorB.getText());
                    double soma = valorA + valorB;
                    resultado.setText(String.valueOf(soma));
                }
                catch (NumberFormatException exception){
                    System.out.println(exception);
                    resultado.setText("Erro!"); //vai aparecer para o usuário isso se der erro
                }
            }
        });

        //criando o listener para o botão limpar
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //para limpar é só colocar string vazia
                campoValorA.setText("");
                campoValorB.setText("");
                resultado.setText("");
            }
        });

        //exibindo janela
        frame.setVisible(true);
    }
}
