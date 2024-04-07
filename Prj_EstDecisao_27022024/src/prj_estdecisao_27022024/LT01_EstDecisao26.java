import javax.swing.JOptionPane;

/*Data: 27/02/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 */
public class LT01_EstDecisao26 {
    public static void main(String[] args) {
        int num1, num2, maior, menor;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1° número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2° número: "));
        
        if (num1 > num2){
            maior = num1;
            menor = num2;
        }else{
            maior = num2;
            menor = num1;
        }

        if(maior%menor==0){
            JOptionPane.showMessageDialog(null,"O valor maior é múltiplo pelo menor valor.");
        }else{
            JOptionPane.showMessageDialog(null,"O valor maior não é múltiplo pelo menor valor.");
        }
           
    }
}
