import javax.swing.JOptionPane;

/*Data: 03/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do 
investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a 
poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.

 */

public class LT01_EstDecisao29 {
    public static void main(String[] args) {
        int tipo;
        double valorInvestimento, valorCorrigido;
        tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tipo de investimento. \n1 - POUPANÇA \n2 - RENDA FIXA"));
        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do investimento: "));
        if (tipo == 1){
            valorCorrigido = valorInvestimento * 1.03;
            JOptionPane.showMessageDialog(null, "O novo valor após 30 dias é de: " + valorCorrigido);
        }else if (tipo == 2){
            valorCorrigido = valorInvestimento * 1.05;
            JOptionPane.showMessageDialog(null, "O novo valor após 30 dias é de: " + valorCorrigido);
        }else{
            JOptionPane.showMessageDialog(null, "Tipo INCORRETO!");
        }

    }
}
