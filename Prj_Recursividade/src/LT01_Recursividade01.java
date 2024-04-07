import javax.swing.JOptionPane;

/*Data: 19/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Serie1 = (1+2+3+...+100)

 */
public class LT01_Recursividade01 {
    public static void main(String[] args) {
        int num;
        num = 1;
        JOptionPane.showMessageDialog(null, Recursividade02(num));    
    }
    
    static int Recursividade01(int num){
        int serie;
        serie =  0;
        while(num <= 100){
            serie =  (num + Recursividade02(num + 1));
            return serie;
        }
        return 1;
}
}