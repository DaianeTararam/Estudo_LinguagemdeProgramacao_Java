/*Data: 30/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio:  A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e 
verificar a sua existência no vetor (utilizar pesquisa binária).


 */

import javax.swing.JOptionPane;

public class LT0103_VetoresEMatrizes07 {
    public static void main(String[] args) {
        int vetor[] = new int[20];
        int procurado, posicao;
        ColetarValores(vetor);
        ClassificaVetor(vetor);
        MostraVetor(vetor);

        procurado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor procurado: "));
        posicao = PesquisaBinaria(vetor, procurado);

        if (posicao != -1) {
            System.out.println("O elemento " + procurado + ".");
        } else {
            System.out.println("O elemento " + procurado + " não foi encontrado no vetor.");
        }
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

    public static int PesquisaBinaria(int vetor[], int procurado){
        int inicio, meio, fim ;
        inicio = 0;
        fim = vetor.length - 1;
        while(inicio <= fim){
            meio = (inicio + fim) / 2;
            if(vetor[meio]== procurado){
                return meio;
            }else if(vetor[meio] < procurado){
                inicio = meio + 1;
            }else {
                fim = meio - 1;
            }

        }
        return -1 ;

    } 
}

