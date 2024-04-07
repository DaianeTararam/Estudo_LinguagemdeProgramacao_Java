import javax.swing.JOptionPane;
/*Data: 21/02/2024
* @author: Daiane Tararam
* Versão 01
* Receba os valores em x e y. Efetua a troca de seus valores e mostre seus 
* conteúdos.
*/

public class LT01_EstSeq06 {
    public static void main(String [] args){
        int x, y, aux;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
        
        if (x != y){
            aux = x;
            x = y;
            y = aux;
            JOptionPane.showMessageDialog(null, "Agora X = " + x + " e Y é igual a = " + y);
        }else{
            JOptionPane.showMessageDialog(null, "X e Y tem os valores iguais.");
        }

    }
}
