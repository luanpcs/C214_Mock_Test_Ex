import org.junit.Test;
import static org.junit.Assert.*;

public class TestBuscaProfessor {
    @Test
    public void testeBuscaProfessor1() {
        ProfessorService prof = new MockProfessorService();
        BuscaProfessor bProf = new BuscaProfessor(prof);

        Professor p = bProf.buscaProfessor(1);

        assertEquals("Chris", p.getNome());
        assertEquals("15h", p.getHorarioAtendiento());
        assertEquals("Integral",p.getPeriodo());
    }

    @Test
    public void testeBuscaProfessor2() {
        ProfessorService prof = new MockProfessorService();
        BuscaProfessor bProf = new BuscaProfessor(prof);

        Professor p = bProf.buscaProfessor(2);

        assertEquals("Renzo", p.getNome());
        assertEquals("21h", p.getHorarioAtendiento());
        assertEquals("Noturno",p.getPeriodo());
    }

    @Test
    public void testeBuscaProfessor3() {
        ProfessorService prof = new MockProfessorService();
        BuscaProfessor bProf = new BuscaProfessor(prof);

        Professor p = bProf.buscaProfessor(3);

        assertEquals("Renan", p.getNome());
        assertEquals("18h", p.getHorarioAtendiento());
        assertEquals("Noturno",p.getPeriodo());
    }

    @Test
    public void testeBuscaProfessor4() {
        ProfessorService prof = new MockProfessorService();
        BuscaProfessor bProf = new BuscaProfessor(prof);

        Professor p = bProf.buscaProfessor(4);

        assertEquals("Pedro Sergio", p.getNome());
        assertEquals("10", p.getHorarioAtendiento());
        assertEquals("Integral",p.getPeriodo());
    }

    @Test
    public void testeBuscaProfessor5() {
        ProfessorService prof = new MockProfessorService();
        BuscaProfessor bProf = new BuscaProfessor(prof);

        Professor p = bProf.buscaProfessor(5);

        assertEquals("Dani", p.getNome());
        assertEquals("19h", p.getHorarioAtendiento());
        assertEquals("Noturno",p.getPeriodo());
    }

    @Test
    public void testeBuscaProfessor6() {
        ProfessorService prof = new MockProfessorService();
        BuscaProfessor bProf = new BuscaProfessor(prof);

        Professor p = bProf.buscaProfessor(6);

        assertEquals("Egidio", p.getNome());
        assertEquals("11h", p.getHorarioAtendiento());
        assertEquals("Integral",p.getPeriodo());
    }

}