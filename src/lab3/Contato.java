package lab3;

/**
 * É responsavél por representar um contato de uma agenda
 * @author Jackson Mateus
 *
 */
public class Contato {
	/**
	 * Nome do contato
	 */
	private String nome;
	/**
	 * Sobrenome do contato
	 */
	private String sobrenome;
	/**
	 * Telefone do contato
	 */
	private String telefone;
	/**
	 * Construtor Padrão sem argumentos
	 */
	public Contato() {
		
	}
	/**
	 * Constrói um contato a partir do nome,sobrenome,telefone do contato,
	 * dependendo do conteudo da variavél recebida pode haver exceções
	 * @param nome do contato
	 * @param sobrenome do contato
	 * @param telefone do contato
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		if (nome ==null) {
			throw new NullPointerException("Nome nulo");
		}
		else if(nome.trim().equals("")) {
			throw new IllegalArgumentException("Parametro Inválido");
		}
		if (sobrenome==null) {
			throw new NullPointerException("Sobrenome nulo"); }
		else if(sobrenome.trim().equals("")) {
			throw new IllegalArgumentException("Parametro Inválido");
		}
		if (telefone==null) {
			throw new NullPointerException("Telefone nulo"); }
		else if(telefone.trim().equals("")) {
			throw new IllegalArgumentException("Parametro Inválido");
		}
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	/**
	 * Retorna o nome do contato
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Altera o nome do contato;
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
    /**
     * Retorna o sobrenome do contato
     */
	public String getSobrenome() {
		return sobrenome;
	}
    /**
     * Altera o sobrenome do contato
     */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	/**
	 * Retorna o telefone do contato
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * Altera o telefone do contato
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/**
	 * Lista o nome e sobrenome do contato
	 */
	public String listagemContato() {
		return nome + " " + sobrenome;
	}
	/**
	 * Mostra o nome,sobrenome e telefone do contato
	 */
	public String mostrarContato() {
		return nome + " " + sobrenome + " " + telefone;
	}
	
	/**
	 * Metodo equals,usado para comparar se dois
	 * contatos são iguais
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}
	
	
	
	

}
