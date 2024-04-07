import javax.swing.JOptionPane;
/* Data: 21/02/2024
* @author: Daiane Tararam
* Versão 02
*/

/**
* Receba os coeficientes A, B e C de uma equação do 2º grau 
* (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a 
* equação possue2 raízes).
*/
public class LT01_EstSeq05 {
    public static void main(String [] args){
        int a, b, c;
        double delta;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente C: "));
        
        delta = b * b - 4 * a * c;
        if (delta < 0){
            JOptionPane.showMessageDialog(null, "A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "As raízes reais da equação são: " + raiz1 + " e " + raiz2);
        }
    }
            
}
