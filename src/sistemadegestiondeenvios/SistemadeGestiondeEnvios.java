package sistemadegestiondeenvios;

import javax.swing.SwingUtilities;

public class SistemadeGestiondeEnvios {
    public static void main(String[] args) {
          SwingUtilities.invokeLater(() -> {
        new pantallaPrincipal().setVisible(true);
        //comentario pal branch
    });
    }
    
}

/*
- Hay que quitar el boton Datos del paquete de la pantalla de datos del remitente
- Hay que revisar el tipo de letra de los frames que se agregaron nuevos (creo que solo es el del reporteDeEntregas)
- Diseño de los frames q esten en blanco (que no esten iguales a los del programa en si)
- OPCIONAL si quieres cambias la forma en la que se muestran las respuestas en los textArea (mas emojis, menos emojis, idk)
- Tiras un prueba y error con varios datos y antes de hacer push eliminas los archivos que se te generan en el pc 
NO VAYAS A ELIMINAR EL ARCHIVO ESTADOS, SOLO CLIENTES, REPORTE_DEL_PAQUETE Y TARIFA
*/