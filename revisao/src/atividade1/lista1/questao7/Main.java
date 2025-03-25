package lista1.questao7;

// Sistema de Perfil de Usuário para Rede Social: Uma rede social quer permitir que seus usuários criem perfis. 
// Implemente uma classe PerfilUsuario com atributos para nome de usuário, bio e número de seguidores. 
// Crie perfis para três usuários e mostre os detalhes.

public class Main {
    public static void main(String[] args) {
    PerfilUsuario usuario1 = new PerfilUsuario("@Pietrollima", "São Paulo/SP 25 anos Medicina/Usp", 1_500);
    PerfilUsuario usuario2 = new PerfilUsuario("@i7ellegx", "Rec/PE 19 anos  Si/Unicap", 650);
    PerfilUsuario usuario3 = new PerfilUsuario("@joao_levi07", "Rio de Janeiro/RJ MedVet/UFRJ" , 906);

    try{
        usuario1.setSeguidores(-1);
    }catch(Exception e){
        System.out.println();
    }

    try{
        usuario2.setSeguidores(-1);
    }catch(Exception e){
        System.out.println();
    }

    try{
        usuario3.setSeguidores(-1);
    }catch(Exception e){
        System.out.println();
    }

    usuario1.exibirPerfil();
    System.out.println();

    usuario2.exibirPerfil();
    System.out.println();

    usuario3.exibirPerfil();
    }
}
