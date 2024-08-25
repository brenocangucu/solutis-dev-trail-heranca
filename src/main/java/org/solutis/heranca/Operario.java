package org.solutis.heranca;

public class Operario extends Empregado {
    double valorProducao;
    double comissao;

    public Operario(String nome, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome, String endereco, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioBaseOperario = salarioBase + (valorProducao * comissao / 100);

        return salarioBaseOperario * (1 - (imposto / 100));
    }

    //métodos set
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    //métodos get
    public double getComissao() {
        return comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }


    @Override
    public String toString() {
        StringBuilder operario = new StringBuilder();

        operario.append("Operario")
                .append("\nNome: ").append(nome)
                .append("\nEndereço: ").append(endereco)
                .append("\nTelefone: ").append(telefone)
                .append("\nSetor: ").append(codigoSetor)
                .append("\nVencimento Base: R$").append(salarioBase)
                .append("\nValor Produzido: R$").append(valorProducao)
                .append("\nComissão (").append(comissao).append("%) = R$").append(valorProducao * comissao / 100)
                .append("\nImposto: ").append(imposto).append("%")
                .append("\nSalário: R$").append(calcularSalario());

        return operario.toString();
    }

}