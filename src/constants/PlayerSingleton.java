package constants;

import java.util.ArrayList;

import models.Armor;
import models.Move;
import models.Player;

public abstract class PlayerSingleton {

	private static Player player;
	
	public static Player getPlayer() {
		
		if (player == null) {
			// Configuração do jogador
			Armor basicArmor = new Armor("Exo-Armadura XT32", "Armadura de alta resistência que aumenta as capacidades humanas.",
								RoleConstants.PILOT, ElementConstants.NORMAL, 1, 6.0, 8.0);
			
			ArrayList<Move> playerMoves = new ArrayList<Move>();
			playerMoves.add( new Move("Soco Turbina", "Soco forte que usa pequenas turbinas instaladas na luva do piloto.", ElementConstants.NORMAL, false, 2.0, 0));
			
			player = new Player("Cpt. Allister",
										"Os avançados humanos de Marselha, com seus cabelos brancos, fala suave e grande inteligência e esclarecimento, podem lembrar rumores e lendas sobre qualquer assunto com um teste bem-sucedido de Inteligência.", 
										RoleConstants.PILOT, 
										150.00, 4.0, 6.0, 1, basicArmor, null, playerMoves, 0.0, 0.0);
		}
		
		return player;
	}
}
