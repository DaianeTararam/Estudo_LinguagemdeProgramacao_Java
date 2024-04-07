import javax.swing.JOptionPane;

/*Data: 16/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!

 */
public class LT01_Function36 {
    public static void main(String[] args) {
        int num;
        double serie;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ")); 
        serie =  Function036(num);
        System.out.println(serie);
    }

    static double Function036(int num){
        int contador, c, fat;
        double serie;
        serie = 0;
        
        for ( c = 1; c <= num; c++){
            fat = 1; 
            for(contador = 1; contador <= c; contador++){
                fat = fat * contador;
                
            }
            serie = serie + (1.0 / fat);
        }
        return serie;
    }
}
