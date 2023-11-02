import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.example.Professor;

public class TesteProfessor {
    @Test
    public void testarNomeDoProfessor() {
        Professor professor = new Professor("João", 3, "Matemática", 5000);
        Professor professorSpy = spy(professor);

        when(professorSpy.getNome()).thenReturn("Maria");

        String nome = professorSpy.getNome();

        assertEquals("Maria", nome);

        verify(professorSpy).getNome();
    }
    @Test
    public void testarQuantidadeDeTurmas() {
        Professor professor = new Professor("Pedro", 5, "História", 6000);
        Professor professorSpy = spy(professor);

        when(professorSpy.getQuantTurmas()).thenReturn(4);

        int quantTurmas = professorSpy.getQuantTurmas();

        assertEquals(4, quantTurmas);

        verify(professorSpy).getQuantTurmas();
    }
    @Test
    public void testarMateriaDoProfessor() {
        Professor professor = new Professor("Ana", 2, "Física", 5500);
        Professor professorSpy = spy(professor);

        when(professorSpy.getMateria()).thenReturn("Química");

        String materia = professorSpy.getMateria();

        assertEquals("Química", materia);

        verify(professorSpy).getMateria();
    }
    @Test
    public void testarSalarioDoProfessor() {
        Professor professor = new Professor("Carlos", 4, "Inglês", 4800);
        Professor professorSpy = spy(professor);

        when(professorSpy.getSalario()).thenReturn(5500);

        int salario = professorSpy.getSalario();

        assertEquals(5500, salario);

        verify(professorSpy).getSalario();
    }
    @Test
    public void testarValoresIniciaisDoProfessor() {
        Professor professor = new Professor("Alice", 3, "Geografia", 5200);

        assertEquals("Alice", professor.getNome());
        assertEquals(3, professor.getQuantTurmas());
        assertEquals("Geografia", professor.getMateria());
        assertEquals(5200, professor.getSalario());
    }
}
