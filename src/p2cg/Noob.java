package p2cg;

public class Noob extends Usuario {

	private double desconto;
	
	public Noob(String nome, String login, int dinheiro, double desconto) {
		super(nome, login, dinheiro);
		this.desconto = desconto;
	}
	
	public double getDesconto(Jogo jogo) {
		desconto = jogo.getPreco() - (1/10);
		return desconto;
	}
}
