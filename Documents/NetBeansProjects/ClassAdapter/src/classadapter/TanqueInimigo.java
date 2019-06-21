package classadapter;

import java.util.Random;

public class TanqueInimigo implements Atacador {

    Random gerador = new Random();

    public void armaDeFogo() {

        int danoAtaque = gerador.nextInt(10) + 1;

        System.out.println("Tanque Inimigo causa " + danoAtaque + "pts de dano.");

    }

    public void irPraFrente() {

        int movimento = gerador.nextInt(5) + 1;

        System.out.println("Tanque Inimigo move " + movimento + " espaços.");

    }

    public void atribuirPiloto(String nomePiloto) {

        System.out.println(nomePiloto + " está dirigindo o tanque.");

    }

}
