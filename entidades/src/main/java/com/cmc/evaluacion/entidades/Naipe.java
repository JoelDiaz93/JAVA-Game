package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Naipe {

	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	public Naipe() {
		this.numerosPosibles = new ArrayList<Numero>();
		this.cartas = new ArrayList<Carta>();

		this.numerosPosibles.add(new Numero("A", 11));
		this.numerosPosibles.add(new Numero("2", 2));
		this.numerosPosibles.add(new Numero("3", 3));
		this.numerosPosibles.add(new Numero("4", 4));
		this.numerosPosibles.add(new Numero("5", 5));
		this.numerosPosibles.add(new Numero("6", 6));
		this.numerosPosibles.add(new Numero("7", 7));
		this.numerosPosibles.add(new Numero("8", 8));
		this.numerosPosibles.add(new Numero("9", 9));
		this.numerosPosibles.add(new Numero("10", 10));
		this.numerosPosibles.add(new Numero("J", 10));
		this.numerosPosibles.add(new Numero("Q", 10));
		this.numerosPosibles.add(new Numero("K", 10));

		for (Numero numero : numerosPosibles) {
			cartas.add(new Carta(numero, Palos.CORAZON_NEGRO));
			cartas.add(new Carta(numero, Palos.CORAZON_ROJO));
			cartas.add(new Carta(numero, Palos.DIAMANTE));
			cartas.add(new Carta(numero, Palos.TREBOL));
		}

	}

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		for (int i = 0; i < 100; i++) {
			int posicion = Random.obtenerPosicion();
			Carta cartaAuxiliar = cartas.get(posicion);
			if (cartaAuxiliar != null) {
				if (cartaAuxiliar.getBarajado().equals("N")) {
					auxiliar.add(cartaAuxiliar);
					cartaAuxiliar.setBarajado("C");
				}
			}
		}
		for (Carta carta : cartas) {
			if (carta != null) {
				if (carta.getBarajado().equals("N")) {
					auxiliar.add(carta);
					carta.setBarajado("C");
				}
			}
		}
		return auxiliar;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}
}
