package p2cg;
/**
 * Classe responsavel por especializar o conceito de Usuario para Noob.
 * @author Joao Menezes
 *
 */
public class Noob extends Usuario {
	
	public Noob(String nome, String login, int dinheiro, int x2p) {
		super(nome, login, dinheiro);
		this.x2p = 0;
	}
	
	@Override
	public void comprarJogo(Jogo jogo, int preco) throws Exception {
		double newPreco = preco - 1/10;
		if (this.dinheiro < newPreco) {
			throw new Exception("Nao tem dinheiro suficiente para comprar o jogo.");
		}
		if (newPreco < this.dinheiro) {
			jogosComprados.add(jogo);
			dinheiro -= preco;
		}
	}
	/**
	 * Metodo responsavel por calcular a quantidade de x2p por jogo comprado.
	 * @param jogo
	 */
	public void x2pPorJogo(Jogo jogo) {
		this.x2p += (10 * jogo.getPreco());
	}
}
