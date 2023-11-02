
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Test;

import com.example.Escola;

public class TesteEscola {
    @Test
    public void testarExistenciaDeEstudantes() {
        Escola escola = new Escola();
        Escola escolaSpy = spy(escola);

        when(escolaSpy.getQuantAlunos()).thenReturn(5);

        escolaSpy.verificarSeExistemEstudantes();

        verify(escolaSpy).verificarSeExistemEstudantes();
    }

    @Test
    public void testarInexistenciaDeEstudantes() {
        Escola escola = new Escola();
        Escola escolaSpy = spy(escola);

        when(escolaSpy.getQuantAlunos()).thenReturn(0);

        escolaSpy.verificarSeExistemEstudantes();

        verify(escolaSpy).verificarSeExistemEstudantes();
    }
    @Test
    public void testarNomeDaEscola() {
        Escola escola = new Escola();
        Escola escolaSpy = spy(escola);

        when(escolaSpy.getNome()).thenReturn("Escola XYZ");

        String nome = escolaSpy.getNome();

        assertEquals("Escola XYZ", nome);

        verify(escolaSpy).getNome();
    }
    @Test
    public void testarNumeroDaEscola() {
        Escola escola = new Escola();
        Escola escolaSpy = spy(escola);

        when(escolaSpy.getNumero()).thenReturn(42);

        int numero = escolaSpy.getNumero();

        assertEquals(42, numero);

        verify(escolaSpy).getNumero();
    }
    @Test
    public void testarCEPDaEscola() {
        Escola escola = new Escola();
        Escola escolaSpy = spy(escola);

        when(escolaSpy.getCEP()).thenReturn(12345);

        int cep = escolaSpy.getCEP();

        assertEquals(12345, cep);

        verify(escolaSpy).getCEP();
    }

}
