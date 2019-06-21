package classadapter;

public class RoboInimigoAdapter implements Atacador {

    RoboInimigo oRobo;

    public RoboInimigoAdapter(RoboInimigo novoRobo) {

        oRobo = novoRobo;

    }

    public void armaDeFogo() {

        oRobo.baterComAsMaos();

    }

    public void irPraFrente() {

        oRobo.andarPraFrente();

    }

    public void atribuirPiloto(String nomePiloto) {

        oRobo.reagirAUmHumano(nomePiloto);

    }

}
