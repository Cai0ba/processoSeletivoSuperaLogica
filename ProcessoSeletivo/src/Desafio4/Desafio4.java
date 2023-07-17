package Desafio4;

import java.util.Scanner;
public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();

            String linhaDesembaralhada = desembaralharLinha(linha);
            System.out.println(linhaDesembaralhada);
        }
    }

    public static String desembaralharLinha(String linha) {
        int meio = linha.length() / 2;
        StringBuilder sb = new StringBuilder();

        for (int i = meio - 1; i >= 0; i--) {
            sb.append(linha.charAt(i));
        }

        for (int i = linha.length() - 1; i >= meio; i--) {
            sb.append(linha.charAt(i));
        }

        return sb.toString();
    }

}
