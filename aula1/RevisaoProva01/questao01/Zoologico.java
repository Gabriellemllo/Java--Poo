package aula1.RevisaoProva01.questao01;

public class Zoologico {
    Gato gato;
    Cachorro cachorro;
    
   public void emitirSom(){
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        // Emitindo som do gato
        gato.emitirSom();
        // Emitindo som do cachorro
        cachorro.emitirSom();
        

   }
}
