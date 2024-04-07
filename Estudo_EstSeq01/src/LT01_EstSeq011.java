import javax.swing.JOptionPane;

/*Data: 21/02/2024
* @author: Daiane Tararam
* Versão 01
*/
/* Receba o raio de uma circunferência. Calcule e mostre o comprimento da 
circunferência.
*/
public class LT01_EstSeq011 {
    public static void main(String[] args) {
        double raio, comprimento;
        raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do raio: "));
        comprimento = 2 * 3.14 * raio;
        JOptionPane.showMessageDialog(null, "O comprimento da circunferência é aproximadamente: "+ comprimento);
    }
}
