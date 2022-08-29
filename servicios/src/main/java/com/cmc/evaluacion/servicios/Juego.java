package com.cmc.evaluacion.servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.cmc.evaluacion.entidades.Carta;
import com.cmc.evaluacion.entidades.Naipe;

public class Juego {
	
	private Naipe naipe;
	private HashMap<String, ArrayList<Carta>> cartasJugador = new HashMap<String, ArrayList<Carta>>();
	private ArrayList<Carta> naipeBarajado = new ArrayList<Carta>();

	public Juego() {
		naipe = new Naipe();
		naipeBarajado.addAll(naipe.barajar());
	}

	public Juego(String[] idsJugadores) {
		for (int i = 0; i < idsJugadores.length; i++) {
			cartasJugador.put(idsJugadores[i], new ArrayList<Carta>());
		}
		naipe = new Naipe();
		naipeBarajado.addAll(naipe.barajar());
	}

	public void entregarCartas(int cartasXjugador) {
		int numeroJugadores = cartasJugador.size();
		int totalCartasARepartir = numeroJugadores*cartasXjugador;
		for (int i = 0; i < totalCartasARepartir; i = i + numeroJugadores) {
			
			int iterador = i;
			
			for (Entry<String, ArrayList<Carta>> set : cartasJugador.entrySet()) {				 
				
				ArrayList<Carta> recuperado = new ArrayList<Carta>();
				recuperado.addAll(set.getValue());
				recuperado.add(naipeBarajado.get(iterador));
				iterador++;
				cartasJugador.put(set.getKey(), recuperado);
	        }
		}
	}
	
	public int devolverTotal(String id) {
		int total = 0;
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		cartas = cartasJugador.get(id);
		if (!cartas.isEmpty()) {
			for (int i = 0; i < cartas.size(); i++) {
				total = total + cartas.get(i).getNumero().getValor();
			}
		}
		return total;
	}
	
	public String determinarGanador() {
		int suma = 0;
		String ganador = "";
		
		for (Entry<String, ArrayList<Carta>> set : cartasJugador.entrySet()) {
			if (this.devolverTotal(set.getKey()) > suma) {
				suma = this.devolverTotal(set.getKey());
				ganador = set.getKey();
			}
		}
		return ganador;
		
	}

	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}

	public HashMap<String, ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}
	
}
