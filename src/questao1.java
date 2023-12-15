import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de um empréstimo: R$ ");
        double emprestimo = scanner.nextDouble();

        System.out.print("Digite a taxa de juros: R$ ");
        double juros = scanner.nextDouble() / 100;

        System.out.print("Digite a quantidade de parcelas: ");
        int parcelas = scanner.nextInt();

        double amortizacao = emprestimo / parcelas;
        double saldoDevedorAtual = emprestimo;
        double totalJuros = 0;
        double totalAmortizado = 0;

        System.out.printf("Valor fixo da amortização: R$ %.2f%n", amortizacao);
        System.out.printf("Saldo devedor total: R$ %.2f com juros de %.2f%% ao mês%n", emprestimo, juros * 100);

        for (int i = 1; i <= parcelas; i++) {
            double jurosMensal = saldoDevedorAtual * juros;
            double prestacao = amortizacao + jurosMensal;
            saldoDevedorAtual -= amortizacao;

            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f%n", i, jurosMensal, prestacao, saldoDevedorAtual);

            totalJuros += jurosMensal;
            totalAmortizado += amortizacao;
        }

        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f%n", totalJuros + totalAmortizado, totalJuros, totalAmortizado);
    }
}
