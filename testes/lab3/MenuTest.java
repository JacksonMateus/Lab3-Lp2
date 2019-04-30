package lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MenuTest {

	private Menu menu;

	
	@BeforeEach
	void criaMenu() {
		menu = new Menu();
	}
	
	@Test
	void testExibirMenu() {
		assertEquals("(C)adastrar Contato\n(L)istar Contatos\n(E)xibir Contato\n(S)air\n",menu.exibirMenu());
	}
	
	



}
