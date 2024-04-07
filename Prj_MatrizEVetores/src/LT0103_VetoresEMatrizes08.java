/*Data: 31/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos 
vendidos em 4 semanas. Calcular e exibir:
a. A quantidade de cada produto vendido no mês;
b. A quantidade de produtos vendidos por semana;
c. O total de produtos vendidos no mês.

 */

import javax.swing.JOptionPane;
public class LT0103_VetoresEMatrizes08 {
    public static void main(String[] args) {
        int matriz[][] = new int[4][3];
        int opcao = 0;
        int produtos, semana;

        while (opcao != 9){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n1 - Carregar a matriz\n2 - Visualizar Produto\n3 - Visualizar semana\n4 - Total de produtos vendidos no mês\n9 - Para sair."));

            switch(opcao){
                case 1:
                    matriz = CarregarMatriz(matriz);
                    break;
                case 2:
                    produtos = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: \n1 - Produto A\n2 - Produto B\n3 - Produto C"));
                    VisualizarProduto(matriz, produtos);
                    break;
                case 3:
                    semana = Integer.parseInt(JOptionPane.showInputDialog("Digite a semana escolhida: 1, 2, 3 ou 4."));
                    VisualizarSemana(matriz, semana);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Total de produtos vendidos no mês: "+ Total(matriz));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }
        }
    }
    static int[][] CarregarMatriz(int[][] matriz) {
        int i, j;
        for( i = 0; i < 4; i++){
            for(j = 0; j< 3; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produto "+ (j+1) +" da semana "+ (i + 1)));
            }
        }
        return matriz;
        
    }
    public static void VisualizarProduto(int[][] matriz, int produtos) {
        produtos = produtos - 1;
        int i, quantidade;
        quantidade = 0;
        for(i = 0; i < 4; i++){
            quantidade = quantidade + matriz[i][produtos];
        }
        JOptionPane.showMessageDialog(null, "A quantidade do produto vendida no mês é de: "+ quantidade);

    }

    public static void VisualizarSemana(int[][] matriz, int semana) {
       semana = semana - 1;
       int j, quantidade;
       quantidade = 0;
       for (j = 0; j < 3; j++){
            quantidade = quantidade + matriz[semana][j];
       }
       JOptionPane.showMessageDialog(null, "A quantidade de produtos vendidos na semana foi de: "+ quantidade);
    }

    
    public static int Total(int[][] matriz) {
        int soma = 0;
        int i, j;
        for (i = 0; i < 4; i++){
            for(j = 0; j< 3; j++){
                soma = soma + matriz[i][j];
            }
        }
        return soma;
    }

}
