/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntradaSalida;

import javax.swing.JOptionPane;

/**
 *
 * @author CXO Dell
 */
public class Tools {
        public static String leerString(String msje)
    {
        return (JOptionPane.showInputDialog(null,msje,JOptionPane.INFORMATION_MESSAGE));
    }
        public static void imprimepantalla(String msje)
    {
       JOptionPane.showMessageDialog(null,msje,"salida",JOptionPane.INFORMATION_MESSAGE);
    }
         public static byte leerByte(String msje)
    {
        return (Byte.parseByte(JOptionPane.showInputDialog(null,msje,"Introduce el ISBN",JOptionPane.INFORMATION_MESSAGE)));
    }
        
}
