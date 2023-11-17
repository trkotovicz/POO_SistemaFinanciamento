package financiamento;

public class Casa extends Financiamento {
    private double areaConstruida;
    private double areaTerreno;
    private static final double SEGURO_CASA = 80.0;

    public Casa (double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double areaTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    @Override
    public double calcularPagamentoMensal() {
        return super.calcularPagamentoMensal() + SEGURO_CASA;
    }
}
