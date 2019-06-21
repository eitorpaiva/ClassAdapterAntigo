package classadapter;

public class Teste{
	
	public static void main(String[] args){
		
		TanqueInimigo tanque = new TanqueInimigo();
		
		RoboInimigo robo = new RoboInimigo();
		
		Atacador roboAdapter = new RoboInimigoAdapter(robo);
                    
		
                System.out.println("-------------------------");
		System.out.println("O Robô:");
                
                System.out.println();
		
		robo.reagirAUmHumano("Edilson Palma");
		robo.andarPraFrente();
		robo.baterComAsMaos();
		
                System.out.println("-------------------------");
		
                
		System.out.println("O Tanque Inimigo:");
		
                System.out.println();
                
		tanque.atribuirPiloto("Eitor Paiva");
		tanque.irPraFrente();
		tanque.armaDeFogo();
		
                System.out.println("-------------------------");
		
		System.out.println("O Robô com Adapter:");
		
                System.out.println();
		
		roboAdapter.atribuirPiloto("Jesuscleissan Aparecido");
                roboAdapter.irPraFrente();
		roboAdapter.armaDeFogo();
                
                System.out.println("-------------------------");
		
	}
	
}