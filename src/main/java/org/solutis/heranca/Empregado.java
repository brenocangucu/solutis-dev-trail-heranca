package org.solutis.heranca;

public class Empregado extends Pessoa {
    int codigoSetor;
    double salarioBase;
    double imposto;

    public Empregado(String nome, int codigoSetor, double salarioBase, double imposto) {
        super(nome);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String nome, String endereco, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public double calcularSalario(){
            return (salarioBase * (1 - (imposto/100)));
    }

    //métodos set
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //métodos get
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public double getImposto() {
        return imposto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public String toString(){
        StringBuilder empregado = new StringBuilder();

        empregado.append("Empregado\n").append(super.toString())
                .append("\nSetor: ").append(codigoSetor)
                .append("\nVencimento Base: R$").append(salarioBase)
                .append("\nImposto: ").append(imposto).append("%")
                .append("\nSalário: R$").append(calcularSalario());

        return empregado.toString();
    }
}
