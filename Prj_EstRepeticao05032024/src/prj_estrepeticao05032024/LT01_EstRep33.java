import javax.swing.JOptionPane;

/*Data: 05/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

 */
public class LT01_EstRep33 {
    public static void main(String[] args) {
        int contador;
        double num, serie;
        num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: "));
        serie = 1;
      
        for(contador = 2; contador <= num; contador++){
            serie = serie + (1.0 /contador);
        
        }
        System.out.println(serie);
    }
}
