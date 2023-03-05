package util;

public class Efeito {

	private String nome;
	private String descricao;
	
	public Efeito(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	Efeito cura = new Efeito("cura", "Recupera 5 pontos de vida");
	Efeito raioDeFogo = new Efeito("Raio de fogo", "Dispara um progetil de fogo, causando 10 pontos de dano");
	
	Efeito[] listaEfeito = {cura, raioDeFogo};
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nDescricao: " + descricao;
	}

	public void listarEfeitos() {
		for(int i = 0; i < listaEfeito.length; i++) {
			System.out.println("-------- Lista de Efeitos --------");
			listaEfeito[i].toString();
		}
	}
	
}
