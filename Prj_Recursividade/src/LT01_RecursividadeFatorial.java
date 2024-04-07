import javax.swing.JOptionPane;

/*Data: 19/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Faça um fatorial utilizando recursividade.

 */
public class LT01_RecursividadeFatorial {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
        JOptionPane.showMessageDialog(null ,Recursividade01(num));   
    }
    
    static int Recursividade01(int num) {
        int fat;
        while(num > 1){
            fat = (num * Recursividade01(num-1));
            return fat;
        }
        return 1;
    }
}
