import javax.swing.JOptionPane;

/*Data: 16/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba um número inteiro. Calcule e mostre o seu fatorial.
 */
public class LT01_Function32 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número para descobrir o fatorial: "));
        JOptionPane.showMessageDialog(null, "O fatorial é " + Function032(num) + ".");
    }
    static int Function032(int num){
        int fatorial, contador;
        fatorial = 1;
        for (contador = num; contador > 1; contador--){
            fatorial =  fatorial * contador; 
        }
        return fatorial;
    }
}