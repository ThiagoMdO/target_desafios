package desafios.segundo;

import java.util.Arrays;
import java.util.Scanner;

public class VerificadoraLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite uma palavara que será verifada se contém a letra 'A' " +
            "Independentemente se é maiúscula ou minuscula");
            String palavra = scanner.nextLine();
            System.out.println(checkSeExisteLetraA(palavra));
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            scanner.close();
        }
    }

    public static String checkSeExisteLetraA(String palavra){
        long qtdLetrasNaPalavra = Arrays.stream(palavra.split(""))
                                        .filter(letra -> letra.equalsIgnoreCase("a"))
                                        .count();
        return
        (qtdLetrasNaPalavra == 0 ? "Não existe a letra 'A' na palavra"
        : "A letra 'A' aparece " + qtdLetrasNaPalavra + (qtdLetrasNaPalavra == 1 ? " vez" : " vezes"));
    }
}
