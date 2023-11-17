package financiamento;

public abstract class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

//    public double calcularPagamentoMensal() {
//        return (valorImovel / prazoFinanciamento ) * (1 + (taxaJurosAnual / 12));
//    }

    public double calcularPagamentoMensal() {
        double taxaMensal = taxaJurosAnual / 100 / 12;
        int meses = prazoFinanciamento * 12;
        return (valorImovel * taxaMensal * Math.pow((1 + taxaMensal), meses))
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
}
