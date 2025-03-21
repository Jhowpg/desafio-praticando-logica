import java.util.Scanner;

public class CalculoBancario {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        System.out.println("Digitar o saldo da sua conta bancaria");
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        System.out.println("Digitar o valor da primeira transação");
        double primeiraTransacao = scanner.nextDouble();
        System.out.println("Digitar o valor da segunda transação");
        double segundaTransacao = scanner.nextDouble();
        System.out.println("Digitar o valor da terceira transação");
        double terceiraTransacao = scanner.nextDouble();

        // Saldo final
        double saldoFinal = calcular(saldoInicial, primeiraTransacao, segundaTransacao, terceiraTransacao);
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }

    static double calcular(double saldoInicial, double primeiraTransacao, double segundaTransacao,
            double terceiraTransacao) {
        return saldoInicial - primeiraTransacao - segundaTransacao - terceiraTransacao;
    }
}
