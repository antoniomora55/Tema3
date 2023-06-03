/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

import javax.swing.JOptionPane;

/**
 *
 * @author ITO
 */
public class Salon {
    private double largo;
    private double ancho;

    public Salon(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Salon{" + "largo=" + largo + ", ancho=" + ancho + '}';
    }

    public void calculoAreas(double largo1,double ancho1,double largo2,double ancho2){
       JOptionPane.showMessageDialog(null, "Area cubierta: "+((largo1*ancho1)+(largo2*ancho2))+"\nArea no cubierta: "+((largo*ancho)-((largo1*ancho1)+(largo2*ancho2))));
        System.out.println("Area cubierta: "+((largo1*ancho1)+(largo2*ancho2)));
        System.out.println("\nArea no cubierta: "+((largo*ancho)-((largo1*ancho1)+(largo2*ancho2))));
        
    }

}
