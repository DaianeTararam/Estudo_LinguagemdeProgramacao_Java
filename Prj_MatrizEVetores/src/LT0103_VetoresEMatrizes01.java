import javax.swing.JOptionPane;
/*Data: 26/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Criar e coletar um vetor [50] inteiro. Calcular e exibir:
a. A média dos valores entre 10 e 200;
b. A soma dos números ímpares.

 */
public class LT0103_VetoresEMatrizes01 {
    public static void main(String[] args) {
        int vetor[] = new int[50];
        int media, soma;
        vetor = CarregarVetor(vetor);
        MostrarVetor(vetor);
        media = MediaValores(vetor);
        soma = SomaImpares(vetor);
        JOptionPane.showMessageDialog(null, "A média é " + media +"\nE a soma dos ímpares é: " + soma);
        
            
        }

    static int[] CarregarVetor(int[] vetor) {
        int contador;
        for(contador = 0; contador < 50; contador++){
            vetor[contador] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " +(contador + 1) +"° número"));
        }
        return vetor;
       
}
    static void MostrarVetor(int vetor[]){
        int contador;
        for (contador = 0; contador < 50;contador++){
            System.out.println(vetor[contador]);
        }
    }
    
    static int MediaValores(int vetor[]){
        int contador, somaC, somaM, media;
        media = 0;
        somaC = 0;
        somaM = 0;
        
        for (contador = 0; contador < 50;contador++){
           if (vetor[contador] >= 10 || vetor[contador] <= 200){
               somaC = somaC + 1;
               somaM = somaM + vetor[contador];
           } 
        }
        media = somaM / somaC; 
        return media;
    }
    
    static int SomaImpares(int vetor[]){
       int contador, soma = 0;
       for (contador = 0; contador < 50;contador++){
           if (vetor[contador]%2 != 0){
               soma = soma + vetor[contador];
           } 
       } 
       return soma;
    }
}