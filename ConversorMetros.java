/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

/**
 *
 * @author CXO Dell
 */
public class ConversorMetros {
    private double metros;
   private final double METROS_CM = 100;
   private final double METROS_MILIMETROS = 1000;
   private final double METROS_PULGADAS = 39.37;
   private final double METROS_PIES = 3.28;
   private final double METROS_YARDAS = 1.09361;

    public ConversorMetros(double metros) {
        this.metros = metros;
    }

    public ConversorMetros() {
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }
   
   public double MetrosACentimetros(){
       
        return metros*METROS_CM;
       
   }
    public double MetrosAMilimetros(){
       
        return metros*METROS_MILIMETROS;
       
   }
    public double MetrosAPulgadas(){
       
        return metros*METROS_PULGADAS;
       
   }
    public double MetrosAPies(){
       
        return metros*METROS_PIES;
       
   }
    public double MetrosAYardas(){
       
        return metros*METROS_YARDAS;
       
   }
}
