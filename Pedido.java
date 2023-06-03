package TDA;

import javax.swing.JOptionPane;

public class Pedido {
 
    
public void calcularPedido(String primerPlato,double costoPrimerPlato,String bebida, double costoBebida) {

JOptionPane.showMessageDialog(null, "el costo de "+primerPlato +" y "+bebida+" es "+(costoPrimerPlato+costoBebida));
}
public void calcularPedido(String primerPlato,double costoPrimerPlato, String segundoPlato,double costoSegundoPlato, String bebida, double costoBebida) {
JOptionPane.showMessageDialog(null, "el costo de "+primerPlato +" + "+segundoPlato+" + "+bebida+" es "+(costoPrimerPlato+costoSegundoPlato+costoBebida));

}
public void calcularPedido(String primerPlato,double costoPrimerPlato, String segundoPlato,double costoSegundoPlato, String bebida, double costoBebida, String postre,double costoPostre) {
JOptionPane.showMessageDialog(null, "el costo de "+primerPlato +" + "+segundoPlato+" + "+bebida+" + "+postre+" es "+(costoPrimerPlato+costoSegundoPlato+costoBebida+costoPostre));

}


}
