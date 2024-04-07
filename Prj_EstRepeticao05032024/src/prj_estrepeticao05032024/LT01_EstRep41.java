import javax.swing.JOptionPane;

/*Data: 05/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como 
resultado 7.

 */

public class LT01_EstRep41 {
    public static void main(String[] args) {
        int dado1, dado2, contador;
        contador = 0;
        for (dado1 = 1; dado1 <= 6; dado1++){
            for(dado2 = 6; dado2 >= 1;dado2--){
                if(dado1 + dado2 == 7){
                    contador = contador + 1;
                    System.out.println("POSSIBILIDADE "+contador+":  "+dado1 +" + "+ dado2+ " = 7.");
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Há "+contador+ " possibilidades de somar o número 7.");;
    }
}
