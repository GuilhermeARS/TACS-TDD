package br.ufg.es.tacs.tarefatdd.conversaoRomano;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import br.ufg.es.tacs.tarefatdd.testaConversaoRomano.ConversaoRomano;

public class TestaConversaoRomano {

	ConversaoRomano conv = new ConversaoRomano();

	@Test
	public void testNumeroValido() {
		assertEquals(1500, conv.converterEmRomanos("MD"));
	}

	@Test
	public void testNumeroValidoMin() {
		assertEquals(1, conv.converterEmRomanos("I"));
	}

	@Test
	public void testNumeroValidoMax() {
		assertEquals(4999, conv.converterEmRomanos("MMMMCMXCIX"));

	}

	@Test(expected = IllegalArgumentException.class)
	public void testDecimalInvalido() throws Exception {
		conv.converterEmRomanos("10");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCaractereInvalido() throws Exception {
		conv.converterEmRomanos("***");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRomanoInvalido() throws Exception {
		conv.converterEmRomanos("MMMMMMMMMM");

	}

}
