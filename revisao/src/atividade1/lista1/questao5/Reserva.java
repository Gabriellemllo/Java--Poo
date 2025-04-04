package lista1.questao5;

// Sistema de Reservas de Hotel: Um hotel quer um sistema simples para gerenciar reservas.
// Elabore uma classe Reserva que contenha o nome do hóspede, o tipo de quarto (simples, duplo, suíte) e o número de noites. 
// Crie três reservas diferentes e exiba as informações.

public class Reserva {
    private String nomeHospede;
    private String tipoQuarto;
    private short numNoites;


    public Reserva(String nomeHospede, String tipoQuarto, short numNoites) {
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
        this.numNoites = numNoites;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }


    public void setNomeHospede(String nomeHospede)throws Exception {
        if (nomeHospede == null || nomeHospede.trim().isEmpty()) {
            throw new Exception("Nome do hóspede não pode ser nulo ou vazio!");
        }
        this.nomeHospede = nomeHospede;
    }   


    public String getTipoQuarto() {
        return tipoQuarto;
    }


    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }


    public short getNumNoites() {
        return numNoites;
    }


    public void setNumNoites(short numeroNoites) {
        this.numNoites = numeroNoites;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Hóspede: " + getNomeHospede());
        System.out.println("Tipo de Quarto: " + getTipoQuarto());
        System.out.println("Número de Noites: " + getNumNoites());
    }
}
