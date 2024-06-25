public class Fibonacci {
        
    int a = 0;
    int b = 1;
    int c = 0;
    public int calcular(int n) {
        for (int i = 0; i < n; i++) {
        c = a + b;
        a = b;
        b = c;
        }
        System.out.println("a: "+ a + ", b: " + b + " e c: " + c);
        return c;
    }
}
