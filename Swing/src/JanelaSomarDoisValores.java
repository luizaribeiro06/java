//criando uma Janela que soma dois valores
import javax.swing.*;
import java.awt.*;

public class JanelaSomarDoisValores {
    public static void main(String[] args) {
        //criação da janela principal
        JFrame frame = new JFrame("Soma de Dois Valores");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);

        //painel principal com BoxLayout (vertical)
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        //painéis de linha (cada linha tem FlowLayout)
        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        //criação dos elementos
        JLabel labelA = new JLabel("Valor A:");
        JLabel labelB = new JLabel("Valor B:");
        JLabel labelResultado = new JLabel("Resultado:");
        JTextField campoA = new JTextField(6);
        JTextField campoB = new JTextField(6);
        JTextField resultado = new JTextField(6);
        resultado.setEditable(false);
        JButton botaoSomar = new JButton("Somar");
        JButton botaoLimpar = new JButton("Limpar");

        //listener do botão somar
        botaoSomar.addActionListener(evento -> {
            try {
                double a = Double.parseDouble(campoA.getText());
                double b = Double.parseDouble(campoB.getText());
                resultado.setText(String.valueOf(a + b));
            } catch (NumberFormatException ex) {
                resultado.setText("Erro!");
            }
        });

        //listener do botão limpar
        botaoLimpar.addActionListener(evento -> {
            campoA.setText("");
            campoB.setText("");
            resultado.setText("");
        });

        //montagem dos paineis
        linha1.add(labelA);
        linha1.add(campoA);
        linha1.add(labelB);
        linha1.add(campoB);
        linha1.add(botaoSomar);
        linha2.add(labelResultado);
        linha2.add(resultado);
        linha2.add(botaoLimpar);
        painelPrincipal.add(linha1);
        painelPrincipal.add(linha2);
        frame.add(painelPrincipal);

        //Exibindo a janela
        frame.setVisible(true);

    }
}