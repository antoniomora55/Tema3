/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import EntradaSalida.Tools;
import TDA.Empleado;

/**
 *
 * @author CXO Dell
 */
public class TestEmpleado {
    public static void main(String[] args) {
        Empleado carlos =new Empleado("Carlos Perez",(byte)25,(byte)40,180.50);
        Empleado sonia =new Empleado("Sonia alvares",(byte)19,(byte)45,180.50);   
        Empleado alma =new Empleado("Alma alvares ",(byte)23,(byte)44,180.50);   
        String cad="Empeado con mayor edad: "+Empleado.edadMayor(carlos, sonia)+"\n";
        cad+="Empleado con mas horas trabajadas: "+Empleado.masHrsTtrabajadas(carlos, sonia)+"\n";
        Tools.imprimepantalla(cad+"\n"+carlos.toString()+"\n"+sonia.toString()+"\n"+alma.toString()+
        "\n"+ "Total de objetos creados"+Empleado.getConta());
    }
}
