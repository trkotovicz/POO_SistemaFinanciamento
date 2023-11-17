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

    public double getAreaConstruida() {
        double areaConstruida;
        do {
            System.out.print("Digite a área contruída: ");
            areaConstruida = scanner.nextDouble();
            if (areaConstruida <= 0) {
                System.out.println("Por favor, insira um valor positivo.");
            }
        } while (areaConstruida <= 0);
        return areaConstruida;
    }

    public double getAreaTerreno() {
        double areaTerreno;
        do {
            System.out.print("Digite a área do terreno: ");
            areaTerreno = scanner.nextDouble();
            if (areaTerreno <= 0) {
                System.out.println("Por favor, insira um valor positivo.");
            }
        } while (areaTerreno <= 0);
        return areaTerreno;
    }

    public int getVagasGaragem() {
        int vagas;
        do {
            System.out.print("Digite o número de vagas: ");
            vagas = scanner.nextInt();
            if (vagas <= 0) {
                System.out.println("Por favor, insira um valor positivo.");
            }
        } while (vagas <= 0);
        return vagas;
    }

    public int getAndar() {
        int andar;
        do {
            System.out.print("Digite o andar do apartamento: ");
            andar = scanner.nextInt();
            if (andar <= 0) {
                System.out.println("Por favor, insira um valor positivo.");
            }
        } while (andar <= 0);
        return andar;
    }

    public String getZona() {
        String zona;
        do {
            System.out.print("Digite a zona do terreno: ");
            zona = scanner.next();
            if (!zona.equals("residencial") && !zona.equals("comercial")) {
                System.out.println("Por favor, insira um valor válido: 'residencial' ou 'comercial'.");
            }
        } while (zona.equals(""));
        return zona;
    }
}
