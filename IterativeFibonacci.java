import java.util.Scanner;

public class IterativeFibonacci {

    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        int fib = 1;
        int prevFib = 1;
        System.out.println(prevFib);
        System.out.println(fib);
        for(int i = 2; i < n; i++){
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
            System.out.println(fib);
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int n = sc.nextInt();

        long tempoInicial = System.currentTimeMillis();
        System.out.println("O valor do fibonacci de " + n + " = " + fibonacci(n));
        System.out.println("O metodo foi executado em: " + (System.currentTimeMillis() - tempoInicial));
        sc.close();
    }

}
