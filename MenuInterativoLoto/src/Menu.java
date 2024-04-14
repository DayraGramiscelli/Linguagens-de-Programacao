import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;

public class Menu extends JFrame {
    private JLabel lotofacil;
    private JLabel lblAposta1;
    private JLabel lblAposta2;
    private JLabel lblAposta3;
    private JPanel menu;
    private JTextField txtAposta1;
    private JTextField txtAposta2;
    private JTextField txtAposta3;
    private JButton jbAposta1;
    private JButton jbAposta2;
    private JButton jbAposta3;
    private JButton jbSair;


    public Menu() {
        menu = new JPanel();
        txtAposta1 = new JTextField();
        jbAposta1 = new JButton("Apostar");
        jbSair = new JButton("Sair");


        jbAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroStr = txtAposta1.getText();

                int aposta1 = Integer.parseInt(numeroStr);
                int valor = (int) (Math.random() * 100);

                if (aposta1 >= 0 && aposta1 <= 100 && aposta1 == valor) {
                    JOptionPane.showMessageDialog(null, "Você ganhou R$ 1.000,00 reais.");
                } else if (aposta1 < 0 || aposta1 > 100) {
                    JOptionPane.showMessageDialog(null, "O número digitado de estar entre 0 e 100");
                } else {
                    JOptionPane.showMessageDialog(null, "Que pena, o numero sorteado foi: " + valor);
                }

                txtAposta1.setText("");
            }
        });
        jbAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta2 = txtAposta2.getText().toUpperCase();
                String valor2 = "D";

                if (aposta2.equals(valor2)) {
                    JOptionPane.showMessageDialog(null, "Você ganhou 1.000,00 reais!");
                } else {
                    JOptionPane.showMessageDialog(null,"Que pena! A letra sorteada foi: " + valor2);
                }
                txtAposta2.setText("");
            }
        });

        jbAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int aposta3 = Integer.parseInt(txtAposta3.getText());

                if (aposta3 % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "Você ganhou 100,00 reais");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Que pena! O número digitado foi ímpar e a premiação foi para números pares");
                }
                txtAposta3.setText("");
            }
        });


        jbSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela
            }
        });

        menu.add(lblAposta1);
        menu.add(txtAposta1);
        menu.add(jbAposta1);
        menu.add(lblAposta2);
        menu.add(txtAposta2);
        menu.add(jbAposta2);
        menu.add(lblAposta3);
        menu.add(txtAposta3);
        menu.add(jbAposta3);
        menu.add(jbSair);
        menu.setLayout(new GridLayout(4, 3));

        this.setContentPane(menu);
        this.setTitle("LotoFácil");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(400,200);

    }
    public static void main(String[] args) {
        Menu menu = new Menu();
    }
}
