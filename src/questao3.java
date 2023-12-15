import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base do seu triângulo:  ");
        int trinagulo = scanner.nextInt();

        for (int i = 1; i <= trinagulo; i++) {
            for (int j = 1; j <= trinagulo - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = trinagulo; i >= 1; i--) {
            for (int j = 1; j <= trinagulo - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }



    }
}