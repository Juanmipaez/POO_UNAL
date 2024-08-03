package POO_UNAL.Taller_3.EjercicioResuelto10GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio_resuelto_10GUI {

    private JFrame frame;
    private JTextField txtNumeroInscripcion;
    private JTextField txtNombre;
    private JTextField txtEstrato;
    private JTextField txtPatrimonio;
    private JTextArea txtAreaResultado;
    private JScrollPane scrollPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ejercicio_resuelto_10GUI::new);
    }

    public Ejercicio_resuelto_10GUI() {
        frame = new JFrame("Calculadora de Matrícula");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblNumeroInscripcion = new JLabel("Número de Inscripción:");
        lblNumeroInscripcion.setBounds(10, 10, 160, 25);
        frame.add(lblNumeroInscripcion);

        txtNumeroInscripcion = new JTextField();
        txtNumeroInscripcion.setBounds(180, 10, 250, 25);
        frame.add(txtNumeroInscripcion);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(10, 40, 160, 25);
        frame.add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(180, 40, 250, 25);
        frame.add(txtNombre);

        JLabel lblEstrato = new JLabel("Estrato:");
        lblEstrato.setBounds(10, 70, 160, 25);
        frame.add(lblEstrato);

        txtEstrato = new JTextField();
        txtEstrato.setBounds(180, 70, 250, 25);
        frame.add(txtEstrato);

        JLabel lblPatrimonio = new JLabel("Patrimonio:");
        lblPatrimonio.setBounds(10, 100, 160, 25);
        frame.add(lblPatrimonio);

        txtPatrimonio = new JTextField();
        txtPatrimonio.setBounds(180, 100, 250, 25);
        frame.add(txtPatrimonio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(10, 130, 120, 25);
        frame.add(btnCalcular);

        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(140, 130, 120, 25);
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
                calcularPagoDeMatricula();
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

    private void calcularPagoDeMatricula() {
        try {
            double numeroInscripcion = Double.parseDouble(txtNumeroInscripcion.getText());
            String nombre = txtNombre.getText();
            int estrato = Integer.parseInt(txtEstrato.getText());
            double patrimonio = Double.parseDouble(txtPatrimonio.getText());

            Estudiante estudiante = new Estudiante(numeroInscripcion, nombre, estrato, patrimonio);

            double pagoDeMatricula = 50000;
            if (patrimonio > 2000000 && estrato > 3) {
                pagoDeMatricula += 0.03 * patrimonio;
            }

            String resultado = String.format(
                "El estudiante con número de inscripción %s y nombre %s deberá pagar %.2f",
                estudiante.NumeroInscripcion,
                estudiante.Nombre,
                pagoDeMatricula
            );
            txtAreaResultado.setText(resultado);
        } catch (NumberFormatException ex) {
            txtAreaResultado.setText("Ingrese datos válidos.");
        }
    }

    private void borrarCampos() {
        txtNumeroInscripcion.setText("");
        txtNombre.setText("");
        txtEstrato.setText("");
        txtPatrimonio.setText("");
        txtAreaResultado.setText("");
    }
}
