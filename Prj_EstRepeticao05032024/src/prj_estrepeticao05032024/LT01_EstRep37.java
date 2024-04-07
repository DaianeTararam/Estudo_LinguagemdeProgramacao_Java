import javax.swing.JOptionPane;

/*Data: 05/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu 
N’nésimo termo

 */
public class LT01_EstRep37 {
    public static void main(String[] args) {
       int num, a, b, c, cont;
       num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
       a = 0;
       b = 1;
       System.out.print(a + " " + b + " ");
       for(cont = 3; cont <= num; cont++){
           c = a + b;
           System.out.print(" " + c);
           a = b;
           b = c;
           
           
       }
    }
}
