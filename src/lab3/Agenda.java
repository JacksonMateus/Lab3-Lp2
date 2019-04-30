package lab3;

import java.util.Arrays;

/**
 * É responsavél por reprentar uma agenda de contatos
 * @author Jackson Mateus
 *
 */
public class Agenda {
	Contato[] agenda;
	
	/**
	 * Constrói a agenda a partir de um array de contatos
	 */
	public Agenda() {
		this.agenda = new Contato[101];
	}
	
	/**
	 * Cadastra contatos na agenda,a partir do nome,sobrenome,telefone e da 
	 * posição,nessa posição é que será cadastrado o contato,
	 * tambem inicializa um contato 
	 * @param nome do contato
	 * @param sobrenome do contato
	 * @param telefone do contato
	 * @param posicao do contato
	 * @return um booleano se a posicao passada como parametro for válida
	 */
	public boolean cadastarContato(String nome,String sobrenome,String telefone,int posicao ) {
		Contato contato = new Contato(nome, sobrenome, telefone);
		if (posicao < 1 || posicao > 100) { 
			return false;
		}
		else {
			this.agenda[posicao] = contato ;
			return true;
		}
		
	}
	/**
	 * Lista os todos os contatos cadastrados na agenda até o momento
	 * @return uma String com os contatos cadastrados
	 */
	public String listarContatos() {
		String saida="";
		for (int i=1;i < this.agenda.length;i++) {
			if (this.agenda[i] != null) {
				saida += (i + " " + "-" + " " + agenda[i].listagemContato() + "\n");
				}
			}
		return saida;
		}
	/**
	 * Exibe o contato da agenda na posição desejada  
	 * @param indice que o usuario quer que seja exibido na tela 
	 * @return uma String mostrando o contato na posição passada como parametro,se a posicao
	 * que o usuario quer que seja exibida ainda n tenha sido cadastrada,é retorno que 
	 * a posição é inválida   
	 */
	public String ExibirContatos(int indice) {
		int cont=0;
		String saida="";
		for (int i=1;i < agenda.length;i++) {
			if (indice == i && agenda[i]!=null) {
				cont+=1;
				saida = agenda[i].mostrarContato(); 
				}
}
		if (cont == 0) {
			 saida = "POSIÇÃO INVÁLIDA!";
		}
		return saida;  }

	
	/**
	 * Metodo equals,usado para comparar se duas
	 * agendas são iguais
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (!Arrays.equals(agenda, other.agenda))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(agenda);
		return result; }
	
	
	


}
