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
	
	static Equipamento espada = new Equipamento("Espada", 10, "� uma espada");
	static Equipamento lanca = new Equipamento("Lan�a", 14, "� uma lan�a");
	static Equipamento maca = new Equipamento("Ma�a", 12, "� uma ma�a");
	
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
			System.out.println("Op��o de classe n�o existe");
			escolheItem();
			break;
		
		}
		return item;
	}
}







