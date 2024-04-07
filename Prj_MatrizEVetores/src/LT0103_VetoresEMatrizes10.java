/*Data: 31/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Criar uma matriz [8][8] onde o programa irá carregar segundo:
Casa: 1  2,  3, 4, 5...
Valor: 1, 2, 4, 8, 16...

 */

public class LT0103_VetoresEMatrizes10 {
    public static void main(String[] args) {
        long matriz[][] = new long[8][8];
        int i,j;
        long num = 1;
        int contador = 1;
        for (i = 0; i < 8; i++){
            for(j = 0; j < 8; j++){
                if(i == 0 && j == 0){
                    matriz[i][j] = num;
                    System.out.println("Casa: " + contador + " Valor: " +matriz[i][j]);
                    contador++;
                }else{
                    matriz[i][j] = num * 2;
                    num = matriz[i][j];
                    System.out.println("Casa: " + contador + " Valor: " +matriz[i][j]);
                    contador++;
                }
            }
        }
    }
}
