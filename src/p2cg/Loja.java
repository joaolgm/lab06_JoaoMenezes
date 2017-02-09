package p2cg;

import java.util.HashMap;

public class Loja {
	private HashMap<String, Usuario> usuarios;
	
	public void adicionaUsuario(Usuario usuario) {
		usuarios.put(usuario.getLogin(), usuario);
	}
	
	public void adicionaDinheiro(Usuario usuario, int dinheiro) {
		if (usuarios.containsKey(usuario.getLogin())) {
			usuario.setDinheiro(dinheiro);
		}
	}
	
	public void venderJogos(Jogo jogo, Usuario usuario, int preco) {
		if (usuarios.containsKey(usuario.getLogin())) {
			if (usuario.getDinheiro() >= preco) {
				usuario.setDinheiro((usuario.getDinheiro() - preco));
				usuario.jogosComprados.add(jogo);
			}
		}
	}
	@Override
	public String toString() {
		String imprime = "=== Central P2-CG ==="; 
		for (String username : usuarios.keySet()) {
			imprime += usuarios.get(username).toString();
		}
		imprime += "--------------------------------------------";
		return imprime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuarios == null) ? 0 : usuarios.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loja other = (Loja) obj;
		if (usuarios == null) {
			if (other.usuarios != null)
				return false;
		} else if (!usuarios.equals(other.usuarios))
			return false;
		return true;
	}
}
