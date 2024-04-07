/*Data: 31/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a 
diagonal principal terá seus dados carregados no programa segundo:
 [0,0] = 1
 [1,1] = 4
 [2,2] = 16
 [3,3] = 64

 */

import javax.swing.JOptionPane;

public class LT0103_VetoresEMatrizes09 {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int i, j, num;
        num = 1;
        matriz[0][0] = num;
        
        for (i= 0; i < 4; i++){
            for(j = 0; j< 4; j++){
                if (i == j){
                    matriz[i][j] = num;
                    num = matriz[i][j] * 4;
                }else{
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o um valor para preencher: "));
                }
                if( j < 3){
                    System.out.print("  " + matriz[i][j]);
                }else if (j == 3){
                    System.out.println(" " + matriz[i][j]);
                }
            }
        }
    }    

}
