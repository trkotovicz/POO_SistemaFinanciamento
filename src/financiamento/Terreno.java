package financiamento;

public class Terreno extends Financiamento {
    private static final double ACRESCIMO_TERRENO = 0.02;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    @Override
    public double calcularPagamentoMensal() {
        return super.calcularPagamentoMensal() * (1 + ACRESCIMO_TERRENO);
    }
}
