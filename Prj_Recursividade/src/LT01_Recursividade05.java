import javax.swing.JOptionPane;

/*Data: 24/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)! 

 */
public class LT01_Recursividade05 {
    public static void main(String[] args) {
        double num;
        num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        double resultado = Recursividade05(num);
        System.out.println("Serie5 = " + resultado);
    }

    public static double Recursividade05(double num) {
        if (num == 1) {
            return Fatorial(num);
        } else {
            return Fatorial(num) + Recursividade05(num - 1);
        }
    }

    public static double Fatorial(double num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * Fatorial(num - 1);
        }
    }
}
