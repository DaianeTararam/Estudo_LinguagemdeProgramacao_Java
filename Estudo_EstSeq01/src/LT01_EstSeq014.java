import javax.swing.JOptionPane;

/*Data: 22/02/2024
* @author: Daiane Tararam
* Versão 01
*/
/* Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
*/

public class LT01_EstSeq014 {
    public static void main(String[] args) {
        int angulo1, angulo2, angulo3;
        angulo1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do 1° angulo: "));
        angulo2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do 2° angulo: "));
        angulo3 = 180 - (angulo1 + angulo2);
        
        JOptionPane.showMessageDialog(null, "O valor do terceiro angulo é: " + angulo3);

    }
}
