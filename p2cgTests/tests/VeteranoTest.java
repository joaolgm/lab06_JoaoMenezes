package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import p2cg.Jogo;
import p2cg.Plataforma;
import p2cg.Veterano;

public class VeteranoTest {
	
	Veterano user = new Veterano("joao", "joao.menezes", 100, 1000);
	Plataforma jogo3 = new Plataforma("mario", 1337, 0, 0, 0);

	@Test
	public void testComprarJogo(Jogo jogo, int preco) {
		try {
			user.comprarJogo(jogo3, jogo3.getPreco());
		} catch (Exception e) {
			assertEquals("Nao tem dinheiro suficiente para comprar o jogo.", e.getMessage());
		}
	}
	
	@Test
	public void testVeterano() {
		try {
			new Veterano(null, "joao.menezes", 100, 1000);
		} catch (Exception e){
			assertEquals("Nome nulo invalido", e.getMessage());
		}
		try {
			new Veterano("", "joao.menezes", 100, 1000);
		} catch (Exception e) {
			assertEquals("Nome vazio invalido", e.getMessage());
		}
	}
}
