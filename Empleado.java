package TDA;

public class Empleado {
    private int clave;
    private String nombre;
    private byte edad;
    private byte HrsTrabajadas;
    private double pagoxhora;
    private static byte conta=0;
    private static short inicial=1000;
    public Empleado(String nombre, byte edad, byte HrsTrabajadas, double pagoxhora) {
        this.clave=inicial;
        this.nombre = nombre;
        this.edad = edad;
        this.HrsTrabajadas = HrsTrabajadas;
        this.pagoxhora = pagoxhora;
        conta++;
        inicial+=2;
    }

    public static byte getConta() {
        return conta;
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

    public byte getHrsTrabajadas() {
        return HrsTrabajadas;
    }

    public void setHrsTrabajadas(byte HrsTrabajadas) {
        this.HrsTrabajadas = HrsTrabajadas;
    }

    public double getPagoxhora() {
        return pagoxhora;
    }

    public void setPagoxhora(double pagoxhora) {
        this.pagoxhora = pagoxhora;
    }

    @Override
    public String toString() {
        return "Empleado{" + "clave=" + clave + ", nombre=" + nombre + ", edad=" + edad + 
        ", HrsTrabajadas=" + HrsTrabajadas + ", pagoxhora=" + pagoxhora + '}';
    }

   
    
    public static Empleado edadMayor(Empleado emp1, Empleado emp2){
        return (emp1.edad>=emp2.edad)? emp1:emp2;
    
    }
    public static Empleado masHrsTtrabajadas(Empleado emp1, Empleado emp2){
        
       return (emp1.HrsTrabajadas>=emp2.HrsTrabajadas) ?emp1:emp2;
        
    }
}
