import javax.swing.JOptionPane;
/*Data: 30/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Criar e coletar em um vetor [20] com números aleatórios. Classificar este 
vetor em ordem crescente e mostre os dados


 */

public class LT0103_VetoresEMatrizes06 {
    public static void main(String[] args) {
        int vetor[] = new int[20];
        ColetarValores(vetor);
        ClassificaVetor(vetor);
        MostraVetor(vetor);

    }
    public static int[] ColetarValores(int vetor[]){
        int contador;
        for(contador = 0; contador < 20; contador++){
            vetor[contador] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ (contador + 1) + "° número:"));
        }
        return vetor;

    }

    public static int[ ] ClassificaVetor(int vt[ ])  {
        int i,j, aux;
        for ( i = 0 ; i < 20 ; i++ ){
            for ( j = i+1 ; j < 19 ; j++ ){
                if ((vt[i] > vt[j])) {
                    aux = vt[i];
                    vt[i] = vt[j];
                    vt[j] = aux; 
                }
            }   
        }
        return vt;   
    }

    public static void MostraVetor(int vt[ ]){
	    int cta;
        for ( cta = 0 ; cta < 4 ; cta++ ){
	        System.out.println ("Vet[" + cta + "] = " +vt[cta]); 
	    }
        System.out.println ("******************************");
    }   
}
