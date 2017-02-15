package p2cg;
/**
 * Classe responsavel por especializar o conceito de Jogo para Plataforma.
 * @author Joao Menezes
 *
 */
public class Plataforma extends Jogo {

	public Plataforma(String nome, int preco, int maiorScore, int qtdVezesJogadas, int qtdVezesZeradas) throws Exception {
		super(nome, preco, maiorScore, qtdVezesJogadas, qtdVezesZeradas);
		if (nome.equals("") || nome.equals(null)) {
			throw new Exception("Nome nulo ou vazio");
		} if (preco < 0) {
			throw new Exception("Valor invalido");
		} if (maiorScore < 0) {
			throw new Exception("Score invalido");
		} if (qtdVezesJogadas < 0 || qtdVezesZeradas < 0) {
			throw new Exception("Quantidade invalida");
		}
	}

	@Override
	public int registraJogada(Jogo jogo, int score, boolean zerou) {
		if (zerou == true) {
			return 20;
		}
		return 0;
	}
}