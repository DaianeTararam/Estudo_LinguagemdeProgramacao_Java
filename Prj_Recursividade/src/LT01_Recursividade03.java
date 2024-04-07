import javax.swing.JOptionPane;
/*Data: 19/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 

 */
public class LT01_Recursividade03{
    public static void main(String[] args) {
        int num;
        double serie;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
        serie = Recursividade03(num);
        JOptionPane.showMessageDialog(null, "Resultado da série: "+ serie);
        
    }
    static double Recursividade03(int num){
        if (num==1){
            return 1.0;
        }else{
            return 1.0/num + Recursividade03(num -1);
        }
    }    
}
