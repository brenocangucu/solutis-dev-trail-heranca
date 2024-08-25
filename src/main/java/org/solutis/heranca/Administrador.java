package org.solutis.heranca;

public class Administrador extends Empregado {
    double ajudaDeCusto;

    public Administrador(String nome, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String endereco, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario() + ajudaDeCusto;
    }

    //método set
    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    //método get
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    @Override
    public String toString(){
        StringBuilder administrador = new StringBuilder();

        administrador.append("Administrador")
                .append("\nNome: ").append(nome)
                .append("\nEndereço: ").append(endereco)
                .append("\nTelefone: ").append(telefone)
                .append("\nSetor: ").append(codigoSetor)
                .append("\nVencimento Base: R$").append(salarioBase)
                .append("\nImposto: ").append(imposto).append("%")
                .append("\nAjuda de Custo: R$").append(ajudaDeCusto)
                .append("\nSalário: R$").append(calcularSalario());

        return administrador.toString();
    }
}
