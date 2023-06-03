package TDA;
import javax.swing.JOptionPane;
public class AsistenteBoda {
private String nombre;
private  byte edad;
private String sexo;
private String estadoCivil;
private static int contadorHombres=0;
   private static int contadorMujeres=0;
   private static int contadorCasados=0;
   private static int contadorSolteros=0;
  private  static int contadorDivorciados=0;
   private static int contadorViudos=0;
   private static int contadorSeparados=0;
   private static int total=0;
    public AsistenteBoda(String nombre, byte edad, String sexo,String estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCivil=estadoCivil;
        total++;
    }

    public AsistenteBoda() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public static int getContadorHombres() {
        return contadorHombres;
    }

    public static int getContadorMujeres() {
        return contadorMujeres;
    }

    public static int getContadorCasados() {
        return contadorCasados;
    }

    public static int getContadorSolteros() {
        return contadorSolteros;
    }

    public static int getContadorDivorciados() {
        return contadorDivorciados;
    }

    public static int getContadorViudos() {
        return contadorViudos;
    }

    public static int getContadorSeparados() {
        return contadorSeparados;
    }

    public static int getTotal() {
        return total;
    }
    

    public void contadorSexo(){
        if(sexo.equalsIgnoreCase("Hombre")){
            contadorHombres++;
                }else{
                    contadorMujeres++;
}
}
        public void contadorEdoCivil(){

            if(estadoCivil.equalsIgnoreCase("soltero") || estadoCivil.equalsIgnoreCase("soltera")){
                contadorSolteros++;
              }
        else if(estadoCivil.equalsIgnoreCase("casado")|| estadoCivil.equalsIgnoreCase("casada")){
     contadorCasados++;
}
else if(estadoCivil.equalsIgnoreCase("divorciado")|| estadoCivil.equalsIgnoreCase("divorciada")){
     contadorDivorciados++;
}
else if(estadoCivil.equalsIgnoreCase("viudo")|| estadoCivil.equalsIgnoreCase("viuda")){
   contadorViudos++;
}
else{
    contadorSeparados++;
}   
}
    public void imprimirDatos(){
JOptionPane.showMessageDialog(null, "Total de hombres: "+contadorHombres+"\nTotal de mujeres"
+contadorMujeres+"\nTotal de casados: "+contadorCasados+"\nTotal de solteros: "+contadorSolteros+"\nTotal de "
+"viudos: "+contadorViudos+"\nTotal de separados: "+contadorSeparados+"\nTotal de divorciados"+contadorDivorciados);

   
  }
  public  int MayorEdad(){
      
   return (edad=(byte) Integer.MAX_VALUE);
      
  }
   public int MenorEdad(){
      
    return (edad=(byte) Integer.MIN_VALUE);
      
  }

   }

 