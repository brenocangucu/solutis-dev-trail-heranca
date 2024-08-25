package org.solutis.heranca;

public class Fornecedor extends Pessoa{
    double valorCredito;
    double valorDivida;

    public Fornecedor(String nome){
        super(nome);
    }

    public Fornecedor(String nome, String endereco){
        super(nome, endereco);
    }

    public Fornecedor(String nome, String endereco, String telefone){
        super(nome, endereco, telefone);
    }

    //método específico da classe
    public double obterSaldo(){
        return valorCredito - valorDivida;
    }

    //métodos sets
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    //métodos get
    public double getValorCredito() {
        return valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }


    @Override
    public String toString(){
        return "Fornecedor\n" + super.toString() + "\nSaldo: " + obterSaldo();
    }

}
