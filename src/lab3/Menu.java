package lab3;

/**
 * É responsavél por exibir pro usuario as opções existentes nesse sistema 
 * @author Jackson Mateus
 */
public class Menu {
	
	/**
	 * Construtor usado para instanciar a classe Menu
	 */
	public Menu() {
		
	}
	/**
	 * Exibe pro usuario as opçoes do sistema
	 */
	public String exibirMenu() {
		String saida="";
		saida+="(C)adastrar Contato" + "\n";
		saida+="(L)istar Contatos" +"\n";
		saida+="(E)xibir Contato" + "\n";
		saida+="(S)air" + "\n";
		return saida;   
				}


}
