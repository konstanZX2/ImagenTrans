import java.io.File;

public class Main {
    public static void main(String[] args) {
        File imagen = new File("Resources/penyagolosa.bmp");
        TransformaImagen transformaImagen = new TransformaImagen(imagen);
        transformaImagen.transformaBlancoNegro();
    }
}
