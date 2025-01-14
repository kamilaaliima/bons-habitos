package com.bonshabitos.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bonshabitos.entities.goodhabits.CircularEconomyHabit;
import com.bonshabitos.entities.goodhabits.ConsciousConsumptionHabit;
import com.bonshabitos.entities.goodhabits.FoodHabit;
import com.bonshabitos.entities.goodhabits.GoodHabit;

public class GoodHabitFactory {

	/*
	 * Cada M�TODO dessa classe vai criar um OBJETO da CLASSE GoodHabit e depois vai
	 * retornar esse OBJETO
	 */

	public static GoodHabit createGoodHabitAlimentacao() {
		List<String> attitudes = new ArrayList<>();
		attitudes.add("Sou vegetariano");
		attitudes.add("Deixo de comer carne pelo menos uma vez na semana");
		attitudes.add("Compro alimentos org�nicos");

		List<String> suggestions = new ArrayList<>();
		suggestions.add("Leia Guia Alimentar de Dietas Vegetarianas para Adultos");
		suggestions.add("Assista ao document�rio Cowspiracy");
		suggestions.add("Escute o podcast que Babbi vai indicar");

		GoodHabit goodHabit = new FoodHabit(attitudes, suggestions);

		return goodHabit;
	}

	public static GoodHabit createGoodHabitEconomiaCircular() {

		List<String> atittudes = Arrays.asList("Compro em brech�s", "Reciclo e reuso",
				"Descarto de maneira adequada ap�s uso");
		List<String> suggestions = Arrays.asList("D� uma olhada em empresas que s�o adeptas: Natura, L'or�al, Unilever",
				"Segue esses perfis de uns brech�s massa: @dprafrente_brecho, @dbs_brecho, @brechodakombi",
				"Visita o site Enjoei");

		GoodHabit goodHabit = new CircularEconomyHabit(atittudes, suggestions);

		return goodHabit;
	}

	public static GoodHabit createGoodHabitConsumoConsciente() {

		List<String> atittudes = Arrays.asList("Compro apenas os alimentos que vou consumir/n�o desperdi�o comida;",
				"Uso ecobags", "Uso eletrodom�sticos com alta efici�ncia energ�tica (Selo A - Procel)");
		List<String> suggestions = Arrays.asList("O Custo Verdadeiro", "Obsolesc�ncia Programada");

		GoodHabit goodHabit = new ConsciousConsumptionHabit(atittudes, suggestions);

		return goodHabit;
	}

}
