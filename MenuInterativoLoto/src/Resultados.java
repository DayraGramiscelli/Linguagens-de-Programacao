import javax.swing.*;
import java.awt.*;

public class Resultados extends Menu {
    private JTextArea resultadoTextArea;

    public Resultados(String resultado) {
        resultadoTextArea = new JTextArea(resultado);
        resultadoTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(resultadoTextArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(scrollPane);

        setTitle("Resultado da Aposta");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas esta janela
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
