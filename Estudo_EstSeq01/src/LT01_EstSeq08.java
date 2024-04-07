import javax.swing.JOptionPane;
/*Data: 21/02/2024
* @author: Daiane Tararam
* Versão 01
*/
/*Receba o valor de um depósito em poupança. Calcule e mostre o valor após 
* 1 mês de aplicação sabendo que rende 1,3% a. m.
*/
public class LT01_EstSeq08 {
    public static void main(String[] args) {
        double deposito, rendimento;
        deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de depósito: "));
        rendimento = deposito + (deposito * 0.013);
        JOptionPane.showMessageDialog(null, "O valor após a aplicação em um mês, será de: R$" + rendimento);
    }
}
