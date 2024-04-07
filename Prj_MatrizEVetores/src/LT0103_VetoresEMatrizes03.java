/*Data: 26/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. 
ex: VT1| 1| 2| 3| |VT2| 4| 5| 6| |VT3| 1| 2| 3| 4| 5| 6

 */
public class LT0103_VetoresEMatrizes03 {
    public static void main(String[] args) {
        int vetor01[] = new int[3];
        int vetor02[] = new int[3];
        int vetor03[] = new int[6];
        
        CarregarVetor01(vetor01);
        CarregarVetor02(vetor02);
        CarregarVetor03(vetor01, vetor02, vetor03);
        MostrarValores(vetor01, vetor02, vetor03);
    }
    
    public static int[] CarregarVetor01(int vetor01[]){
        int contador;
        for(contador = 0; contador < 3; contador++){
            vetor01[contador] = contador + 1;
        }
        return vetor01;
    }
    
    public static int[] CarregarVetor02(int vetor02[]){
        int contador;
        for(contador = 0; contador < 3; contador++){
            vetor02[contador] = contador + 4;
        }
        return vetor02;
    }
    public static int[] CarregarVetor03(int vt1[],int vt2[], int vt3[]){
        int contador;
        for(contador = 0; contador < 3 ; contador++){
            vt3[contador] = vt1[contador];
            vt3[4 + contador] = vt2[contador];
        }
        return vt3;
    }
    
    public static void MostrarValores(int vt1[], int vt2[], int vt3[]){
        int contador;
        for (contador= 0; contador < 3; contador++){
            System.out.println(vt1[contador]);
        }
        for (contador= 0; contador < 3; contador++){
            System.out.println(vt2[contador]);
        }
        for (contador =0; contador < 6; contador++){
            System.out.println(vt3[contador]);
        }
    }
}