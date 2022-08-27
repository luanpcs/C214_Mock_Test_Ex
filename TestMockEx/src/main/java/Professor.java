public class Professor {
    private String Nome;
    private String HorarioAtendiento;
    private String Periodo;

    public Professor(String nome, String horarioAtendiento, String periodo) {
        this.Nome = nome;
        this.HorarioAtendiento = horarioAtendiento;
        this.Periodo = periodo;
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
        this.HorarioAtendiento = horarioAtendiento;
    }

    public void setPeriodo(String periodo) {
        this.Periodo = periodo;
    }
}