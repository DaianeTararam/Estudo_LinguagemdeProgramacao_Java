/*Data: 05/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99

 */

 public class LT01_EstRep42 {
    public static void main(String[] args) {
        int contador;
        double serie, divisor;
        serie = 1.0;
        divisor = 3.0;
        for(contador = 2; contador <= 50; contador++){ 
            serie = serie + (contador / divisor);
            divisor = divisor + 2;
            System.out.println(serie);
        }
        System.out.println(serie);
    }
 }