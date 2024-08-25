package org.solutis.heranca;

public class Vendedor extends Empregado{
    double valorVendas;
    double comissao;


    public Vendedor(String nome, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao ) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String endereco, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioBaseVendedor = salarioBase + (valorVendas * comissao / 100);

        return salarioBaseVendedor * (1 - (imposto / 100));
    }

    //métodos set
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    //métodos get
    public double getComissao() {
        return comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }


    @Override
    public String toString() {
        StringBuilder vendedor = new StringBuilder();

        vendedor.append("Vendedor")
                .append("\nNome: ").append(nome)
                .append("\nEndereço: ").append(endereco)
                .append("\nTelefone: ").append(telefone)
                .append("\nSetor: ").append(codigoSetor)
                .append("\nVencimento Base: R$").append(salarioBase)
                .append("\nVendas: R$").append(valorVendas)
                .append("\nComissão (").append(comissao).append("%) = R$").append(valorVendas * comissao / 100)
                .append("\nImposto: ").append(imposto).append("%")
                .append("\nSalário: R$").append(calcularSalario());

        return vendedor.toString();
    }
}
