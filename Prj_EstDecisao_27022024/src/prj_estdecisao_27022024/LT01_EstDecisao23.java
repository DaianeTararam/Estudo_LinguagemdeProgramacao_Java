import javax.swing.JOptionPane;

/*Data: 27/02/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
Mostre os 4 números em ordem crescente.
 */

public class LT01_EstDecisao23 {
    public static void main(String[] args) {
        int num1, num2, num3, num4;     

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE OS NÚMEROS EM ORDEM CRESCENTE  \nDigite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número: "));
        num4 = 6;
        
        if (num1 > num2 || num2 > num3) {
            JOptionPane.showMessageDialog(null, "Os três primeiros números não estão em ordem crescente.");
            return;
        }

        if (num4 <= num1){
            JOptionPane.showMessageDialog(null, "A ordem correta dos números é: " + num4 + ", " + num1 + ", " + num2 +", "+ num3 + ".");
        }else if(num4 <= num2 && num4 < num3){
            JOptionPane.showMessageDialog(null, "A ordem correta dos números é: " + num1 + ", " + num4 + ", " + num2 +", "+ num3 + ".");
        }else if(num4 <= num3){
            JOptionPane.showMessageDialog(null, "A ordem correta dos números é: " + num1 + ", " + num2 + ", " + num4 +", "+ num3 + ".");
        }else{
            JOptionPane.showMessageDialog(null, "A ordem correta dos números é: " + num1 + ", " + num2 + ", " + num3 +", "+ num4 + ".");
        }        
    }

}

    