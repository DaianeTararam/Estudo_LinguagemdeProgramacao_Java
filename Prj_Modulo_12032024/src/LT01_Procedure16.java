/*
Programador(a) : Daiane Tararam
Data: 12/03/2024
Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual 
de desconto e o número de descendentes. Calcule o salário que serão as 
horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário 
Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário 
Líquido. Exiba o salário a receber. 


*/
import javax.swing.JOptionPane;
public class LT01_Procedure16 {
    static Integer horasTrabalhadas, percentualDesconto, numeroDescendentes;
    static Double valorHora, salarioLiquido, salarioBruto; 
    public static void main(String[] args) {
        horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada: "));
        percentualDesconto = Integer.parseInt("Digite o percentual de desconto: ");
        procedureSalario();
        JOptionPane.showMessageDialog(null, "Este será o novo valor a receber: " + salarioLiquido);
    }
 
    static void procedureSalario(){
        salarioBruto = horasTrabalhadas * valorHora;
        salarioLiquido = salarioBruto - percentualDesconto;
        salarioLiquido = salarioLiquido + (numeroDescendentes * 100);
        if (numeroDescendentes != 0){
            salarioLiquido =  salarioLiquido + (100 * numeroDescendentes);
        }
    }
  
}
