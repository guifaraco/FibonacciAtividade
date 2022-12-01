import java.util.Scanner;

public class RecursiveFibonacci {
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        else{
            System.out.println(fibonacci(n - 1) + fibonacci(n - 2));
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
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