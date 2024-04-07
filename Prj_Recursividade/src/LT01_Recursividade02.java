import javax.swing.JOptionPane;

/*Data: 19/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Serie2 = (N) + (N -1)+(N - 2)+(N - 3)+...+(1)

 */
public class LT01_Recursividade02 {
    public static void main(String[] args) {
        int num, resultado;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        resultado = Recursividade02(num);
        JOptionPane.showMessageDialog(null, "Série: "+ resultado);    
    }
    
    static int Recursividade02(int num){
        if (num==1){
            return 1;
        }else{
            return num + Recursividade02(num-1);
        }
    }
}
