package br.ufg.es.tacs.tarefatdd.testaConversaoRomano;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConversaoRomano {

	public ConversaoRomano() {
	}

	public int converterEmRomanos(String decimal) {
		int resultado = 0;
		if (decimal == null || decimal.isEmpty()
				|| !decimal.matches("^(M{0,4})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
			throw new IllegalArgumentException("O argumento contém caracteres invalidos");
		}
		final Matcher matcher = Pattern.compile("M|CM|D|CD|C|XC|L|XL|X|IX|V|IV|I").matcher(decimal);
		final int[] decimalValues = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		final String[] romanNumerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		while (matcher.find())
			for (int i = 0; i < romanNumerals.length; i++)
				if (romanNumerals[i].equals(matcher.group(0)))
					resultado += decimalValues[i];

		if (resultado > 4999 || resultado < 1) {
			throw new IllegalArgumentException("Número inválido, fora do intervalo de 1 a 4999");
		}
		return resultado;

	}

}
