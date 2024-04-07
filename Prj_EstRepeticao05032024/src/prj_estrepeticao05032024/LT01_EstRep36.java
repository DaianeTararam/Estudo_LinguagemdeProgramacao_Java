import javax.swing.JOptionPane;

/*Data: 16/03/2024
* Programador(a): Daiane Tararam
* Versão 02

Exercicio: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!

 */
public class LT01_EstRep36 {
    public static void main(String[] args) {
        int contador, c, num, fat;
        double serie;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ")); 
        serie = 0;
        
        for ( c = 1; c <= num; c++){
            fat = 1; 
            for(contador = 1; contador <= c; contador++){
                fat = fat * contador;
                
            }
            serie = serie + (1.0 / fat);
        }
        System.out.println(serie);
    }
}

