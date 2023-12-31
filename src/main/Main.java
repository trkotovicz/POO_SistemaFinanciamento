package main;

import financiamento.Apartamento;
import financiamento.Terreno;
import financiamento.Casa;
import financiamento.Financiamento;
import usuario.InterfaceUsuario;

import java.util.ArrayList;

public class Main {
    private static final String FINANCIAMENTOS_FILE = "financiamentos.txt";
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        Financiamento casa = new Casa(
                interfaceUsuario.getValorImovel(),
                interfaceUsuario.getPrazoFianciamento(),
                interfaceUsuario.getTaxaJuros(),
                interfaceUsuario.getAreaConstruida(),
                interfaceUsuario.getAreaTerreno()
        );
        financiamentos.add(casa);

        Financiamento apartamento1 = new Apartamento(
                interfaceUsuario.getValorImovel(),
                interfaceUsuario.getPrazoFianciamento(),
                interfaceUsuario.getTaxaJuros(),
                interfaceUsuario.getVagasGaragem(),
                interfaceUsuario.getAndar()
                );
        financiamentos.add(apartamento1);

        Financiamento apartamento2 = new Apartamento(
                interfaceUsuario.getValorImovel(),
                interfaceUsuario.getPrazoFianciamento(),
                interfaceUsuario.getTaxaJuros(),
                interfaceUsuario.getVagasGaragem(),
                interfaceUsuario.getAndar()
        );
        financiamentos.add(apartamento2);

        Financiamento terreno = new Terreno(
                interfaceUsuario.getValorImovel(),
                interfaceUsuario.getPrazoFianciamento(),
                interfaceUsuario.getTaxaJuros(),
                interfaceUsuario.getZona()
        );
        financiamentos.add(terreno);

        for (Financiamento financiamento : financiamentos) {
            financiamento.getInformacoes();
            System.out.println();
        }

        double totalImoveis = financiamentos.stream().mapToDouble(Financiamento::getValorImovel).sum();
        double totalFinanciamentos = financiamentos.stream().mapToDouble(Financiamento::calcularPagamentoTotal).sum();

        System.out.println("Valor Total de todos os imóveis: R$ " + String.format("%.2f", totalImoveis));
        System.out.println("Valor Total de todos os financiamentos: R$ " + String.format("%.2f", totalFinanciamentos));

        Financiamento.escreverFinanciamentos(FINANCIAMENTOS_FILE, financiamentos);
        ArrayList<Financiamento> lerFinanciamentos = Financiamento.lerFinanciamentos(FINANCIAMENTOS_FILE);

        for (Financiamento financiamento : lerFinanciamentos) {
            financiamento.getInformacoes();
            System.out.println();
        }
    }
}