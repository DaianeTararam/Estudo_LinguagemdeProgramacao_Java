import javax.swing.JOptionPane;

/* Data: 20/02/2024
* @author: Daiane Tararam
* Versão 01
*/

public class LT01_EstSeq03 {
    public static void main (String args [ ] ) {
        int base, altura, area;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do triângulo: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do triângulo: "));
        area = base * altura;
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
    
}
