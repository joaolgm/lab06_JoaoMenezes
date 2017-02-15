package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import p2cg.Luta;
import p2cg.RPG;
import p2cg.Veterano;

public class RPGTest {
	
	RPG jogo1 = new RPG("ff", 10, 0, 0, 0);
	Veterano user = new Veterano("joao", "joao.menezes", 100, 1000);

	@Test
	public void testRegistraJogada() {
		try {
			user.registraJogadas(jogo1, 50000, true);
		} catch (Exception e) {
			assertEquals("Quantidade de x2p errada.", e.getMessage());
		}
	}

	@Test
	public void testRPG() {
		try {
			Luta jogo1 = new Luta(null, 10, 0, 0, 0);
		} catch (Exception e) {
			assertEquals("Nome do jogo nao pode ser nulo.", e.getMessage());
		}
	}

}
