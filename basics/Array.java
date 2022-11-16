package basics;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random(100);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = input.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("Index "+ (i + 1)+ ": " + array[i]);
        }

    }
}
