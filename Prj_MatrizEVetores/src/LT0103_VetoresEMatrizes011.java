/*Data: 31/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
Exercicio 11 da lista

 */

 public class LT0103_VetoresEMatrizes011 {
    public static void main(String[] args) {
        int matriz[][] = new int[8][8];
        int x, y, z;
        for(z = 1; z <= 4; z++){
            for(x = (z-1); x <= (8-z) ;x++){
                for(y = (z-1); y <= (8-z); y++){
                    matriz[x][y] = z;
                }
            }
        }
        for(x = 0; x < 8; x++){
            for(y = 0; y < 8; y++){
                System.out.print(matriz[x][y] + " ");
                    
            }
            System.out.println(); 
        }
    }  
}         

