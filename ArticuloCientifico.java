package TDA;
import javax.swing.JOptionPane;
public class ArticuloCientifico {
    private String nombreArticulo;
    private String nombreAutor;
    private String[] palabrasClave;
    private String nombrePublicacion;
    private byte año;
    private String resumen;

    public ArticuloCientifico(String nombreArticulo, String nombreAutor) {
        this.nombreArticulo = nombreArticulo;
        this.nombreAutor = nombreAutor;
    }

    public ArticuloCientifico(String nombreArticulo, String nombreAutor, String[] palabrasClave, String nombrePublicacion, byte año) {
       this(nombreArticulo,nombreAutor);//Invocacion del primer constructor
        this.palabrasClave = palabrasClave;
        this.nombrePublicacion = nombrePublicacion;
        this.año = año;
    }

    public ArticuloCientifico(String nombreArticulo, String nombreAutor, String[] palabrasClave, String nombrePublicacion, byte año, String resumen) {
        this(nombreArticulo,nombreAutor,palabrasClave,nombrePublicacion,año);//Invocacion del segundo constructor
        this.resumen = resumen;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String[] getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(String[] palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public String getNombrePublicacion() {
        return nombrePublicacion;
    }

    public void setNombrePublicacion(String nombrePublicacion) {
        this.nombrePublicacion = nombrePublicacion;
    }

    public byte getAño() {
        return año;
    }

    public void setAño(byte año) {
        this.año = año;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    public void imprimirAtributos(){
JOptionPane.showMessageDialog(null, "Nombre del articulo: "+nombreArticulo+
"\nNombre del autor: "+nombreAutor+"\nNombre de la publicacion:"+nombrePublicacion
+"\nAño de publicacion: "+año+"\nResumen: "+resumen);
for (int i = 0; i < palabrasClave.length; i++) {
JOptionPane.showMessageDialog(null, "\nPalabras clave: "+palabrasClave[i]);
}
}
}
