package p2cg;

public class Veterano extends Usuario {
	
	private double desconto;

	public Veterano(String nome, String login, double dinheiro, double desconto) {
		super(nome, login, dinheiro);
		this.desconto = desconto;
	}
	
	public double getDesconto(Jogo jogo) {
		desconto = jogo.getPreco() - (1/5);
		return desconto;
	}
}
