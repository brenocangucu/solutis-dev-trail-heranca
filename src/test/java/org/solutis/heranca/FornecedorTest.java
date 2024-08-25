package org.solutis.heranca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FornecedorTest {
    @Test
    public void testFornecedorConstrutorComTodosOsParametros() {
        Fornecedor fornecedor = new Fornecedor("João", "Rua das Flores", "1234-5678");
        fornecedor.setValorCredito(1500.0);
        fornecedor.setValorDivida(500.0);

        assertEquals("João", fornecedor.getNome(), "Nome deve ser 'João'");
        assertEquals("Rua das Flores", fornecedor.getEndereco(), "Endereço deve ser 'Rua das Flores'");
        assertEquals("1234-5678", fornecedor.getTelefone(), "Telefone deve ser '1234-5678'");
        assertEquals(1500.0, fornecedor.getValorCredito(), 0.01, "Valor de crédito deve ser 1500.0");
        assertEquals(500.0, fornecedor.getValorDivida(), 0.01, "Valor de dívida deve ser 500.0");
    }

    @Test
    public void testFornecedorConstrutorComNomeEEndereco() {
        Fornecedor fornecedor = new Fornecedor("Maria", "Rua das Palmeiras");
        fornecedor.setValorCredito(2000.0);
        fornecedor.setValorDivida(1000.0);

        assertEquals("Maria", fornecedor.getNome(), "Nome deve ser 'Maria'");
        assertEquals("Rua das Palmeiras", fornecedor.getEndereco(), "Endereço deve ser 'Rua das Palmeiras'");
        assertEquals("não informado", fornecedor.getTelefone(), "Telefone deve ser 'não informado'");
        assertEquals(2000.0, fornecedor.getValorCredito(), 0.01, "Valor de crédito deve ser 2000.0");
        assertEquals(1000.0, fornecedor.getValorDivida(), 0.01, "Valor de dívida deve ser 1000.0");
    }

    @Test
    public void testObterSaldo() {
        Fornecedor fornecedor = new Fornecedor("Carlos", "Avenida Brasil", "5678-1234");
        fornecedor.setValorCredito(3000.0);
        fornecedor.setValorDivida(1500.0);

        assertEquals(1500.0, fornecedor.obterSaldo(), 0.01, "O saldo deve ser 1500.0 (crédito de 3000.0 - dívida de 1500.0)");
    }

    @Test
    public void testSetters() {
        Fornecedor fornecedor = new Fornecedor("Ana");
        fornecedor.setValorCredito(2500.0);
        fornecedor.setValorDivida(1200.0);

        assertEquals(2500.0, fornecedor.getValorCredito(), 0.01, "Valor de crédito deve ser 2500.0");
        assertEquals(1200.0, fornecedor.getValorDivida(), 0.01, "Valor de dívida deve ser 1200.0");
    }

    @Test
    public void testGetters() {
        Fornecedor fornecedor = new Fornecedor("Lucas", "Rua do Sol", "5555-5555");
        fornecedor.setValorCredito(1800.0);
        fornecedor.setValorDivida(600.0);

        assertEquals("Lucas", fornecedor.getNome(), "Nome deve ser 'Lucas'");
        assertEquals("Rua do Sol", fornecedor.getEndereco(), "Endereço deve ser 'Rua do Sol'");
        assertEquals("5555-5555", fornecedor.getTelefone(), "Telefone deve ser '5555-5555'");
        assertEquals(1800.0, fornecedor.getValorCredito(), 0.01, "Valor de crédito deve ser 1800.0");
        assertEquals(600.0, fornecedor.getValorDivida(), 0.01, "Valor de dívida deve ser 600.0");
    }

    @Test
    public void testToString() {
        Fornecedor fornecedor = new Fornecedor("Lucas", "Rua do Sol", "5555-5555");
        fornecedor.setValorCredito(1800.0);
        fornecedor.setValorDivida(600.0);
        String expected = "Fornecedor\nNome: Lucas\nEndereço: Rua do Sol\nTelefone: 5555-5555\nSaldo: 1200.0";

        assertEquals(expected, fornecedor.toString(), "toString deve formatar a string corretamente");
    }

}