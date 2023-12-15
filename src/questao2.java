import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Qual a unidade de origem dessa temperatura? [C, K, F] ");
        char origem_t = Character.toUpperCase(scanner.next().charAt(0));

        if (origem_t != 'C' || origem_t != 'K' || origem_t != 'F') {
            System.out.println("Valor inválido.");
        }


        System.out.print("Qual a unidade de destino dessa temperatura? [C, K, F] ");
        char destino_t = Character.toUpperCase(scanner.next().charAt(0));

        if (destino_t != 'C' || destino_t != 'K' || destino_t != 'F') {
            System.out.println("Valor inválido.");
        }

        double tempConvertida = 0;




        switch (origem_t) {

            case 'C':
                if (destino_t == 'K') {
                    tempConvertida = temperatura + 273.15;
                } else if (destino_t == 'F') {
                    tempConvertida = (temperatura * 9 / 5) + 32;
                }
                break;

            case 'K':
                if (destino_t == 'C') {
                    tempConvertida = temperatura - 273.15;
                } else if (destino_t == 'F') {
                    tempConvertida = (temperatura - 273.15) * 9 / 5 + 32;
                }
                break;

            case 'F':
                if (destino_t == 'C') {
                    tempConvertida = (temperatura - 32) * 5 / 9;
                } else if (destino_t == 'K') {
                    tempConvertida = (temperatura - 32) * 5 / 9 + 273.15;
                }
                break;

        }

        System.out.printf("%.2f %s = %.2f %s%n", temperatura, origem_t, tempConvertida, destino_t);
    }
}
