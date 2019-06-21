package classadapter;

import java.util.Random;

public class RoboInimigo {

    Random gerador = new Random();

    public void baterComAsMaos() {

        int danoAtaque = gerador.nextInt(10) + 1;

        System.out.println("Robô Inimigo causa " + danoAtaque + "pts de dano com suas mãos.");

    }

    public void andarPraFrente() {

        int movimento = gerador.nextInt(5) + 1;

        System.out.println("Robô Inimigo anda " + movimento + " espaços.");

    }

    public void reagirAUmHumano(String nomePiloto) {

        System.out.println("Robô Inimigo treta com " + nomePiloto +".");

    }
}
