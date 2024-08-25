package org.solutis.heranca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoaTest {

    @Test
    public void testPessoaConstrutorApenasComNome() {
        Pessoa pessoa = new Pessoa("João");
        assertEquals("João", pessoa.getNome(), "Era esperado o nome \"João\"");
        assertEquals("não informado", pessoa.getEndereco(), "Era esperado o endereço \"não informado\"");
        assertEquals("não informado", pessoa.getTelefone(), "Era esperado o número \"não informado\"");
    }

    @Test
    public void testPessoaConstrutorNomeEndereco() {
        Pessoa pessoa = new Pessoa("João", "Rua das Flores");
        assertEquals("João", pessoa.getNome(), "Era esperado o nome \"João\"");
        assertEquals("Rua das Flores", pessoa.getEndereco(), "Era esperado o endereço \"Rua das Flores\"");
        assertEquals("não informado", pessoa.getTelefone(), "Era esperado o número \"não informado\"");
    }

    @Test
    public void testPessoaConstrutorComTodosOsParametros() {
        Pessoa pessoa = new Pessoa("João", "Rua das Flores", "1234-5678");
        assertEquals("João", pessoa.getNome(), "Era esperado o nome \"João\"");
        assertEquals("Rua das Flores", pessoa.getEndereco(), "Era esperado o endereço \"Rua das Flores\"");
        assertEquals("1234-5678", pessoa.getTelefone(), "Era esperado o número \"1234-5678\"");
    }

    @Test
    public void testGetters() {
        Pessoa pessoa = new Pessoa("João", "Rua das Flores", "1234-5678");

        // Testa getNome
        assertEquals("João", pessoa.getNome(), "Era esperado o nome \"João\"");

        // Testa getEndereco
        assertEquals("Rua das Flores", pessoa.getEndereco(), "Era esperado o endereço \"Rua das Flores\"");

        // Testa getTelefone
        assertEquals("1234-5678", pessoa.getTelefone(), "Era esperado o número \"1234-5678\"");
    }

    @Test
    public void testSetters() {
        Pessoa pessoa = new Pessoa("Maria");
        pessoa.setNome("João");
        pessoa.setEndereco("Rua das Flores");
        pessoa.setTelefone("1234-5678");

        assertEquals("João", pessoa.getNome(), "Era esperado o nome \"João\"");
        assertEquals("Rua das Flores", pessoa.getEndereco(), "Era esperado o endereço \"Rua das Flores\"");
        assertEquals("1234-5678", pessoa.getTelefone(), "Era esperado o número \"1234-5678\"");

    }

    @Test
    public void testToString() {
        Pessoa pessoa = new Pessoa("Lucas", "Rua do Sol", "5555-5555");
        String expected = "Nome: Lucas\nEndereço: Rua do Sol\nTelefone: 5555-5555";
        assertEquals(expected, pessoa.toString());
    }

}