
import javax.swing.JOptionPane;

/* Data: 20/02/2024
* @author: Daiane Tararam
* Versão 01
*/

public class LT01_EstSeq02 {
     public static void main (String args [ ] ) {
        double salario, novoSalario; 
        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário do funcionário: "));
        novoSalario = salario + (salario * 0.15);
        JOptionPane.showMessageDialog(null, "O novo salário é " + novoSalario);
     }
}
