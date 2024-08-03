package POO_UNAL.Taller_3.FigurasGeometricasGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Figuras_geo_valoresGUI {

    private JFrame frame;
    private JTextField txtRadioCirculo;
    private JTextField txtLadoCuadrado;
    private JTextField txtBaseRectangulo;
    private JTextField txtAlturaRectangulo;
    private JTextField txtBaseTriangRect;
    private JTextField txtAlturaTriangRect;
    private JTextField txtDiagonalRombo;
    private JTextField txtLadoRombo;
    private JTextField txtBaseMayorTrapecio;
    private JTextField txtBaseMenorTrapecio;
    private JTextField txtAlturaTrapecio;
    private JTextArea txtAreaResultado;
    private JScrollPane scrollPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Figuras_geo_valoresGUI::new);
    }

    public Figuras_geo_valoresGUI() {
        frame = new JFrame("Figuras Geométricas");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a panel to hold all input fields and labels
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12, 2, 10, 10));
        panel.setBounds(10, 10, 560, 340);
        frame.add(panel);

        // Labels and TextFields for inputs
        panel.add(new JLabel("Radio del Círculo:"));
        txtRadioCirculo = new JTextField();
        panel.add(txtRadioCirculo);

        panel.add(new JLabel("Lado del Cuadrado:"));
        txtLadoCuadrado = new JTextField();
        panel.add(txtLadoCuadrado);

        panel.add(new JLabel("Base del Rectángulo:"));
        txtBaseRectangulo = new JTextField();
        panel.add(txtBaseRectangulo);

        panel.add(new JLabel("Altura del Rectángulo:"));
        txtAlturaRectangulo = new JTextField();
        panel.add(txtAlturaRectangulo);

        panel.add(new JLabel("Base del Triángulo Rectángulo:"));
        txtBaseTriangRect = new JTextField();
        panel.add(txtBaseTriangRect);

        panel.add(new JLabel("Altura del Triángulo Rectángulo:"));
        txtAlturaTriangRect = new JTextField();
        panel.add(txtAlturaTriangRect);

        panel.add(new JLabel("Diagonal del Rombo:"));
        txtDiagonalRombo = new JTextField();
        panel.add(txtDiagonalRombo);

        panel.add(new JLabel("Lado del Rombo:"));
        txtLadoRombo = new JTextField();
        panel.add(txtLadoRombo);

        panel.add(new JLabel("Base Mayor del Trapecio:"));
        txtBaseMayorTrapecio = new JTextField();
        panel.add(txtBaseMayorTrapecio);

        panel.add(new JLabel("Base Menor del Trapecio:"));
        txtBaseMenorTrapecio = new JTextField();
        panel.add(txtBaseMenorTrapecio);

        panel.add(new JLabel("Altura del Trapecio:"));
        txtAlturaTrapecio = new JTextField();
        panel.add(txtAlturaTrapecio);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setBounds(10, 360, 560, 50);
        frame.add(buttonPanel);

        JButton btnCalcular = new JButton("Calcular");
        buttonPanel.add(btnCalcular);

        JButton btnBorrar = new JButton("Borrar");
        buttonPanel.add(btnBorrar);

        txtAreaResultado = new JTextArea();
        txtAreaResultado.setEditable(false);
        txtAreaResultado.setLineWrap(true);
        txtAreaResultado.setWrapStyleWord(true);

        scrollPane = new JScrollPane(txtAreaResultado);
        scrollPane.setBounds(10, 420, 560, 130);
        frame.add(scrollPane);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularFiguras();
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

    private void calcularFiguras() {
        try {
            double radioCirculo = Double.parseDouble(txtRadioCirculo.getText());
            double ladoCuadrado = Double.parseDouble(txtLadoCuadrado.getText());
            double baseRectangulo = Double.parseDouble(txtBaseRectangulo.getText());
            double alturaRectangulo = Double.parseDouble(txtAlturaRectangulo.getText());
            double baseTriangRect = Double.parseDouble(txtBaseTriangRect.getText());
            double alturaTriangRect = Double.parseDouble(txtAlturaTriangRect.getText());
            double diagonalRombo = Double.parseDouble(txtDiagonalRombo.getText());
            double ladoRombo = Double.parseDouble(txtLadoRombo.getText());
            double baseMayorTrapecio = Double.parseDouble(txtBaseMayorTrapecio.getText());
            double baseMenorTrapecio = Double.parseDouble(txtBaseMenorTrapecio.getText());
            double alturaTrapecio = Double.parseDouble(txtAlturaTrapecio.getText());

            Circulo circulo1 = new Circulo(radioCirculo);
            Cuadrado cuadrado1 = new Cuadrado(ladoCuadrado);
            Rectangulo rectangulo1 = new Rectangulo(baseRectangulo, alturaRectangulo);
            TrianguloRectangulo trianguloRectangulo1 = new TrianguloRectangulo(baseTriangRect, alturaTriangRect);
            Rombo rombo1 = new Rombo(diagonalRombo, ladoRombo);
            TrapecioIsoceles trapecio1 = new TrapecioIsoceles(alturaTrapecio, baseMayorTrapecio, baseMenorTrapecio);

            String resultados = String.format(
                "Perímetro del Círculo: %.2f\nÁrea del Círculo: %.2f\n" +
                "Perímetro del Cuadrado: %.2f\nÁrea del Cuadrado: %.2f\n" +
                "Perímetro del Rectángulo: %.2f\nÁrea del Rectángulo: %.2f\n" +
                "Área del Triángulo Rectángulo: %.2f\nPerímetro del Triángulo Rectángulo: %.2f\nTipo de Triángulo: %s\n" +
                "Área del Rombo: %.2f\nPerímetro del Rombo: %.2f\n" +
                "Área del Trapecio: %.2f\nPerímetro del Trapecio: %.2f",
                circulo1.CalcularPerimetro(), circulo1.CalcularArea(),
                cuadrado1.CalcularPerimetro(), cuadrado1.CalcularArea(),
                rectangulo1.CalcularPerimetro(), rectangulo1.CalcularArea(),
                trianguloRectangulo1.CalcularArea(), trianguloRectangulo1.CalcularPerimetro(),trianguloRectangulo1.TipoTriangulo(),
                rombo1.CalcularArea(), rombo1.CalcularPerimetro(),
                trapecio1.CalcularArea(), trapecio1.CalcularPerimetro()
                
            );

            txtAreaResultado.setText(resultados);
        } catch (NumberFormatException ex) {
            txtAreaResultado.setText("Ingrese datos válidos.");
        }
    }

    private void borrarCampos() {
        txtRadioCirculo.setText("");
        txtLadoCuadrado.setText("");
        txtBaseRectangulo.setText("");
        txtAlturaRectangulo.setText("");
        txtBaseTriangRect.setText("");
        txtAlturaTriangRect.setText("");
        txtDiagonalRombo.setText("");
        txtLadoRombo.setText("");
        txtBaseMayorTrapecio.setText("");
        txtBaseMenorTrapecio.setText("");
        txtAlturaTrapecio.setText("");
        txtAreaResultado.setText("");
    }
}
