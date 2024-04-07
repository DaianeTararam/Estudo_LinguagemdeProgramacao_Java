import javax.swing.JOptionPane;

/*Data: 27/02/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 */

public class LT01_EstDecisao24 {
    public static void main(String[] args) {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        if( valor%2 == 0) {
            JOptionPane.showMessageDialog(null, "O valor é divísivel por 2.");
        } else if( valor % 3 == 0){
            JOptionPane.showMessageDialog(null, "O valor é divísivel por 3.");
        }
    }
}
