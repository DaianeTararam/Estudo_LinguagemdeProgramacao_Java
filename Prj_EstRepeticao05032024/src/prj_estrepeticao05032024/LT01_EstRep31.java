/*Data: 05/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Calcule e mostre o quadrado dos números entre 10 e 150.
 */
public class LT01_EstRep31 {
    public static void main(String[] args) {
        int  num, quadrado;
        for(num =10; num <= 150; num++ ){
            quadrado = num * num;
            System.out.println("O quadrado de "+num+ " é " +quadrado+ ".");
        }
    }
}
