package org.solutis.heranca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    @Test
    public void testEmpregadoConstrutorComTodosOsParametros() {
        Empregado empregado = new Empregado("João", "Rua das Flores", "1234-5678", 10, 3000.0, 15.0);
        assertEquals("João", empregado.getNome());
        assertEquals("Rua das Flores", empregado.getEndereco());
        assertEquals("1234-5678", empregado.getTelefone());
        assertEquals(10, empregado.getCodigoSetor());
        assertEquals(3000.0, empregado.getSalarioBase());
        assertEquals(15.0, empregado.getImposto());
    }

    @Test
    public void testEmpregadoConstrutorComNome() {
        Empregado empregado = new Empregado("Maria", 20, 2500.0, 10.0);
        assertEquals("Maria", empregado.getNome());
        assertEquals("não informado", empregado.getEndereco());
        assertEquals("não informado", empregado.getTelefone());
        assertEquals(20, empregado.getCodigoSetor());
        assertEquals(2500.0, empregado.getSalarioBase());
        assertEquals(10.0, empregado.getImposto());
    }

    @Test
    public void testCalcularSalario() {
        Empregado empregado = new Empregado("Carlos", "Avenida Brasil", "5678-1234", 5, 100.0, 1.0);
        assertEquals(99.0, empregado.calcularSalario(), 0.01); // Usa um delta para comparação de valores de ponto flutuante
    }

    @Test
    public void testSetters() {
        Empregado empregado = new Empregado("Ana", 30, 2000.0, 12.0);
        empregado.setEndereco("Praça Central");
        empregado.setTelefone("9876-5432");
        empregado.setCodigoSetor(40);
        empregado.setSalarioBase(2200.0);
        empregado.setImposto(8.0);

        assertEquals("Praça Central", empregado.getEndereco());
        assertEquals("9876-5432", empregado.getTelefone());
        assertEquals(40, empregado.getCodigoSetor());
        assertEquals(2200.0, empregado.getSalarioBase());
        assertEquals(8.0, empregado.getImposto());
    }

    @Test
    public void testGetters() {
        Empregado empregado = new Empregado("Lucas", "Rua do Sol", "5555-5555", 12, 3500.0, 18.0);

        // Testa getNome
        assertEquals("Lucas", empregado.getNome());

        // Testa getEndereco
        assertEquals("Rua do Sol", empregado.getEndereco());

        // Testa getTelefone
        assertEquals("5555-5555", empregado.getTelefone());

        // Testa getCodigoSetor
        assertEquals(12, empregado.getCodigoSetor());

        // Testa getSalarioBase
        assertEquals(3500.0, empregado.getSalarioBase());

        // Testa getImposto
        assertEquals(18.0, empregado.getImposto());
    }

    @Test
    public void testToString() {
        Empregado empregado = new Empregado("Lucas", "Rua do Sol", "5555-5555", 12, 3500.0, 18.0);
        String expected = "Empregado\nNome: Lucas\nEndereço: Rua do Sol\nTelefone: 5555-5555\nSetor: 12\nVencimento Base: R$3500.0\nImposto: 18.0%\nSalário: R$2870.0";
        assertEquals(expected, empregado.toString());
    }
}