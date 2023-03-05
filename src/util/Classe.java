package util;

import java.util.Scanner;

import personagem.PersonagemJogador;

public class Classe {

	private int id;
	private String nome;
	private String descricao;
	
	public Classe(int id, String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.id = id;
	}
	
	public Classe() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	

	
	static Classe paladino = new Classe(1, "Paladino" , "A espada dos deuses");
	static Classe mago = new Classe(2, "Mago", "Aquele que vê a trama da realidade");
	
	static Classe[] listaClasse = {paladino,mago};

	@Override
	public String toString() {
		return this.getId() + " - Nome: " + this.getNome() + "\nDescricao: " + this.getDescricao();
	}
	
	public static void listarClasses() {
		for(int i = 0; i < listaClasse.length; i++) {
			listaClasse[i].toString();
		}
	}
	
	public static Classe escolheClasse() {
		Scanner sc = new Scanner(System.in);
		Classe classe = new Classe();
		int auxiliar = 0;
		listarClasses();
		auxiliar = sc.nextInt();
		switch(auxiliar) {
		case 1: 
			classe = listaClasse[1];
			break;
		case 2:
			classe = listaClasse[2];
			break;
		default:
			System.out.println("Opção de classe não existe");
			escolheClasse();
			break;
		
		}
		return classe;
	}
	
	
	
	
}
