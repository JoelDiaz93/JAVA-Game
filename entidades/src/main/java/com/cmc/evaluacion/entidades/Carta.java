package com.cmc.evaluacion.entidades;

public class Carta {

	private Numero numero;
	private String palo;
	private String barajado = "N";

	public Carta(Numero numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getBarajado() {
		return barajado;
	}

	public void setBarajado(String barajado) {
		this.barajado = barajado;
	}

	@Override
	public String toString() {
		return numero.getNumeroCarta() + "-" + palo;
	}

}
