package lista1.questao7;

// Sistema de Perfil de Usuário para Rede Social: Uma rede social quer permitir que seus usuários criem perfis. 
// Implemente uma classe PerfilUsuario com atributos para nome de usuário, bio e número de seguidores. 
// Crie perfis para três usuários e mostre os detalhes.

public class PerfilUsuario {
    private String usuario;
    private String bio;
    private int seguidores;

    public PerfilUsuario(String usuario, String bio, int seguidores) {
        this.usuario = usuario;
        this.bio = bio;
        this.seguidores = seguidores;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String Usuario) {
        this.usuario = Usuario;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores)throws Exception {
        if (seguidores < 0) {
            throw new Exception("Número de seguidores não pode ser negativo!");
        }
        this.seguidores = seguidores;
    }

    public void exibirPerfil() {
        System.out.println("Usuário: " + getUsuario());
        System.out.println("Bio: " + getBio());
        System.out.println("Seguidores: " +  getSeguidores());
    }
}
