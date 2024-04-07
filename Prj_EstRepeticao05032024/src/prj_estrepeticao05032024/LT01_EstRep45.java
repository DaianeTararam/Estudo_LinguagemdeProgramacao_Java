import javax.swing.JOptionPane;

/*Data: 10/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225.


 */
public class LT01_EstRep45 {
    public static void main(String[] args) {
        double serie, contador, divisor, termo;
        serie = 0;
        divisor = 1.0;
        for (contador = 1; contador <= 15; contador++){
            termo = contador / (divisor * divisor);
            if(termo%2==0){
                serie = serie - termo;
            }else{
                serie = serie + termo;
            }
            divisor++;
        }
        JOptionPane.showMessageDialog(null, "O resultado é: "+ serie);
    }
}
