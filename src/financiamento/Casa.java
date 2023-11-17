package financiamento;

public class Casa extends Financiamento {
    private static final double SEGURO_CASA = 80.0;

    public Casa (double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    @Override
    public double calcularPagamentoMensal() {
        return super.calcularPagamentoMensal() + SEGURO_CASA;
    }
}
