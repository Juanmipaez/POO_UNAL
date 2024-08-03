package POO_UNAL.Taller_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio_resuelto7GUI {

    private JFrame frame;
    private JTextField txtNumeroA;
    private JTextField txtNumeroB;
    private JTextArea txtAreaResultado;
    private JScrollPane scrollPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ejercicio_resuelto7GUI::new);
    }

    public Ejercicio_resuelto7GUI() {
        frame = new JFrame("Comparador de Números");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblNumeroA = new JLabel("Número A:");
        lblNumeroA.setBounds(10, 10, 100, 25);
        frame.add(lblNumeroA);

        txtNumeroA = new JTextField();
        txtNumeroA.setBounds(120, 10, 150, 25);
        frame.add(txtNumeroA);

        JLabel lblNumeroB = new JLabel("Número B:");
        lblNumeroB.setBounds(10, 40, 100, 25);
        frame.add(lblNumeroB);

        txtNumeroB = new JTextField();
        txtNumeroB.setBounds(120, 40, 150, 25);
        frame.add(txtNumeroB);

        JButton btnComparar = new JButton("Comparar");
        btnComparar.setBounds(10, 70, 120, 25);
        frame.add(btnComparar);

        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(140, 70, 120, 25);
        frame.add(btnBorrar);

        txtAreaResultado = new JTextArea();
        txtAreaResultado.setEditable(false);
        txtAreaResultado.setLineWrap(true);
        txtAreaResultado.setWrapStyleWord(true);

        scrollPane = new JScrollPane(txtAreaResultado);
        scrollPane.setBounds(10, 100, 360, 100);
        frame.add(scrollPane);

        btnComparar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compararNumeros();
            }
        });

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrarCampos();
            }
        });

        frame.setVisible(true);
    }

    private void compararNumeros() {
        try {
            double numeroA = Double.parseDouble(txtNumeroA.getText());
            double numeroB = Double.parseDouble(txtNumeroB.getText());

            String resultado;
            if (numeroA > numeroB) {
                resultado = "A es mayor que B";
            } else if (numeroA == numeroB) {
                resultado = "A es igual a B";
            } else {
                resultado = "A es menor que B";
            }

            txtAreaResultado.setText(resultado);
        } catch (NumberFormatException ex) {
            txtAreaResultado.setText("Ingrese números válidos.");
        }
    }

    private void borrarCampos() {
        txtNumeroA.setText("");
        txtNumeroB.setText("");
        txtAreaResultado.setText("");
    }
}
