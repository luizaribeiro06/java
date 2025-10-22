//criando uma Janela Simples com um texto e uma caixa de alerta ao utilizar o botão fechar
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaHello {
    public static void main(String[] args) {
        //criação da janela principal
        JFrame frame = new JFrame("Trabalhando com JFrames e JLabels");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // impede fechamento automático
        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null); // centraliza
        //criando elemento Label
        JLabel label = new JLabel("Olá Swing!");
        label.setHorizontalAlignment(SwingConstants.CENTER); // Centraliza horizontalmente
        label.setVerticalAlignment(SwingConstants.CENTER);
        //adicionando Elemento ao frame
        frame.add(label);
        //adicionando comportamento ao clicar no botão de fechar
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //exibindo caixa de alerta antes de sair da janela
                int resposta = JOptionPane
                        .showConfirmDialog(
                                frame, //onde será exibida
                                "Tem certeza que deseja fechar a janela?", //msg
                                "Confirmar saída", //título
                                JOptionPane.YES_NO_OPTION,
                                //tipo de disposição dos botões
                                JOptionPane.QUESTION_MESSAGE,
                                //tipo de caixa
                                new ImageIcon(JanelaHello.class.getResource("alerta.png")) //Ícone
                        );
                //saindo ao utilizar a opção SIM
                if (resposta == JOptionPane.YES_OPTION
                ) {
                    System.exit(0); // fecha a janela
                }
            }
        });
        // exibindo Janela
        frame.setVisible(true);
    }
}