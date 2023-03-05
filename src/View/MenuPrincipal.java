package View;

import java.util.Scanner;
import personagem.PersonagemJogador;
import util.Classe;
import util.Equipamento;


public class MenuPrincipal {
	
	Scanner sc = new Scanner(System.in);
	
	private static final int OPCAO_MENU_CONTINUAR = 1;
	private static final int OPCAO_MENU_NOVO_JOGO = 2;
	private static final int OPCAO_MENU_PERSONAGEM = 3;
	private static final int OPCAO_MENU_SAIR = 4;
	
	public void apresentarMenuInicial() {
		int opcao = this.apresentarOpcoesdeMenu();
		while (opcao != OPCAO_MENU_SAIR) {
			switch (opcao) {
			case OPCAO_MENU_CONTINUAR: {
//				UsuarioVO usuarioVO = this.realizarLogin();
//				if(usuarioVO.getIdUsuario() != 0 && usuarioVO.getDataExpiracao() == null) {
//					System.out.println("\nUsuário Logado: " + usuarioVO.getLogin());
//					System.out.println("Perfil: " + usuarioVO.getTipoUsuarioVO());
//					Menu menu = new Menu();
//					menu.apresentarMenu(usuarioVO);
//				}
				break;
			}
			case OPCAO_MENU_NOVO_JOGO: {
				this.criaPersonagem();
				break;
			}
			case OPCAO_MENU_PERSONAGEM: {
				
				break;
			}
			default: {
				System.out.println("\nOpção invalida!");
			}
			}
			opcao = this.apresentarOpcoesdeMenu();
		}
		
	}

	private int apresentarOpcoesdeMenu() {
		System.out.println("\n---------- Menu Inicial ----------");
		System.out.println("\nOpções: ");
		System.out.println(OPCAO_MENU_CONTINUAR + " - Continuar");
		System.out.println(OPCAO_MENU_NOVO_JOGO + " - Novo jogo");
		System.out.println(OPCAO_MENU_SAIR + " - Sair");
		System.out.print("\nDigite uma opção: ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public static void criaPersonagem() {
		Scanner sc = new Scanner(System.in);
		PersonagemJogador jogador = new PersonagemJogador();
		System.out.println("---------- Bem-vindo a criação de personagens ----------");
		System.out.print("Insira um nome: ");
		jogador.setNome(sc.nextLine());
		jogador.setDano(10);
		jogador.setVida(10);
		System.out.print("Escolha uma classe.");
		Classe auxiliarClasse = Classe.escolheClasse();
		jogador.setClasse(auxiliarClasse);
		System.out.print("Escolha uma arma.");
		Equipamento auxiliarItem = Equipamento.escolheItem();
		jogador.setItem(auxiliarItem);
		jogador.setExpAtual(0);
	}
	
}
