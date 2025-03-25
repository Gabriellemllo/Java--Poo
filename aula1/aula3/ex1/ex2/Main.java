package aula1.aula3.ex1.ex2;

import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    // como colocar uma constante?
    //public  static final (tipo da variavel) e o nome dela = algum valor
    public static void main(String[] args) {
        // CARRO
        Carro carro = new Carro("ABC1", " Gamma 1.6 Turbo GDI.","HB20",50.4,2021,4,"Teto Solar");
        System.out.println("Por favor, informe a quantidade de km que deseja percorrer: ");
        double km = ler.nextDouble();
        double consumo = carro.calcularConsumo(km);
        System.out.println("O consumo do carro é de: "+ consumo + " litros");
        

        // MOTO
        Moto moto = new Moto("DEF2", "600cc"," YAMAHA XJ6",17.3,2023,0.0);
        System.out.println("Por favor, informe a quantidade de km que deseja percorrer: ");
        km = ler.nextDouble();
        consumo = moto.calcularConsumo(km);
        System.out.println("O consumo da moto é de: "+ consumo + " litros");

    }
}
