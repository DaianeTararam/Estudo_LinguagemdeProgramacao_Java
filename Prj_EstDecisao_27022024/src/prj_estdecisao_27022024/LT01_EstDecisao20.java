import javax.swing.JOptionPane;

/*Data: 27/02/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba 3 coeficientes A, B, e C 
de uma equação do 2º grau da fórmula AX²+BX+C=0.
Verifique e mostre a existência de raízes reais 
e se caso exista, calcule e mostre.
 */


public class LT01_EstDecisao20 {
    public static void main(String[] args) {
        int a, b, c, delta;
        double x2;
        double x1;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o coeficiente A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o coeficiente B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o coeficiente C: "));
        delta = (b * b)- (4* a * c);
        if(delta > 0) {
            JOptionPane.showMessageDialog(null, "Há duas raízes. ");
            x1 = (-b + Math.sqrt(delta))/ (2*a);
            x2 = (-b - Math.sqrt(delta))/ (2*a);
            JOptionPane.showMessageDialog(null, "x1:  " + x1 + "x2: "+ x2);
        }else if(delta == 0){
            JOptionPane.showMessageDialog(null, "Há uma raiz. ");
            x1 = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "x1: " + x1);
        }else{
            JOptionPane.showMessageDialog(null, "Não há raízes. ");
        }
    }
}
