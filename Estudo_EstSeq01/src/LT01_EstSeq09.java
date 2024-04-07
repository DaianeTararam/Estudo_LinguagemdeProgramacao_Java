import javax.swing.JOptionPane;

/*Data: 21/02/2024
* @author: Daiane Tararam
* Versão 01
*/
/*Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
*/
public class LT01_EstSeq09 {
    public static void main(String[] args) {
        int num1, num2, soma;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do segundo número: ")); 
        soma = (num1 * num1) + (num2 * num2);

        JOptionPane.showMessageDialog(null, "A soma dos quadrados é: " + soma);

    }
}
