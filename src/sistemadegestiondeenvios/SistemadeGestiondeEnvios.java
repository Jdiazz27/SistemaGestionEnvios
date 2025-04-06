package sistemadegestiondeenvios;

import javax.swing.SwingUtilities;

public class SistemadeGestiondeEnvios {
    public static void main(String[] args) {
          SwingUtilities.invokeLater(() -> {
        new pantallaPrincipal().setVisible(true);
    });
    }
    
}
