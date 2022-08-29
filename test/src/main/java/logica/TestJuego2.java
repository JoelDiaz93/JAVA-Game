package logica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.cmc.evaluacion.entidades.Carta;
import com.cmc.evaluacion.servicios.Juego;

public class TestJuego2 {

	@Test
	public void validarCartasJugadorTest() {
		String[] jugadores = { "AFE", "SMO", "PGA" };
		Juego juego = new Juego(jugadores);
		juego.entregarCartas(5);
		HashMap<String, ArrayList<Carta>> jugadoresNaipe = juego.getCartasJugador();
		int sizeNaipe = jugadoresNaipe.get("AFE").size();
		assertEquals(5, sizeNaipe);
	}

	@Test
	public void validarCartasJugador1Test() {
		String[] jugadores = { "AFE", "SMO", "PGA" };
		Juego juego = new Juego(jugadores);
		juego.entregarCartas(5);
		HashMap<String, ArrayList<Carta>> jugadoresNaipe = juego.getCartasJugador();
		int sizeNaipe = jugadoresNaipe.get("PGA").size();
		assertEquals(5, sizeNaipe);
	}

	@Test
	public void validarCartasJugador2Test() {
		String[] jugadores = { "AFE", "SMO", "PGA" };
		Juego juego = new Juego(jugadores);
		juego.entregarCartas(5);
		HashMap<String, ArrayList<Carta>> jugadoresNaipe = juego.getCartasJugador();
		int sizeNaipe = jugadoresNaipe.get("SMO").size();
		assertEquals(5, sizeNaipe);
	}

	@Test
	public void validarCartasTest() {
		String[] jugadores = { "AFE", "SMO", "PGA" };
		Juego juego = new Juego(jugadores);
		juego.entregarCartas(5);
		HashMap<String, ArrayList<Carta>> jugadoresNaipe = juego.getCartasJugador();
		Carta carta1 = jugadoresNaipe.get("AFE").get(0);
		Carta carta2 = jugadoresNaipe.get("AFE").get(1);
		Carta carta3 = jugadoresNaipe.get("AFE").get(2);
		Carta carta4 = jugadoresNaipe.get("AFE").get(3);
		Carta carta5 = jugadoresNaipe.get("AFE").get(4);
		assertNotEquals(carta1.getNumero().getNumeroCarta(), carta2.getNumero().getNumeroCarta());
		assertNotEquals(carta2.getNumero().getNumeroCarta(), carta3.getNumero().getNumeroCarta());
		assertNotEquals(carta3.getNumero().getNumeroCarta(), carta4.getNumero().getNumeroCarta());
		assertNotEquals(carta4.getNumero().getNumeroCarta(), carta5.getNumero().getNumeroCarta());
	}
}
