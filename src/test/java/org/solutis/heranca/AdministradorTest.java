package org.solutis.heranca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdministradorTest {
    @Test
    public void testAdministradorConstrutorComTodosOsParametross() {
        Administrador administrador = new Administrador("João", "Rua das Flores", "1234-5678", 10, 3000.0, 15.0, 500.0);

        assertEquals("João", administrador.getNome(), "Nome deve ser 'João'");
        assertEquals("Rua das Flores", administrador.getEndereco(), "Endereço deve ser 'Rua das Flores'");
        assertEquals("1234-5678", administrador.getTelefone(), "Telefone deve ser '1234-5678'");
        assertEquals(10, administrador.getCodigoSetor(), "Código do setor deve ser 10");
        assertEquals(3000.0, administrador.getSalarioBase(), 0.01, "Salário base deve ser 3000.0");
        assertEquals(15.0, administrador.getImposto(), 0.01, "Imposto deve ser 15.0");
        assertEquals(500.0, administrador.getAjudaDeCusto(), 0.01, "Ajuda de custo deve ser 500.0");
    }

    @Test
    public void testAdministradorConstrutorComNome() {
        Administrador administrador = new Administrador("Maria", 20, 2500.0, 10.0, 300.0);

        assertEquals("Maria", administrador.getNome(), "Nome deve ser 'Maria'");
        assertEquals("não informado", administrador.getEndereco(), "Endereço deve ser 'não informado'");
        assertEquals("não informado", administrador.getTelefone(), "Telefone deve ser 'não informado'");
        assertEquals(20, administrador.getCodigoSetor(), "Código do setor deve ser 20");
        assertEquals(2500.0, administrador.getSalarioBase(), 0.01, "Salário base deve ser 2500.0");
        assertEquals(10.0, administrador.getImposto(), 0.01, "Imposto deve ser 10.0");
        assertEquals(300.0, administrador.getAjudaDeCusto(), 0.01, "Ajuda de custo deve ser 300.0");
    }


    @Test
    public void testCalcularSalario() {
        Administrador administrador = new Administrador("Carlos", "Avenida Brasil", 300, 100.0, 1.0, 100.0);

        assertEquals(99.0 + 100.0, administrador.calcularSalario(), 0.01, "Salário calculado deve ser 199.0 após imposto de 1% e ajuda de custo de 100.0");
    }

    @Test
    public void testSetters() {
        Administrador administrador = new Administrador("Ana", 30, 2000.0, 12.0, 100.0);
        administrador.setEndereco("Praça Central");
        administrador.setTelefone("9876-5432");
        administrador.setCodigoSetor(40);
        administrador.setSalarioBase(2200.0);
        administrador.setImposto(8.0);
        administrador.setAjudaDeCusto(150.0);

        assertEquals("Praça Central", administrador.getEndereco(), "Endereço deve ser 'Praça Central'");
        assertEquals("9876-5432", administrador.getTelefone(), "Telefone deve ser '9876-5432'");
        assertEquals(40, administrador.getCodigoSetor(), "Código do setor deve ser 40");
        assertEquals(2200.0, administrador.getSalarioBase(), 0.01, "Salário base deve ser 2200.0");
        assertEquals(8.0, administrador.getImposto(), 0.01, "Imposto deve ser 8.0");
        assertEquals(150.0, administrador.getAjudaDeCusto(), 0.01, "Ajuda de custo deve ser 150.0");
    }

    @Test
    public void testGetters() {
        Administrador administrador = new Administrador("Lucas", "Rua do Sol", "5555-5555", 12, 3500.0, 18.0, 400.0);

        assertEquals("Lucas", administrador.getNome(), "Nome deve ser 'Lucas'");
        assertEquals("Rua do Sol", administrador.getEndereco(), "Endereço deve ser 'Rua do Sol'");
        assertEquals("5555-5555", administrador.getTelefone(), "Telefone deve ser '5555-5555'");
        assertEquals(12, administrador.getCodigoSetor(), "Código do setor deve ser 12");
        assertEquals(3500.0, administrador.getSalarioBase(), 0.01, "Salário base deve ser 3500.0");
        assertEquals(18.0, administrador.getImposto(), 0.01, "Imposto deve ser 18.0");
        assertEquals(400.0, administrador.getAjudaDeCusto(), 0.01, "Ajuda de custo deve ser 400.0");
    }

    @Test
    public void testToString() {
        Administrador administrador = new Administrador("Lucas", "Rua do Sol", "5555-5555", 12, 100.0, 1.0, 100.0);
        String expected = "Administrador\nNome: Lucas\nEndereço: Rua do Sol\nTelefone: 5555-5555\nSetor: 12\nVencimento Base: R$100.0\nImposto: 1.0%\nAjuda de Custo: R$100.0\nSalário: R$199.0";

        assertEquals(expected, administrador.toString(), "toString deve formatar a string corretamente");
    }

}