import javax.swing.JOptionPane;

/*Data: 12/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 */
public class LT01_Procedure22 {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        Procedure022(num1, num2);
        
    }
    static void Procedure022(int num1, int num2){
        if(num1 < num2){
           JOptionPane.showMessageDialog(null, "A ordem crescente é " + num1 + ", " + num2 + ".");
        }else{
           JOptionPane.showMessageDialog(null, "A ordem crescente é " + num2 + ", " + num1 + "."); 
        }
        
    }
}

