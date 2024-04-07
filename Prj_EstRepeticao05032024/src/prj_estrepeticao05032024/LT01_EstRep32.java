import javax.swing.JOptionPane;

/*Data: 05/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba um número inteiro. Calcule e mostre o seu fatorial.
 */
public class LT01_EstRep32 {
    public static void main(String[] args) {
        int num, contador, fatorial;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número para descobrir o fatorial: "));
        fatorial = 1;
        for (contador = num; contador > 1; contador--){
            fatorial = fatorial * contador;
            
        }
        System.out.println(fatorial);
    }
}
