import javax.swing.JOptionPane;

public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o enezimo numero de Fibonacci desejado"));
        
        // inicia timer
        long inicioTimer = System.nanoTime();
        
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        
        // finaliza timer
        long fimTimer = System.nanoTime();
        
        // calcula tempo gasto em ms
        long duration = (fimTimer - inicioTimer) / 1000000; // converte pra ms
        
        System.out.println(c);
        System.out.println("Elapsed time: " + duration + " ms");
    }
}