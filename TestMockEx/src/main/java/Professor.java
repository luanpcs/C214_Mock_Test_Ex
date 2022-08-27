public class Professor {
    private String Nome;
    private String HorarioAtendiento;
    private String Periodo;

    public Professor(String nome, String horarioAtendiento, String periodo) {
        this.Nome = nome;
        HorarioAtendiento = horarioAtendiento;
        Periodo = periodo;
    }

    public String getNome() {
        return Nome;
    }

    public String getHorarioAtendiento() {
        return HorarioAtendiento;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setHorarioAtendiento(String horarioAtendiento) {
        HorarioAtendiento = horarioAtendiento;
    }

    public void setPeriodo(String periodo) {
        Periodo = periodo;
    }
}
