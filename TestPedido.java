package Test;

import TDA.Pedido;
import javax.swing.JOptionPane;

public class TestPedido {
    public static void main(String[] args) {
     

String respuesta;
do{int opcion=Integer.parseInt(JOptionPane.showInputDialog(null,  "Ingrese una opcion\n"
        +"Opcion 1. Pedido de un plato y una bebida\n"+"Opcion 2. pedido de 2 platos y una bebida\n"+"opcion 3."
        + "pedido de 2 platos una bebida y un postra"));
switch(opcion){
    case 1:
Pedido pedido1 = new Pedido();
pedido1.calcularPedido("hamburguesa $100", 100, "coca  $18", 18);
break;
    case 2: 
Pedido pedido2=new Pedido();
pedido2.calcularPedido("Spaguetti $80", 80, "Lomo relleno $100", 100, "coca $18", 18);
        break;
    case 3:
          Pedido pedido3=new Pedido();
pedido3.calcularPedido("hotdog $60", 60, "papas $25", 25, "coca $18", 18, "pay $25", 25);
        break;
    default:JOptionPane.showMessageDialog(null, "ingresa un numero valido"); break;
}

     respuesta=JOptionPane.showInputDialog
        (null, "Quieres solicitar otro pedido");
}while("Si".equalsIgnoreCase(respuesta));
    }
}
