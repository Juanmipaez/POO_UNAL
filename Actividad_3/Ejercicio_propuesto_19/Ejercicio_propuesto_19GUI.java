package POO_UNAL.Taller_3.EjercicioPropuesto19GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio_propuesto_19GUI {

    private JFrame frame;
    private JTextField txtLado;
    private JTextArea txtAreaResultados;
    private JScrollPane scrollPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ejercicio_propuesto_19GUI::new);
    }

    public Ejercicio_propuesto_19GUI() {
        frame = new JFrame("Triángulo Equilátero");
        frame.setSize(450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblLado = new JLabel("Longitud del lado:");
        lblLado.setBounds(10, 10, 150, 25);
        frame.add(lblLado);

        txtLado = new JTextField();
        txtLado.setBounds(160, 10, 100, 25);
        frame.add(txtLado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(10, 40, 120, 25);
        frame.add(btnCalcular);

        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(140, 40, 120, 25);
        frame.add(btnBorrar);

        txtAreaResultados = new JTextArea();
        txtAreaResultados.setEditable(false);
        txtAreaResultados.setLineWrap(true);
        txtAreaResultados.setWrapStyleWord(true);

        scrollPane = new JScrollPane(txtAreaResultados);
        scrollPane.setBounds(10, 80, 400, 200);
        frame.add(scrollPane);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularTriangulo();
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

    private void calcularTriangulo() {
        try {
            double lado = Double.parseDouble(txtLado.getText());

            if (lado <= 0) {
                txtAreaResultados.setText("La longitud del lado debe ser positiva.");
                return;
            }

            Triangulo_equilatero triangulo = new Triangulo_equilatero(lado);
            String resultados = String.format(
                "Perímetro: %.2f\nAltura: %.2f\nÁrea: %.2f",
                triangulo.MostrarPerimetro(),
                triangulo.MostrarAltura(),
                triangulo.MostrarArea()
            );
            txtAreaResultados.setText(resultados);
        } catch (NumberFormatException ex) {
            txtAreaResultados.setText("Ingrese una longitud válida.");
        }
    }

    private void borrarCampos() {
        txtLado.setText("");
        txtAreaResultados.setText("");
    }
}
