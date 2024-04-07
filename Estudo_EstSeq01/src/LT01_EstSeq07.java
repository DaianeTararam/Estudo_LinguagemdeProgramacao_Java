import javax.swing.JOptionPane;
/*Data: 21/02/2024
* @author: Daiane Tararam
* Versão 01
*/
/*Receba os valores do comprimento, largura e altura de um paralelepípedo. 
* Calcule e mostre seu volume.
*/
public class LT01_EstSeq07 {
    public static void main(String[] args) {
        double comprimento, largura, altura, volume;
        comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do comprimento: "));
        largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da largura: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da altura: "));

        volume = comprimento * altura * largura;

        JOptionPane.showMessageDialog(null, "O volume do paralelepípedo é: " + volume);
    }
}
