import javax.swing.JOptionPane;
/* Data: 20/02/2024
* @author: Daiane Tararam
* Versão 01
*/


public class LT01_EstSeq04 {
    public static void main(String [] args){
        double celsius, fahrenheit;
        celsius = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em graus celsius: "));
        fahrenheit = ((9 * celsius)+160)/ 5;
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é : " + fahrenheit + " °F.");
    }
            
}
