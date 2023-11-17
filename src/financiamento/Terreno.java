package financiamento;

public class Terreno extends Financiamento {
    private String tipoZona;

    private static final double ACRESCIMO_TERRENO = 0.02;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipoZona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    @Override
    public double calcularPagamentoMensal() {
        return super.calcularPagamentoMensal() * (1 + ACRESCIMO_TERRENO);
    }
}
