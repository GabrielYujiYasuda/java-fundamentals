package basics;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String oi = "oa";
        System.out.print("Qual o dia da semana: ");
        String diaSemana = input.nextLine().toLowerCase();

        switch (oi) {
            case "segunda":
                System.out.println("Hoje eh segunda-feira");
                break;
            case "terca":
                System.out.println("Hoje eh terca-feira");
                break;
                case "Quarta":
                System.out.println("Hoje eh quarta-feira");
                break;
            case "quinta":
                System.out.println("Hoje eh quinta-feira");
                break;
            case "sexta":
                System.out.println("Hoje eh sexta");
                break;
            case "sabado":
                System.out.println("Hoje eh sabado");
                break;
            case "domingo":
                System.out.println("Hoje eh domingo");
                break;
        }
    }
}
