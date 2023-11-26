import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

//importando classes e métodos estáticos 

import org.junit.Test;

import com.example.Aluno;

public class TesteAluno {

    @Test
    public void testarPassouDeAno() {
        Aluno alunoMock = mock(Aluno.class);
        when(alunoMock.passarAno(7.0)).thenReturn("Passou por média de ano com 7.0");
        String resultado = alunoMock.passarAno(7.0);
        assertEquals("Passou por média de ano com 7.0", resultado);
        verify(alunoMock).passarAno(7.0);
    }

    @Test
    public void testarMediaPonderada() {
        Aluno aluno = new Aluno();
        Aluno alunoSpy = spy(aluno);

        double media = alunoSpy.calcularMediaPonderada(7.0, 2.0, 6.0, 3.0, 8.0, 1.0);

        assertEquals(6.625, media, 0.001);

        verify(alunoSpy).calcularMediaPonderada(7.0, 2.0, 6.0, 3.0, 8.0, 1.0);
    }
    @Test
    public void testarMatriculaCorreta() {
        Aluno aluno = new Aluno();
        Aluno alunoSpy = spy(aluno);

        alunoSpy.setMatricula(1);

        assertTrue(alunoSpy.getMatricula() == 1);

        verify(alunoSpy).setMatricula(1);
    }
    @Test
    public void testarMatriculaIncorreta() {
        Aluno aluno = new Aluno();
        Aluno alunoSpy = spy(aluno);

        alunoSpy.setMatricula(2);

        assertFalse(alunoSpy.getMatricula() == 1);

        verify(alunoSpy).setMatricula(2);
    }
    @Test
    public void testarTurma() {
        Aluno aluno = new Aluno();
        Aluno alunoSpy = spy(aluno);

        when(alunoSpy.getTurma()).thenReturn("Turma B");

        String turma = alunoSpy.getTurma();

        assertEquals("Turma B", turma);

        verify(alunoSpy).getTurma();
    }
}
