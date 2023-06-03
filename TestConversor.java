/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
import javax.swing.JOptionPane;
import TDA.ConversorMetros;

/**
 *
 * @author CXO Dell
 */
public class TestConversor {
    public static void main(String[] args) {
        ConversorMetros metros1=new ConversorMetros();
        String respuesta;
        do{
int opcion=Integer.parseInt(JOptionPane.showInputDialog(null,  "Ingrese una opcion\n"
        +"Opcion 1. "
+ "Metros a centimetros"
+"\n"+"Opcion 2. Metros a milimetros"+"\n"+"Opcion 3. Metros"
        + " a pulgadas\n"+"Opcion 4. Metros a pies\n"+"Opcion 5. Metros a yardas\n"));
    switch(opcion){
        case 1:
            
metros1.setMetros(Double.parseDouble(
JOptionPane.showInputDialog(null, "Ingresa los metros a convertir"))); 
  JOptionPane.showMessageDialog(null, +metros1.getMetros()+" metros a centimetros es: "
          +metros1.MetrosACentimetros());
        break;

        case 2: 
            
    metros1.setMetros(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa los metros a convertir")));
  JOptionPane.showMessageDialog(null, +metros1.getMetros()+" metros a milimetros es: "+metros1.MetrosAMilimetros());  
    break;
        case 3:
            
            metros1.setMetros(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa los metros a convertir")));
     JOptionPane.showMessageDialog(null, +metros1.getMetros()+" metros a pulgadas es: "+metros1.MetrosAPulgadas());       
            break;
        case 4:
                
metros1.setMetros(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa los metros a convertir"))); 
   JOptionPane.showMessageDialog(null, +metros1.getMetros()+" metros a pies es: "+metros1.MetrosAPies());     
        break;
        case 5:
            
metros1.setMetros(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa los metros a convertir"))); 
JOptionPane.showMessageDialog(null, +metros1.getMetros()+" metros a yardas es: "+metros1.MetrosAYardas());        
        break;
        default: JOptionPane.showMessageDialog(null, "Ingrese un numero valido");break;
    }      
            respuesta=JOptionPane.showInputDialog
        (null, "Quieres hacer otra conversion?");
        }while("Si".equalsIgnoreCase(respuesta));
    }
}
