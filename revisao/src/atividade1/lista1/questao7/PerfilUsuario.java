package lista1.questao7;

// Sistema de Perfil de Usuário para Rede Social: Uma rede social quer permitir que seus usuários criem perfis. 
// Implemente uma classe PerfilUsuario com atributos para nome de usuário, bio e número de seguidores. 
// Crie perfis para três usuários e mostre os detalhes.

public class PerfilUsuario {
    private String Usuario;
    private String bio;
    private int Seguidores;

    public PerfilUsuario(String Usuario, String bio, int Seguidores) {
        this.Usuario = Usuario;
        this.bio = bio;
        this.Seguidores = Seguidores;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getSeguidores() {
        return Seguidores;
    }

    public void setSeguidores(int Seguidores) {
        this.Seguidores = Seguidores;
    }

    public void exibirPerfil() {
        System.out.println("Usuário: " + getUsuario());
        System.out.println("Bio: " + getBio());
        System.out.println("Seguidores: " +  getSeguidores());
    }
}
