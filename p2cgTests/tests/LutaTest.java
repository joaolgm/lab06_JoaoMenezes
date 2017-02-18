package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import p2cg.Luta;
import p2cg.Veterano;

public class LutaTest {
	Luta jogo1;
	Veterano user;

	@Before
	public void start() throws Exception {
		jogo1 = new Luta("ff", 10, 0, 0, 0);
		user = new Veterano("joao", "joao.menezes", 100, 1000);
	}

	@Test
	public void testRegistraJogada() {
		try {
			user.registraJogadas(jogo1, 500000, true);
		} catch (Exception e) {
			assertEquals("Quantidade de x2p errada.", e.getMessage());
		}
	}

	@Test
	public void testLuta() {
		try {
			jogo1 = new Luta(null, 10, 0, 0, 0);
		} catch (Exception e) {
			assertEquals("Nome do jogo nao pode ser nulo.", e.getMessage());
		}
		try {
			jogo1 = new Luta("", 10, 0, 0, 0);
		} catch (Exception e) {
			assertEquals("Nome do jogo nao pode ser vazio.", e.getMessage());
		}
	}
}
