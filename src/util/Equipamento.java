package util;

import java.util.Scanner;

public class Equipamento {
	private String nome;
	private int dano;
	private String descricao;

	public Equipamento(String nome, int dano, String descricao) {
		super();
		this.nome = nome;
		this.dano = dano;
		this.descricao = descricao;
	}
	
	public Equipamento() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	static Equipamento espada = new Equipamento("Espada", 10, "É uma espada");
	static Equipamento lanca = new Equipamento("Lança", 14, "É uma lança");
	static Equipamento maca = new Equipamento("Maça", 12, "É uma maça");
	
	static Equipamento[] listaEquip = {espada, lanca, maca};
	
	@Override
	public String toString() {
		return "Equipamento: \nNome: " + nome + "\nDano: " + dano + "\nDescricao: " + descricao;
	}

	public static void listarEquips() {
		for(int i = 0; i < listaEquip.length; i++) {
			listaEquip[i].toString();
		}
	}
	
	public static Equipamento escolheItem() {
		Scanner sc = new Scanner(System.in);
		Equipamento item = new Equipamento();
		int auxiliar = 0;
		listarEquips();
		auxiliar = sc.nextInt();
		switch(auxiliar) {
		case 1: 
			item = listaEquip[1];
			break;
		case 2:
			item = listaEquip[2];
			break;
		case 3:
			item = listaEquip[3];
			break;
		default:
			System.out.println("Opção de classe não existe");
			escolheItem();
			break;
		
		}
		return item;
	}
}







