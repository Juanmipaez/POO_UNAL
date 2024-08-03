package POO_UNAL.Taller_3.EjercicioPropuesto22GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio_prop_22GUI {

    private JFrame frame;
    private JTextField txtNombreEmpleado;
    private JTextField txtSalarioPorHora;
    private JTextField txtHorasTrabajadasMensual;
    private JTextArea txtAreaResultado;
    private JScrollPane scrollPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ejercicio_prop_22GUI::new);
    }

    public Ejercicio_prop_22GUI() {
        frame = new JFrame("Empleado");
        frame.setSize(450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblNombreEmpleado = new JLabel("Nombre del Empleado:");
        lblNombreEmpleado.setBounds(10, 10, 150, 25);
        frame.add(lblNombreEmpleado);

        txtNombreEmpleado = new JTextField();
        txtNombreEmpleado.setBounds(170, 10, 200, 25);
        frame.add(txtNombreEmpleado);

        JLabel lblSalarioPorHora = new JLabel("Salario por Hora:");
        lblSalarioPorHora.setBounds(10, 40, 150, 25);
        frame.add(lblSalarioPorHora);

        txtSalarioPorHora = new JTextField();
        txtSalarioPorHora.setBounds(170, 40, 200, 25);
        frame.add(txtSalarioPorHora);

        JLabel lblHorasTrabajadasMensual = new JLabel("Horas Trabajadas Mensual:");
        lblHorasTrabajadasMensual.setBounds(10, 70, 180, 25);
        frame.add(lblHorasTrabajadasMensual);

        txtHorasTrabajadasMensual = new JTextField();
        txtHorasTrabajadasMensual.setBounds(200, 70, 170, 25);
        frame.add(txtHorasTrabajadasMensual);

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
        scrollPane.setBounds(10, 140, 420, 150);
        frame.add(scrollPane);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularSalario();
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

    private void calcularSalario() {
        try {
            String nombreEmpleado = txtNombreEmpleado.getText();
            double salarioPorHora = Double.parseDouble(txtSalarioPorHora.getText());
            double horasTrabajadasMensual = Double.parseDouble(txtHorasTrabajadasMensual.getText());
            Empleado empleado1 = new Empleado(nombreEmpleado, horasTrabajadasMensual, salarioPorHora);
            double salarioMensual = empleado1.CalcularSalarioMensual();

            if (salarioMensual > 450000) {
                txtAreaResultado.setText(String.format("El empleado %s tuvo un sueldo este mes de: $%.2f", empleado1.MostrarNombre(), salarioMensual));
            } else {
                txtAreaResultado.setText(String.format("El empleado se llama %s", empleado1.MostrarNombre()));
            }
        } 
        catch (NumberFormatException ex) {
            txtAreaResultado.setText("Ingrese datos válidos.");
        }
    }

    private void borrarCampos() {
        txtNombreEmpleado.setText("");
        txtSalarioPorHora.setText("");
        txtHorasTrabajadasMensual.setText("");
        txtAreaResultado.setText("");
    }
}
