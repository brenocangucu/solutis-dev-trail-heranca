package org.solutis.heranca;

public class Pessoa {
    String nome;
    String endereco;
    String telefone;


    public Pessoa(String nome){
        this.nome = nome;
        this.endereco = "não informado";
        this.telefone = "não informado";

    }

    public Pessoa(String nome, String endereco){
        this(nome);
        this.endereco = endereco;
    }

    public Pessoa(String nome, String endereco, String telefone){
        this(nome, endereco);
        this.telefone = telefone;
    }

    //métodos set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //métodos get
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone;
    }
}
