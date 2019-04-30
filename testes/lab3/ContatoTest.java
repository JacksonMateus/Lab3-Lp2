package lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContatoTest {
	private Contato contatoBasico;

	@BeforeEach
	public void criaContato() {
		contatoBasico = new Contato("Jackson", "Mateus", "988002767");

	}

	@Test
	void testContato() {
		Contato contato1 = new Contato("Jackson", "Mateus", "988002767");
		assertEquals(this.contatoBasico.getNome(), contato1.getNome());
		assertEquals(this.contatoBasico.getSobrenome(), contato1.getSobrenome());
		assertEquals(this.contatoBasico.getTelefone(), contato1.getTelefone());

	}

	@Test
	void testSetNome() {
		String msg = "Esperando obter o nome do contato";
		assertEquals("Jackson", this.contatoBasico.getNome(), msg);
	}

	@Test
	void testSetSobrenome() {
		String msg = "Esperando obter o sobrenome do contato";
		assertEquals("Mateus", this.contatoBasico.getSobrenome(), msg);
	}

	@Test
	void testSetTelefone() {
		String msg = "Esperando obter o sobrenome do contato";
		assertEquals("988002767", this.contatoBasico.getTelefone(), msg);

	}

	@Test
	void testListagemContato() {
		String msg = "Esperando obter o nome completo";
		assertEquals("Jackson Mateus", contatoBasico.listagemContato(), msg);
	}

	@Test
	void testMostrarContato() {
		String msg = "Esperando obter nome,sobrenome e Telefone";
		assertEquals("Jackson Mateus 988002767", contatoBasico.mostrarContato(), msg);
	}

	@Test
	void testNomeNull() {
		try {
			Contato contatoInvalido = new Contato(null, "Gaudencio", "21010000");
			} catch (NullPointerException npe) {
			
		}  }

	@Test
	void testSobrenomeNull() {
		try {
			Contato contatoInvalido = new Contato("Matheus", null, "21010000");
			} catch (NullPointerException npe) {
				
			} }

	@Test
	void testTelefoneNull() {
		try {
			Contato contatoInvalido = new Contato("Matheus", "Gaudencio", null);
			
		} catch (NullPointerException npe) {
			
		}  }

	@Test
	void testNome() {
		try {
			Contato contatoInvalido = new Contato("", "Gaudencio", "4002-8922");
		} catch (IllegalArgumentException iae) {
			
		} }

	@Test
	void testSobrenome() {
		try {
			Contato contatoInvalido = new Contato("Matheus", "", "4002-8922"); } 
		catch (IllegalArgumentException iae) { 
			} }

	@Test
	void testTelefone() {
		try {
			Contato contatoInvalido = new Contato("Matheus", "Gaudencio", "");
			} catch (IllegalArgumentException iae) {
				
			} }
	@Test
	void testEquals() {
		Contato contato1 = new Contato("nome", "sobrenome", "celular");
		Contato contato2 = new Contato("Jackson", "Mateus", "988002767");
		assertFalse(contatoBasico.equals(null));
		assertFalse(contatoBasico.equals(contato1));
		assertTrue(contatoBasico.equals(contato2));
		}


}
