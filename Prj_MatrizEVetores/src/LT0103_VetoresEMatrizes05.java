import javax.swing.JOptionPane;
/*Data: 30/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
10
∑ (A[1] – A[21–1])
i = 1


 */

 public class LT0103_VetoresEMatrizes05 {
    public static void main(String[] args) {
        int vetor[] = new int[20];
        int i;
        int resultado[] = new int[10];
        ColetarValores(vetor);
        int contador = 0;
        int j = 19;
        for (i = 0; i < 10; i++){
            resultado[i] = vetor[contador] - vetor[j];
            contador++;
            j--;
            System.out.println(resultado[i]);
        }

    }

    public static int[] ColetarValores(int vetor[]){
        int contador;
        for(contador = 0; contador < 20; contador++){
            vetor[contador] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ (contador + 1) + "° número:"));
        }
        return vetor;

    }
}
