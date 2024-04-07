import javax.swing.JOptionPane;
/*Data: 26/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Criar e coletar um vetor [100] inteiro e exibir:
a. O maior e o menor valor;
b. A média dos valores.

 */
public class LT0103_VetoresEMatrizes02 {
    public static void main(String[] args) {
        int vetor[] = new int[100];
        int media;
        vetor = CarregarVetor(vetor);
        media = MediaValores(vetor);
        MaiorMenorValor(vetor);
        JOptionPane.showMessageDialog(null, "A média dos valores é: "+ media);
        
            
        }

    static int[] CarregarVetor(int[] vetor) {
        int contador;
        for(contador = 0; contador < 100; contador++){
            vetor[contador] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " +(contador + 1) +"° número"));
        }
        return vetor;
       
    }
    static int MediaValores(int vetor[]){
        int contador, somaC, somaM, media;
        media = 0;
        somaC = 0;
        somaM = 0;
        
        for (contador = 0; contador < 100;contador++){
               somaC = somaC + 1;
               somaM = somaM + vetor[contador];
        }
        media = somaM / somaC; 
        return media;
    }
    
    static void MaiorMenorValor(int vetor[]){
        int contador, maior, menor;
        maior = vetor[0];
        menor = vetor[0];
        for (contador = 0; contador < 100;contador++){
            if (vetor[contador] < menor){
                menor =  vetor[contador];
            }else if(vetor[contador]> maior){
                maior = vetor[contador];
            }   
        }
        JOptionPane.showMessageDialog(null, "O maior número é: "+ maior+ "\nO menor número é: "+ menor);
        }
}
