package br.ufg.es.tacs.tarefatdd.ano;

import br.ufg.es.tacs.tarefatdd.testaano.AnoBissexto;

import org.junit.Assert;
import org.junit.Test;

public class TestaAnoBissexto {

	@Test
	public void main() {

		AnoBissexto ano1 = new AnoBissexto(400); //bissexto 
		AnoBissexto ano2 = new AnoBissexto(1992);//bissexto 
		AnoBissexto ano3 = new AnoBissexto(399);//não bissexto 
		AnoBissexto ano4 = new AnoBissexto(401);//não bissexto 
		AnoBissexto ano5 = new AnoBissexto(2200);//não bissexto 
		AnoBissexto ano6 = new AnoBissexto(800);// bissexto

		ano1.CalculaBissexto();
		ano2.CalculaBissexto();
		ano3.CalculaBissexto();
		ano4.CalculaBissexto();
		ano5.CalculaBissexto();
		ano6.CalculaBissexto();



		boolean bissexto = true;
		boolean naoBissexto = false;

		Assert.assertEquals(bissexto, ano1.isBissexto());
		Assert.assertEquals(bissexto, ano2.isBissexto());
		Assert.assertEquals(naoBissexto, ano3.isBissexto());
		Assert.assertEquals(naoBissexto, ano4.isBissexto());
		Assert.assertEquals(naoBissexto, ano5.isBissexto());
		Assert.assertEquals(bissexto, ano6.isBissexto());
		
	
	}
}
