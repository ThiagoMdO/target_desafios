package desafios.primeiro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite um valor para verificar se é da sequencia Fibonacci:");
            Integer valor = scanner.nextInt();

            System.out.println(checkValorEstarEmFib(valor, fib(valor)));

        } catch (InputMismatchException e){
            System.out.println("Error: precisa ser um número inteiro, resposta :" + e.getMessage());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static String checkValorEstarEmFib(Integer valorParaComparacao, Integer fib){
        if (valorParaComparacao.equals(fib))
            return "Pertence a sequência";
        return "Não pertence a ordem Fabonacci";
    }

    public static int fib(Integer n) {
        int f = 0, f1 = 0, f2 = 1;

        for (int i = 0; i < n; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            if (f == n) break;
        }

        return f;
    }
}
