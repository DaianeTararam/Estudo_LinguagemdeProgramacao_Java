import javax.swing.JOptionPane;

/*Data: 21/02/2024
* @author: Daiane Tararam
* Versão 01
*/
/*Receba 2 números reais. Calcule e mostre a diferença desses valores.
*/
public class LT01_EstSeq010 {
    public static void main(String[] args) {
        double num1, num2, diferenca;
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 1° Valor: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 2° Valor: "));
        if (num1 > num2){
            diferenca = num1 - num2;
        }else{
            diferenca = num2 - num1;
        }
        JOptionPane.showMessageDialog(null, "A diferença entre os dois números é " + diferenca);
    }
}
