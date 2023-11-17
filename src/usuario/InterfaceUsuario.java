package usuario;

import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;

    public InterfaceUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public double getValorImovel() {
        double valor;
        do {
            System.out.print("Digite o valor do imóvel: ");
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.println("Por favor, insira um valor positivo.");
            }
        } while (valor <= 0);
        return valor;
    }

    public int getPrazoFianciamento() {
        int prazo;
        do {
            System.out.print("Digite o prazo do financiamento em anos: ");
            prazo = scanner.nextInt();
            if (prazo <= 0) {
                System.out.println("Por favor, insira um valor positivo.");
            }
        } while (prazo <= 0);
        return prazo;
    }

    public double getTaxaJuros() {
        double taxa;
        do {
            System.out.print("Digite a taxa de juros anual: ");
            taxa = scanner.nextDouble();
            if (taxa <= 0) {
                System.out.println("Por favor, insira um valor positivo.");
            }
        } while (taxa <= 0);
        return taxa;
    }
}
