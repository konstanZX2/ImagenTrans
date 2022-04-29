import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

public class TransformaImagen {

    File f = null;
    public TransformaImagen(File imagen) {


        // Control de existencia del fichero y control de la extensión .bmp (sacar
        boolean comprobacionDeQueContieneLaExtensionBmpVerdadero = imagen.getName().contains(".bmp");
        if (imagen.exists() && comprobacionDeQueContieneLaExtensionBmpVerdadero) {
            f = imagen;
        }// mensajes de error)
        else{
            System.out.println("El archivo no existe o no tiene la extension .bmp");}

    }

    public void transformaNegativo() {
        // Transformar a negativo y guardar como *_n.bmp
        try {   FileInputStream fileInputStream = new FileInputStream(f);
            FileOutputStream fileOutputStream = new FileOutputStream("Resources/"+getNombreSinExtension()+"_n.bmp");
            byte[] buffer = new byte[54];
            fileInputStream.read(buffer);
            fileOutputStream.write(buffer);
            int numeroDelByte= 0;

            while (numeroDelByte != -1){
                numeroDelByte=fileInputStream.read();
                fileOutputStream.write(255-numeroDelByte);

            }
            fileInputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            System.out.println("ERROOOR");;
        }
    }

    public void transformaOscuro() throws IOException {

        // Transformar a una imagen más oscura y guardar como *_o.bmp


    }


    public void transformaBlancoNegro() throws IOException {

        // Transformar a una imagen en blanco y negro y guardar como *_bn.bmp

    }

  private String getNombreSinExtension() {

        //Devuelve el nombre del archivo f sin extensión
      String[] partes = f.getName().split("\\.bmp");
      return partes[0];




    }

}