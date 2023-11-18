package financiamento;

import java.io.*;
import java.util.ArrayList;

public abstract class Financiamento implements Serializable {
    private static final long serialVersionUID = 1L;

    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        double taxaMensal = taxaJurosAnual / 100 / 12;
        int meses = prazoFinanciamento * 12;
        return ((valorImovel * taxaMensal) * Math.pow((1 + taxaMensal), meses))
                / (Math.pow((1 + taxaMensal), meses) - 1);
    }

    public double calcularPagamentoTotal() {
        return calcularPagamentoMensal() * prazoFinanciamento * 12;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void getInformacoes() {
        System.out.println("Detalhes do Financiamento");
        System.out.println("Tipo de Imóvel: " + getClass().getSimpleName());
        System.out.println("Valor do Imóvel: " + String.format("%.2f", valorImovel));
        System.out.println("Prazo do Financiamento: " + prazoFinanciamento + " anos");
        System.out.println("Taxa de Juros Anual: " + taxaJurosAnual + "%");
        System.out.println("Pagamento Mensal: " + String.format("%.2f", calcularPagamentoMensal()));
        System.out.println("Pagamento Total: " + String.format("%.2f", calcularPagamentoTotal()));
    }

    public static void escreverFinanciamentos(String filename, ArrayList<Financiamento> financiamentos) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(filename));
            for (Financiamento financiamento : financiamentos) {
                out.writeObject(financiamento);
            }
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Financiamento> lerFinanciamentos(String filename) {
        ArrayList<Financiamento> financiamentos = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            while (true) {
                try {
                    Financiamento financiamento = (Financiamento) in.readObject();
                    financiamentos.add(financiamento);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return financiamentos;
    }
}
