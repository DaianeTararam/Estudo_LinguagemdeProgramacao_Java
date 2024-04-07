import javax.swing.JOptionPane;

/*Data: 10/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba o número da base e do expoente. Calcule e mostre o valor da 
potência.


 */
public class LT01_EstRep44 {
    public static void main(String[] args) {
        int contador, base, expoente, potencia;
        potencia = 1;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente: "));
        
        for(contador = 1; contador <= expoente; contador++){
            potencia = potencia * base; 
        }
        JOptionPane.showMessageDialog(null, "O valor da potencia é de: "+ potencia);
    }
}
