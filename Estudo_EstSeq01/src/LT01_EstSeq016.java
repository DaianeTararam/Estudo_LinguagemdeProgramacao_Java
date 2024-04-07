import javax.swing.JOptionPane;

/*Data: 23/02/2024
* @author: Daiane Tararam
* Versão 01
*/
/* Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de 
desconto e o número de descendentes. Calcule o salário que serão as horas 
trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto –
desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. 
Exiba o salário a receber.

*/
public class LT01_EstSeq016 {
    public static void main(String[] args) {
        int horasTrabalhadas, percentual, descendentes;
        double valorHora, salarioBruto, salarioLiquido;
        horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de horas trabalhadas: "));
        valorHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da hora: "));
        descendentes = Integer.parseInt(JOptionPane.showInputDialog(null, "POssui quantos descendentes: "));
        percentual = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o percentual de desconto: "));
        salarioBruto = horasTrabalhadas * valorHora;
        salarioLiquido = salarioBruto - percentual;
        salarioLiquido = salarioLiquido + (descendentes * 100);
        JOptionPane.showMessageDialog(null, "O salario bruto foi de R$"+ salarioBruto + " e o salario final à receber é de R$" + salarioLiquido);

    }
}
