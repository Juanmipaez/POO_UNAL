package POO_UNAL.Taller_3.EjercicioPropuesto23GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio_prop_23GUI {

    private JFrame frame;
    private JTextField txtValorA;
    private JTextField txtValorB;
    private JTextField txtValorC;
    private JTextArea txtAreaResultado;
    private JScrollPane scrollPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ejercicio_prop_23GUI::new);
    }

    public Ejercicio_prop_23GUI() {
        frame = new JFrame("Ecuación Cuadrática");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblValorA = new JLabel("Valor A:");
        lblValorA.setBounds(10, 10, 80, 25);
        frame.add(lblValorA);

        txtValorA = new JTextField();
        txtValorA.setBounds(100, 10, 165, 25);
        frame.add(txtValorA);

        JLabel lblValorB = new JLabel("Valor B:");
        lblValorB.setBounds(10, 40, 80, 25);
        frame.add(lblValorB);

        txtValorB = new JTextField();
        txtValorB.setBounds(100, 40, 165, 25);
        frame.add(txtValorB);

        JLabel lblValorC = new JLabel("Valor C:");
        lblValorC.setBounds(10, 70, 80, 25);
        frame.add(lblValorC);

        txtValorC = new JTextField();
        txtValorC.setBounds(100, 70, 165, 25);
        frame.add(txtValorC);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(10, 100, 120, 25);
        frame.add(btnCalcular);

        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(140, 100, 120, 25);
        frame.add(btnBorrar);

        txtAreaResultado = new JTextArea();
        txtAreaResultado.setEditable(false);
        txtAreaResultado.setLineWrap(true);
        txtAreaResultado.setWrapStyleWord(true);

        scrollPane = new JScrollPane(txtAreaResultado);
        scrollPane.setBounds(10, 160, 460, 200);
        frame.add(scrollPane);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularSoluciones();
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

    private void calcularSoluciones() {
        try {
            double valorA = Double.parseDouble(txtValorA.getText());
            double valorB = Double.parseDouble(txtValorB.getText());
            double valorC = Double.parseDouble(txtValorC.getText());

            double determinante = (valorB * valorB) - (4 * valorA * valorC);

            if (determinante < 0) {
                txtAreaResultado.setText("La ecuación de segundo grado no tiene solución en los números reales.");
            } else {
                double solucion1 = (-valorB + Math.sqrt(determinante)) / (2 * valorA);
                double solucion2 = (-valorB - Math.sqrt(determinante)) / (2 * valorA);
                String resultados = String.format("Solución 1: %.2f\nSolución 2: %.2f", solucion1, solucion2);
                txtAreaResultado.setText(resultados);
            }
        } catch (NumberFormatException ex) {
            txtAreaResultado.setText("Ingrese valores válidos.");
        } catch (ArithmeticException ex) {
            txtAreaResultado.setText("Error en el cálculo. Asegúrese de que A no sea cero.");
        }
    }

    private void borrarCampos() {
        txtValorA.setText("");
        txtValorB.setText("");
        txtValorC.setText("");
        txtAreaResultado.setText("");
    }
}

