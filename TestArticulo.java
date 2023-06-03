
package Test;
import TDA.ArticuloCientifico;
public class TestArticulo {
    public static void main(String[] args) {String[]
palabras={"informatica","investigacion","matematicas","IA","programacion","Big data","fisica","logica"
,"logica matematica","Cloud computing","vectores"};
    
ArticuloCientifico articulo=new ArticuloCientifico("Máquinas de soporte vectorial para "
+ "inferir el punto de atención de automovilistas vistiendo lentes inteligentes","José M. Ramírez",palabras,"Research in Computing Science\n" +
"", (byte) 2017,"La mayoría de los métodos para inferir la distracción durante la " +
"conducción, se basan en características visuales de la postura de la cabeza");
articulo.imprimirAtributos();
        }
}
