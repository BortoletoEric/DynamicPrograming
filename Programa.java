import javax.swing.JOptionPane;

public class Programa {
    public static void main(String[] args) {
        Fibonacci exemplo = new Fibonacci();

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o enezimo numero de Fibonacci desejado"));
        JOptionPane.showMessageDialog(null, "O "+ n + "° numero da sequencia de Fibonacci é: " + exemplo.calcular(n));
    }
}
