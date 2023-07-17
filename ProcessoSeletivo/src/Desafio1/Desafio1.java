package Desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> valores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            valores.add(valor);
        }

        valores.sort((a, b) -> {
            if (a % 2 == 0 && b % 2 == 0) {
                return a.compareTo(b);
            } else if (a % 2 != 0 && b % 2 != 0) {
                return b.compareTo(a);
            } else if (a % 2 == 0 && b % 2 != 0) {
                return -1;
            } else {
                return 1;
            }
        });

        for (int valor : valores) {
            System.out.println(valor);
        }
    }
}
