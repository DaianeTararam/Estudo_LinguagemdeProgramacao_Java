/*
Programador(a) : Daiane Tararam
Data: 12/03/2024
Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o 
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.


*/
import javax.swing.JOptionPane;
public class LT01_Procedure17 {
    static Integer litros;
    public static void main(String[] args) {
        
        int litros, km, tempo, velocidade;
        km = 0;
        litros = 0;
        tempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tempo de percurso: "));
        velocidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a velocidade média: "));
        procedure17(tempo, velocidade, km);
        JOptionPane.showMessageDialog(null, "A quantidade de litros gastos na viagem foi de: " + litros +" litros.");
    }
    
    static void procedure17(int tempo, int velocidade, int km){
        km = velocidade * tempo;
        litros = km / 12;
    }
    
}


