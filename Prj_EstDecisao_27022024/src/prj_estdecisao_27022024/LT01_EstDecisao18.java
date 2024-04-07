import javax.swing.JOptionPane;

/*Data: 27/02/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 */

public class LT01_EstDecisao18 {
    public static void main(String[] args) {
        int num1, num2, maior, menor;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        
        if (num1 > num2){
            maior  = num1;
            menor = num2;
        }else{
            maior = num2;
            menor = num1;
        }
        JOptionPane.showMessageDialog(null, "O numero maior é: " + maior + " e o menor número é " + menor);

    }
}
