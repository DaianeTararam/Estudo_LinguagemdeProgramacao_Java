import javax.swing.JOptionPane;

/*Data: 27/02/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba 2 valores reais. Calcule e mostre o maior deles.
 */

public class LT01_EstDecisao19 {
    public static void main(String[] args) {
        double num1, num2, maior, menor;
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        
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
