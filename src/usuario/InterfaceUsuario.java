package usuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;

    public InterfaceUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public double getValorImovel() {
        double valor = 0;
        while (valor <= 0) {
            try {
                System.out.print("Digite o valor do imóvel: ");
                valor = scanner.nextDouble();
                if (valor <= 0) {
                    System.out.println("Por favor, insira um valor positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
            }
        }
        return valor;
    }

    public int getPrazoFianciamento() {
        int prazo = 0;
        do {
            try {
                System.out.print("Digite o prazo do financiamento em anos: ");
                prazo = scanner.nextInt();
                if (prazo <= 0) {
                    System.out.println("Por favor, insira um valor positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
            }
        } while (prazo <= 0);
        return prazo;
    }

    public double getTaxaJuros() {
        double taxa = 0;
        do {
            try {
                System.out.print("Digite a taxa de juros anual: ");
                taxa = scanner.nextDouble();
                if (taxa <= 0) {
                    System.out.println("Por favor, insira um valor positivo.");
                }
            } catch (InputMismatchException e) {
            System.out.println("Por favor, insira um número válido.");
            scanner.next();
            }
        } while (taxa <= 0);
        return taxa;
    }

    public double getAreaConstruida() {
        double areaConstruida = 0;
        do {
            try {
                System.out.print("Digite a área contruída: ");
                areaConstruida = scanner.nextDouble();
                if (areaConstruida <= 0) {
                    System.out.println("Por favor, insira um valor positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
            }
        } while (areaConstruida <= 0);
        return areaConstruida;
    }

    public double getAreaTerreno() {
        double areaTerreno = 0;
        do {
            try {
                System.out.print("Digite a área do terreno: ");
                areaTerreno = scanner.nextDouble();
                if (areaTerreno <= 0) {
                    System.out.println("Por favor, insira um valor positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
            }
        } while (areaTerreno <= 0);
        return areaTerreno;
    }

    public int getVagasGaragem() {
        int vagas = 0;
        do {
            try {
                System.out.print("Digite o número de vagas: ");
                vagas = scanner.nextInt();
                if (vagas <= 0) {
                    System.out.println("Por favor, insira um valor positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
            }
        } while (vagas <= 0);
        return vagas;
    }

    public int getAndar() {
        int andar = 0;
        do {
            try {
                System.out.print("Digite o andar do apartamento: ");
                andar = scanner.nextInt();
                if (andar <= 0) {
                    System.out.println("Por favor, insira um valor positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
            }
        } while (andar <= 0);
        return andar;
    }

    public String getZona() {
        String zona = "";
        do {
            try {
                System.out.print("Digite a zona do terreno: ");
                zona = scanner.next();
                if (!zona.equals("residencial") && !zona.equals("comercial")) {
                    throw new ZonaInvalidaException("Por favor, insira um valor válido: 'residencial' ou 'comercial'.");
                }
            } catch (ZonaInvalidaException e) {
                System.out.println(e.getMessage());
                zona = "";
            }
        } while (zona.equals(""));
        return zona;
    }
}
