package POO_UNAL.Taller_3.EjercicioPropuesto18GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio_propuesto_18GUI {

    private JFrame frame;
    private JTextField txtNombres;
    private JTextField txtCodigoEmpleado;
    private JTextField txtHorasTrabajadas;
    private JTextField txtPagoPorHora;
    private JTextField txtPorcentajeRetencion;
    private JTextArea txtAreaResultados;
    private JScrollPane scrollPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ejercicio_propuesto_18GUI::new);
    }

    public Ejercicio_propuesto_18GUI() {
        frame = new JFrame("Empleado");
        frame.setSize(450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblNombres = new JLabel("Nombres:");
        lblNombres.setBounds(10, 10, 80, 25);
        frame.add(lblNombres);

        txtNombres = new JTextField();
        txtNombres.setBounds(100, 10, 165, 25);
        frame.add(txtNombres);

        JLabel lblCodigoEmpleado = new JLabel("Código:");
        lblCodigoEmpleado.setBounds(10, 40, 80, 25);
        frame.add(lblCodigoEmpleado);

        txtCodigoEmpleado = new JTextField();
        txtCodigoEmpleado.setBounds(100, 40, 165, 25);
        frame.add(txtCodigoEmpleado);

        JLabel lblHorasTrabajadas = new JLabel("Horas Trabajadas:");
        lblHorasTrabajadas.setBounds(10, 70, 150, 25);
        frame.add(lblHorasTrabajadas);

        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(160, 70, 105, 25);
        frame.add(txtHorasTrabajadas);

        JLabel lblPagoPorHora = new JLabel("Pago por Hora:");
        lblPagoPorHora.setBounds(10, 100, 150, 25);
        frame.add(lblPagoPorHora);

        txtPagoPorHora = new JTextField();
        txtPagoPorHora.setBounds(160, 100, 105, 25);
        frame.add(txtPagoPorHora);

        JLabel lblPorcentajeRetencion = new JLabel("Porcentaje Retención:");
        lblPorcentajeRetencion.setBounds(10, 130, 150, 25);
        frame.add(lblPorcentajeRetencion);

        txtPorcentajeRetencion = new JTextField();
        txtPorcentajeRetencion.setBounds(160, 130, 105, 25);
        frame.add(txtPorcentajeRetencion);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(10, 160, 120, 25);
        frame.add(btnCalcular);

        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(140, 160, 120, 25);
        frame.add(btnBorrar);

        txtAreaResultados = new JTextArea();
        txtAreaResultados.setEditable(false);
        txtAreaResultados.setLineWrap(true);
        txtAreaResultados.setWrapStyleWord(true);

        scrollPane = new JScrollPane(txtAreaResultados);
        scrollPane.setBounds(10, 200, 400, 100);
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
            String nombres = txtNombres.getText();
            String codigoEmpleado = txtCodigoEmpleado.getText();
            double horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());
            double pagoPorHora = Double.parseDouble(txtPagoPorHora.getText());
            double porcentajeRetencion = Double.parseDouble(txtPorcentajeRetencion.getText());

            if (horasTrabajadas < 0 || pagoPorHora < 0 || porcentajeRetencion < 0) {
                txtAreaResultados.setText("Los valores no pueden ser negativos.");
                return;
            }
            
            Empleado empleado = new Empleado(nombres, codigoEmpleado, horasTrabajadas, pagoPorHora, porcentajeRetencion);
            String resultados = String.format(
                "Código: %s\nNombres: %s\nSalario Bruto: %.2f\nSalario Neto: %.2f",
                empleado.MostrarCodigoEmpleado(),
                empleado.MostrarNombres(),
                empleado.MostrarSalarioBruto(),
                empleado.MostarSalarioNeto()
            );
            txtAreaResultados.setText(resultados);
        } catch (NumberFormatException ex) {
            txtAreaResultados.setText("Ingrese datos válidos.");
        }
    }

    private void borrarCampos() {
        txtNombres.setText("");
        txtCodigoEmpleado.setText("");
        txtHorasTrabajadas.setText("");
        txtPagoPorHora.setText("");
        txtPorcentajeRetencion.setText("");
        txtAreaResultados.setText("");
    }
}
