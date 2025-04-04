public class Cuidador{
    private int anosExperiencia;
    private String especialidade;
    private String turno;
    private String cpf;
    private Animal animalCuidado;

    public Cuidador() {
    }

    public Cuidador(int anosExperiencia, String especialidade, String turno, String cpf) {
        this.anosExperiencia = anosExperiencia;
        this.especialidade = especialidade;
        this.turno = turno;
        this.cpf = cpf;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Animal getAnimal() {
        return animalCuidado;
    }

    public void setAnimal(Animal animal) {
        this.animalCuidado = animal;
    }

    public void cuidarDeAnimal(Animal animal) {
        animalCuidado = animal;
    }

}