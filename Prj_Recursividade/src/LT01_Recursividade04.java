import javax.swing.JOptionPane;

/*Data: 19/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N) 

 */
public class LT01_Recursividade04 {
    public static void main(String[] args) {
        int num;
        double serie;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
        serie = Recursividade04(num, 1);
        JOptionPane.showMessageDialog(null, "Resultado da serie: " + serie);
    }
    static double Recursividade04(double num, int i){
        if (num == 1) {
            return 1.0;
        } else {
            return num / i + Recursividade04(num - 1, i+1);
        }
        
    }     
}
