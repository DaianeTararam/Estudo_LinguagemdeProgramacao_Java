import javax.swing.JOptionPane;

/*Data: 12/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 */

public class LT01_Procedure24 {
    public static void main(String[] args) {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        Procedure024(valor);
    }
    static void Procedure024(int valor){    
        if( valor%2 == 0 && valor%2 == 0) {
            JOptionPane.showMessageDialog(null, "O valor é divísivel por 2 e por 3.");
        } else{
            JOptionPane.showMessageDialog(null, "O valor não é divisível por 2 e por 3.");
        }
    }
}