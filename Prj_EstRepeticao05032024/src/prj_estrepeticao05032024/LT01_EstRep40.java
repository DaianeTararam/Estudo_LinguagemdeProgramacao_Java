import javax.swing.JOptionPane;

/*Data: 05/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba 2 números inteiros. Verifique e mostre todos os números primos 
existentes entre eles.

 */

public class LT01_EstRep40 {
    public static void main(String[] args) {
        int num, num1, num2, contador, i;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o menor número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o maior número: "));

        for (num = num1; num <= num2; num++) {
            contador = 0;
            for (i = 1; i <= num; i++) {
                if (num % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                JOptionPane.showMessageDialog(null, num + " é PRIMO!");
            }
        }
    }
}

