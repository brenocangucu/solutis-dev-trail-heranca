package org.solutis.heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class VendedorTest {

    @Test
    public void testVendedorConstrutorComTodosOsParametros() {
        Vendedor vendedor = new Vendedor("João", "Rua das Flores", "1234-5678", 5, 3500.0, 10.0, 8000.0, 5.0);

        assertEquals("João", vendedor.getNome(), "Nome deve ser 'João'");
        assertEquals("Rua das Flores", vendedor.getEndereco(), "Endereço deve ser 'Rua das Flores'");
        assertEquals("1234-5678", vendedor.getTelefone(), "Telefone deve ser '1234-5678'");
        assertEquals(5, vendedor.getCodigoSetor(), "Código do setor deve ser 5");
        assertEquals(3500.0, vendedor.getSalarioBase(), 0.01, "Salário base deve ser 3500.0");
        assertEquals(10.0, vendedor.getImposto(), 0.01, "Imposto deve ser 10.0");
        assertEquals(8000.0, vendedor.getValorVendas(), 0.01, "Valor de vendas deve ser 8000.0");
        assertEquals(5.0, vendedor.getComissao(), 0.01, "Comissão deve ser 5.0");
    }

    @Test
    public void testVendedorConstrutorPadraoC() {
        Vendedor vendedor = new Vendedor("Maria", 7, 2800.0, 12.0, 6000.0, 6.0);

        assertEquals("Maria", vendedor.getNome(), "Nome deve ser 'Maria'");
        assertEquals("não informado", vendedor.getEndereco(), "Endereço deve ser 'não informado'");
        assertEquals("não informado", vendedor.getTelefone(), "Telefone deve ser 'não informado'");
        assertEquals(7, vendedor.getCodigoSetor(), "Código do setor deve ser 7");
        assertEquals(2800.0, vendedor.getSalarioBase(), 0.01, "Salário base deve ser 2800.0");
        assertEquals(12.0, vendedor.getImposto(), 0.01, "Imposto deve ser 12.0");
        assertEquals(6000.0, vendedor.getValorVendas(), 0.01, "Valor de vendas deve ser 6000.0");
        assertEquals(6.0, vendedor.getComissao(), 0.01, "Comissão deve ser 6.0");
    }

    @Test
    public void testCalcularSalario() {
        Vendedor vendedor = new Vendedor("Carlos", "Avenida Brasil", "5678-1234", 3, 100.0, 10.0, 100.0, 10.0);

        double salarioBaseVendedor = 100.0 + (100.0 * 10.0 / 100); // Salário base + comissão
        double salarioCalculado = salarioBaseVendedor * (1 - (10.0 / 100)); // Imposto aplicado

        assertEquals(salarioCalculado, vendedor.calcularSalario(), 0.01, "Salário calculado deve ser correto");
    }

    @Test
    public void testSetters() {
        Vendedor vendedor = new Vendedor("Ana", 2, 2600.0, 8.0, 5000.0, 4.0);
        vendedor.setComissao(5.0);
        vendedor.setValorVendas(5500.0);

        assertEquals(5.0, vendedor.getComissao(), 0.01, "Comissão deve ser 5.0");
        assertEquals(5500.0, vendedor.getValorVendas(), 0.01, "Valor de vendas deve ser 5500.0");
    }

    @Test
    public void testGetters() {
        Vendedor vendedor = new Vendedor("Lucas", "Rua do Sol", "5555-5555", 8, 3100.0, 9.0, 6500.0, 6.0);

        assertEquals("Lucas", vendedor.getNome(), "Nome deve ser 'Lucas'");
        assertEquals("Rua do Sol", vendedor.getEndereco(), "Endereço deve ser 'Rua do Sol'");
        assertEquals("5555-5555", vendedor.getTelefone(), "Telefone deve ser '5555-5555'");
        assertEquals(8, vendedor.getCodigoSetor(), "Código do setor deve ser 8");
        assertEquals(3100.0, vendedor.getSalarioBase(), 0.01, "Salário base deve ser 3100.0");
        assertEquals(9.0, vendedor.getImposto(), 0.01, "Imposto deve ser 9.0");
        assertEquals(6500.0, vendedor.getValorVendas(), 0.01, "Valor de vendas deve ser 6500.0");
        assertEquals(6.0, vendedor.getComissao(), 0.01, "Comissão deve ser 6.0");
    }

    @Test
    public void testToString() {
        Vendedor vendedor = new Vendedor("Lucas", "Rua do Sol", "5555-5555", 8, 100.0, 10.0, 100.0, 10.0);
        String expected = "Vendedor\nNome: Lucas\nEndereço: Rua do Sol\nTelefone: 5555-5555\nSetor: 8\nVencimento Base: R$100.0\nVendas: R$100.0\nComissão (10.0%) = R$10.0\nImposto: 10.0%\nSalário: R$99.0";

        assertEquals(expected, vendedor.toString(), "toString deve formatar a string corretamente");
    }

}