package lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgendaTest {
	private Agenda agenda;
	private Agenda agenda2;
	private Agenda schedule;
	
	@BeforeEach
	public void criaAgendas() {
		agenda = new Agenda();
		agenda2 = new Agenda();
		schedule  = new Agenda(); }
	
	@Test
	void testCadastarContato() {
		assertTrue(this.agenda.cadastarContato("Matheus", "Gaudencio", "(83) 99999-0000", 1));
		assertTrue(this.agenda.cadastarContato("Pedro", "Silva", "(84) 98888-11111", 1));
		assertFalse(this.agenda.cadastarContato("nome", "sobrenome", "telefone", 0));
		assertFalse(this.agenda.cadastarContato("nome", "sobrenome", "telefone", 101));
		assertTrue(this.agenda.cadastarContato("Maria", "Flor", "+1 (595) 5555-1234", 100));
		}

	@Test
	void testListarContatos() {
		this.agenda.cadastarContato("Pedro", "Silva", "(84) 98888-11111", 1);
		this.agenda.cadastarContato("Jackson","Mateus", "(83) 988002767", 100);
		assertEquals("1 - Pedro Silva\n100 - Jackson Mateus\n",agenda.listarContatos());  
		
	}

	@Test
	void testExibirContatos() {
		this.agenda.cadastarContato("Pedro", "Silva", "(84) 98888-11111", 1);
		assertEquals("Pedro Silva (84) 98888-11111",agenda.ExibirContatos(1));
		assertEquals("POSIÇÃO INVÁLIDA!",agenda.ExibirContatos(2));
	}
	@Test
	void testEqualsObject() {
		this.agenda.cadastarContato("Jackson", "Mateus", "988002767", 2);
		this.schedule.cadastarContato("Jackson", "Mateus", "988002767", 2);
		assertTrue(agenda.equals(schedule));
		agenda2.cadastarContato("Jurubeba", "Usuariana", "40028922",3);
		assertFalse(agenda.equals(agenda2));
		
		
	}

	
}
