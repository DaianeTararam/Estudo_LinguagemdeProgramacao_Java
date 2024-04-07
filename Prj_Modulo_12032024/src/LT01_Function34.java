import javax.swing.JOptionPane;

/*Data: 16/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba um número. Calcule e mostre os resultados da tabuada desse número.

 */
public class LT01_Function34 {
    public static void main(String[] args) {
        int num, resultado, contador;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        System.out.println("TABUADA DO NÚMERO "+num);
        for(contador = 1; contador <=10; contador++){
            resultado = Function034(num, contador);
            System.out.println(num+ " X " + contador + "= "+ resultado);
        }
    }

    static int Function034(int num, int c){
        int resultado;
        resultado = num * c;
        return resultado;

    }
}