import javax.swing.JOptionPane;
/*Data: 26/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Criar e coletar em um vetor [30] real e calcular e exibir:
a. A média do grupo;
b. A quantidade de notas acima do grupo;
c. As posições dos valores abaixo da média do grupo.

 */
public class LT0103_VetoresEMatrizes04 {
    public static void main(String[] args) {
        int vetor[] = new int[30];
        int media;
        vetor = CarregarVetor04(vetor);
        media = MediaValores(vetor);  
        AcimaAbaixo(vetor, media);
        }

    public static int[] CarregarVetor04(int[] vetor) {
        int contador;
        for(contador = 0; contador < 30; contador++){
            vetor[contador] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " +(contador + 1) +"° número"));
        }
        return vetor;
    }

    static int MediaValores(int vetor[]){
        int contador, somaC, somaM, media;
        media = 0;
        somaC = 0;
        somaM = 0;
        
        for (contador = 0; contador < 30;contador++){
               somaC = somaC + 1;
               somaM = somaM + vetor[contador];
        }
        media = somaM / somaC; 
        return media;
    }
    
    public static void AcimaAbaixo(int vt[], double media){
        int contador, acima;
        acima = 0;
        System.out.println("QUANTIDADE DE NOTAS ACIMA DA MÉDIA e POSIÇÕES ABAIXO DA MÉDIA: ");
        for (contador = 0; contador < 30; contador++){
            if (vt[contador] > media){
                acima = acima +1;
            }
            System.out.println(acima);
            if(vt[contador] < media){
                System.out.println("Posição: " + vt[contador + 1]);
            }   
        }
}
}
