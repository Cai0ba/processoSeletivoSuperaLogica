package Desafio3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int count = 0;
        for (int num : arr) {
            int diff = num - k;
            if (set.contains(diff)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
