import javax.swing.JOptionPane;

/*Data: 22/02/2024
* @author: Daiane Tararam
* Versão 01
*/
/* Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre 
a hipotenusa
*/
public class LT01_EstSeq015 {
    public static void main(String[] args) {
        int cateto1, cateto2, novoCateto1, novoCateto2, hipotenusa;
        cateto1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do cateto 1: "));
        cateto2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do cateto 2: "));
        novoCateto1 = cateto1 *cateto1;
        novoCateto2 = cateto2 *cateto2;
        hipotenusa = (int) Math.sqrt(novoCateto1 + novoCateto2); 
        JOptionPane.showMessageDialog(null,"O valor da hipotenusa é " + hipotenusa);
    }
}
