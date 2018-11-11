package br.ufg.es.tacs.tarefatdd.testaano;

public class AnoBissexto {

	private int ano;
	private boolean bissexto;

	public AnoBissexto(int ano) {
		this.ano = ano;
	}

	public void CalculaBissexto() {

		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			bissexto = true;
		}
		else{
			bissexto = false;
		}

	}

	public boolean isBissexto() {
		return bissexto;
	}

}
