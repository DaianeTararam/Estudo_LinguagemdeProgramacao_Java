import javax.swing.JOptionPane;

/*Data: 16/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

 */
public class LT01_Function33 {
    public static void main(String[] args) {
        double num;
        num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: "));
        System.out.println(Function033(num));
    }

    static double Function033(double num){
        int contador;
        double serie;
        serie = 1.0;
        for(contador = 2; contador <= num; contador++){
            serie = serie + (1.0 /contador);
        }
        return serie;
    }
}