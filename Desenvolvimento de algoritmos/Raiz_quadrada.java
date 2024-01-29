
package atividade_3;
import javax.swing.JOptionPane;

public class Raiz_quadrada {
    public static void main(String[] args) {
    float a, b, c, delta, raiz1, raiz2;
    
    a = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de A")); 
    b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de B"));
    c = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de C"));
    
    delta = (b*b)-(4*a*c);
    
    if (delta<0){
       JOptionPane.showMessageDialog(null,"Essas raízes não serão calculadas.");
        }
    
    else{
          raiz1 = -b+(float)(Math.sqrt(delta))/2*a;
          raiz2 = -b-(float)(Math.sqrt(delta))/2*a;
          JOptionPane.showMessageDialog(null,"A raíz (+) é " + raiz1);
          JOptionPane.showMessageDialog(null,"A raíz (-) é " + raiz2);
    }
  }
}


/*inicio
real a, b, c, delta, raiz1, raiz2;

 escreva("Escreva valor do coeficiente A")
 leia(a)
 escreva("Escreva valor do coeficiente B")
 leia(b)
 escreva("Escreva valor do coeficiente C")
 leia(c)

 delta=(b^2)-4*a*c

 se(delta>0){
     raiz1=-b+raiz(delta)/2*a

 escreva("A raíz é" + raiz1)
     raiz2=-b+raiz(delta)/2*a

escreva("A raíz (+) é" + raiz1)
escreva("A raíz (-) é" + raiz2)
 }
senao{
    escreva("Essas raízes não serão calculadas.")
}
fim
 */

