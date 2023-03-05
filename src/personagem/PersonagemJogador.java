package personagem;

import util.Classe;
import util.Efeito;
import util.Equipamento;

public class PersonagemJogador extends PersonagemBase {
	
	private int id;
	private Classe classe;
	private Equipamento item;
	private int expAtual;
	private Efeito efeito;
	
	public PersonagemJogador(String nome, int dano, int vida, Classe classe, Equipamento item, int expAtual,
			Efeito efeito) {
		super(nome, dano, vida);
		this.classe = classe;
		this.item = item;
		this.expAtual = expAtual;
		this.efeito = efeito;
	}
	
	public PersonagemJogador() {
		super();
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Equipamento getItem() {
		return item;
	}

	public void setItem(Equipamento item) {
		this.item = item;
	}

	public int getExpAtual() {
		return expAtual;
	}

	public void setExpAtual(int expAtual) {
		this.expAtual = expAtual;
	}

	public Efeito getEfeito() {
		return efeito;
	}

	public void setBuff(Efeito efeito) {
		this.efeito = efeito;
	}

	@Override
	public String toString() {
		return "Classe: " + classe + "\nItem: " + item + "\nExperiencia: " + expAtual + "Efeitos: " + efeito;
	}
	

	
}
