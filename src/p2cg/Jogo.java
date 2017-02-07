package p2cg;

public class Jogo {
	private String nome;
	private double preco;
	private int maiorScore = 0;
	private int qtdVezesJogadas = 0;
	private int qtdVezesZeradas = 0;
	
	public Jogo(String nome, double preco, int maiorScore, int qtdVezesJogadas, int qtdVezesZeradas) {
		this.nome = nome;
		this.preco = preco;
		this.maiorScore = maiorScore;
		this.qtdVezesJogadas = qtdVezesJogadas;
		this.qtdVezesZeradas = qtdVezesZeradas;
	}

	public int registraJogada(int score, boolean zerou) {
		qtdVezesJogadas++;
		if (zerou == true) {
			qtdVezesZeradas++;
		}
		if (score > maiorScore) {
			maiorScore = score;
		}
		return x2p;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMaiorScore() {
		return maiorScore;
	}

	public void setMaiorScore(int maiorScore) {
		this.maiorScore = maiorScore;
	}

	public int getQtdVezesJogadas() {
		return qtdVezesJogadas;
	}

	public void setQtdVezesJogadas(int qtdVezesJogadas) {
		this.qtdVezesJogadas = qtdVezesJogadas;
	}

	public int getQtdVezesZeradas() {
		return qtdVezesZeradas;
	}

	public void setQtdVezesZeradas(int qtdVezesZeradas) {
		this.qtdVezesZeradas = qtdVezesZeradas;
	}

	public double getPreco() {
		return preco;
	}
	
}
