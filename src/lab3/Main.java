package lab3;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Agenda agenda = new Agenda();
		Menu menu = new Menu();
		
		while (true) {
		System.out.println(menu.exibirMenu());
	
		System.out.print("Opção> ");
		String opcao = sc.next().toUpperCase();
		
		
		switch(opcao) {
		case ("C"):
			System.out.println();
			System.out.print("Posicao: ");
			int posicao = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Sobrenome: ");
			String sobrenome = sc.nextLine();
			System.out.print("Telefone: ");
			String telefone = sc.nextLine();
			System.out.println();
			if (agenda.cadastarContato(nome, sobrenome, telefone, posicao)){
				agenda.cadastarContato(nome, sobrenome, telefone, posicao);
				System.out.println("CADASTRO REALIZADO!");
				System.out.println();

			}
			else {
				System.out.println("CADASTRO NÃO REALIZADO,POSIÇÃO INVALIDA!");
				System.out.println();
				
			}
			break;
		
		
		case ("L"):
			System.out.println();
			System.out.println(agenda.listarContatos());
			break;
		case ("E"):
			System.out.print("Contato> ");
			int indice = sc.nextInt();
			System.out.println();
			System.out.println(agenda.ExibirContatos(indice));
			System.out.println();
			break;
		
		case ("S"):
			System.exit(0);
		default:
			System.out.println("ENTRADA INVÁLIDA!");
		    System.out.println();  } 
		}
		}
	
	}

