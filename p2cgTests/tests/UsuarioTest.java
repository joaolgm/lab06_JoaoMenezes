package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import p2cg.Plataforma;
import p2cg.Usuario;
import p2cg.Veterano;

public class UsuarioTest {

	Usuario user;
	Plataforma jogo3;
	
	@Before
	public void start() throws Exception {
	user = new Veterano("joao", "joao.menezes", 100, 1000);
	jogo3 = new Plataforma("mario", 1337, 0, 0, 0);
	}
	
	@Test
	public void testComprarJogo() {
		try {
			user.comprarJogo(jogo3, jogo3.getPreco());
		} catch (Exception e) {
			assertEquals("Nao tem dinheiro suficiente para comprar o jogo.", e.getMessage());
		}
	}

	@Test
	public void testSetDinheiro() {
		try {
			user.setDinheiro(-100);
		} catch (Exception e) {
			assertEquals("Quantidade de dinheiro invalida", e.getMessage());		
			}
	}
	
	@Test
	public void testSetNome() {
		try {
			user.setNome("");
		} catch (Exception e) {
			assertEquals("Nome nao pode ser nulo ou vazio", e.getMessage());
		}
		try {
			user.setNome(null);
		} catch (Exception e) {
			assertEquals("Nome nao pode ser nulo ou vazio", e.getMessage());
		}
	}

}
