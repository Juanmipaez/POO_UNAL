package POO_UNAL.Taller_6;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GestionContactosGUI ventana = new GestionContactosGUI();
                ventana.setVisible(true);
            }
        });
    }
}
