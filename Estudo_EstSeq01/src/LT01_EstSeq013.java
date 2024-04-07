import javax.swing.JOptionPane;

/*Data: 22/02/2024
* @author: Daiane Tararam
* Versão 01
*/
/* Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias 
*  durará esse alimento sabendo que a pessoa consome 50g ao dia.
*/


public class LT01_EstSeq013 {
    public static void main(String[] args) {
        double quilos, duracao;
        quilos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de quilos: "));
        duracao = quilos / 0.50;
        JOptionPane.showMessageDialog(null, "O alimento da vai ter a durabilidade de " + duracao + " dias.");

    }
}
