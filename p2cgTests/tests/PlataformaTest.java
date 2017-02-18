package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import p2cg.Plataforma;
import p2cg.Veterano;

public class PlataformaTest {
	Plataforma jogo1;
	Veterano user;

	@Before
	public void start() throws Exception {
		jogo1 = new Plataforma("ff", 10, 0, 0, 0);
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

}
