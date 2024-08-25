package org.solutis.heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperarioTest {

    @Test
    public void testOperarioConstrutorComTodosOsParametros() {
        Operario operario = new Operario("João", "Rua das Flores", "1234-5678", 5, 3000.0, 10.0, 5000.0, 5.0);

        assertEquals("João", operario.getNome(), "Nome deve ser 'João'");
        assertEquals("Rua das Flores", operario.getEndereco(), "Endereço deve ser 'Rua das Flores'");
        assertEquals("1234-5678", operario.getTelefone(), "Telefone deve ser '1234-5678'");
        assertEquals(5, operario.getCodigoSetor(), "Código do setor deve ser 5");
        assertEquals(3000.0, operario.getSalarioBase(), 0.01, "Salário base deve ser 3000.0");
        assertEquals(10.0, operario.getImposto(), 0.01, "Imposto deve ser 10.0");
        assertEquals(5000.0, operario.getValorProducao(), 0.01, "Valor de produção deve ser 5000.0");
        assertEquals(5.0, operario.getComissao(), 0.01, "Comissão deve ser 5.0");
    }

    @Test
    public void testOperarioConstructorComNomeEDemaisParametros() {
        Operario operario = new Operario("Maria", 10, 2500.0, 15.0, 3000.0, 7.0);

        assertEquals("Maria", operario.getNome(), "Nome deve ser 'Maria'");
        assertEquals("não informado", operario.getEndereco(), "Endereço deve ser 'não informado'");
        assertEquals("não informado", operario.getTelefone(), "Telefone deve ser 'não informado'");
        assertEquals(10, operario.getCodigoSetor(), "Código do setor deve ser 10");
        assertEquals(2500.0, operario.getSalarioBase(), 0.01, "Salário base deve ser 2500.0");
        assertEquals(15.0, operario.getImposto(), 0.01, "Imposto deve ser 15.0");
        assertEquals(3000.0, operario.getValorProducao(), 0.01, "Valor de produção deve ser 3000.0");
        assertEquals(7.0, operario.getComissao(), 0.01, "Comissão deve ser 7.0");
    }

    @Test
    public void testCalcularSalario() {
        Operario operario = new Operario("Carlos", "Avenida Brasil", "5678-1234", 8, 100.0, 10.0, 100.0, 10.0);

        double salarioBaseOperario = 100.0 + (100.0 * 10.0 / 100); // Salário base + comissão
        double salarioCalculado = salarioBaseOperario * (1 - (10.0 / 100)); // Imposto aplicado

        assertEquals(salarioCalculado, operario.calcularSalario(), 0.01, "Salário calculado deve ser correto");
    }

    @Test
    public void testSetters() {
        Operario operario = new Operario("Ana", 3, 2200.0, 12.0, 1500.0, 8.0);
        operario.setComissao(10.0);
        operario.setValorProducao(2000.0);

        assertEquals(10.0, operario.getComissao(), 0.01, "Comissão deve ser 10.0");
        assertEquals(2000.0, operario.getValorProducao(), 0.01, "Valor de produção deve ser 2000.0");
    }

    @Test
    public void testGetters() {
        Operario operario = new Operario("Lucas", "Rua do Sol", "5555-5555", 12, 3500.0, 18.0, 4000.0, 6.0);

        assertEquals("Lucas", operario.getNome(), "Nome deve ser 'Lucas'");
        assertEquals("Rua do Sol", operario.getEndereco(), "Endereço deve ser 'Rua do Sol'");
        assertEquals("5555-5555", operario.getTelefone(), "Telefone deve ser '5555-5555'");
        assertEquals(12, operario.getCodigoSetor(), "Código do setor deve ser 12");
        assertEquals(3500.0, operario.getSalarioBase(), 0.01, "Salário base deve ser 3500.0");
        assertEquals(18.0, operario.getImposto(), 0.01, "Imposto deve ser 18.0");
        assertEquals(4000.0, operario.getValorProducao(), 0.01, "Valor de produção deve ser 4000.0");
        assertEquals(6.0, operario.getComissao(), 0.01, "Comissão deve ser 6.0");
    }

    @Test
    public void testToString() {
        Operario operario = new Operario("Lucas", "Rua do Sol", "5555-5555", 12, 100.0, 10.0, 100.0, 10.0);
        String expected = "Operario\nNome: Lucas\nEndereço: Rua do Sol\nTelefone: 5555-5555\nSetor: 12\nVencimento Base: R$100.0\nValor Produzido: R$100.0\nComissão (10.0%) = R$10.0\nImposto: 10.0%\nSalário: R$99.0";

        assertEquals(expected, operario.toString(), "toString deve formatar a string corretamente");
    }
}
