import javax.swing.JOptionPane;

/*Data: 27/02/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 */
public class LT01_EstDecisao22 {
    public static void main(String[] args) {
        int num1, num2, aux;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        
        if(num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        JOptionPane.showMessageDialog(null, "A ordem crescente é " + num1 + ", " + num2 + ".");
    }
}
