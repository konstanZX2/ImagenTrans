import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

public class TransformaImagen {

    File f = null;

    public TransformaImagen(File imagen) {
        boolean comprobacionDeQueContieneLaExtensionBmpVerdadero = imagen.getAbsolutePath().contains(".bmp");
        if (imagen.exists() && comprobacionDeQueContieneLaExtensionBmpVerdadero) {
            f = imagen;
        }

        // Control de existencia del fichero y control de la extensión .bmp (sacar

        // mensajes de error)

    }

    public void transformaNegativo() throws IOException {

        // Transformar a negativo y guardar como *_n.bmp

    }

    public void transformaOscuro() throws IOException {

        // Transformar a una imagen más oscura y guardar como *_o.bmp


    }


    public void transformaBlancoNegro() throws IOException {

        // Transformar a una imagen en blanco y negro y guardar como *_bn.bmp

    }

    private String getNombreSinExtension() {

        //Devuelve el nombre del archivo f sin extensión


    }

}