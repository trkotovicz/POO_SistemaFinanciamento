package financiamento;

public class Apartamento extends Financiamento {
    private int vagasGaragem;
    private int andar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int vagasGaragem, int andar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.vagasGaragem = vagasGaragem;
        this.andar = andar;
    }

    @Override
    public double calcularPagamentoMensal() {
        double taxaMensal = getTaxaJurosAnual() / 100 / 12;
        int meses = getPrazoFinanciamento() * 12;
        return (getValorImovel() * taxaMensal * Math.pow((1 + taxaMensal), meses))
                / (Math.pow((1 + taxaMensal), meses) - 1);
    }
}
