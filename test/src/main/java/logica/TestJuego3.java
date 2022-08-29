package logica;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.cmc.evaluacion.entidades.Carta;
import com.cmc.evaluacion.servicios.Juego;

public class TestJuego3 {

	@Test
	public void test() {
		String[] jugadores = { "AFE", "SMO", "PGA", "EFE" };
		Juego juego = new Juego(jugadores);
		juego.entregarCartas(3);
		List<Carta> cartas = juego.getCartasJugador().get("AFE");
		int total = juego.devolverTotal("AFE");
		int totalEsperado = 0;
		for (Carta carta : cartas) {
			totalEsperado = totalEsperado + carta.getNumero().getValor();
		}

		assertEquals(total, totalEsperado);
	}

	@Test
	public void test2() {
		String[] jugadores = { "AFE", "SMO", "PGA", "EFE" };
		Juego juego = new Juego(jugadores);
		juego.entregarCartas(3);
		List<Carta> cartas = juego.getCartasJugador().get("SMO");
		int total = juego.devolverTotal("SMO");
		int totalEsperado = 0;
		for (Carta carta : cartas) {
			totalEsperado = totalEsperado + carta.getNumero().getValor();
		}

		assertEquals(total, totalEsperado);
	}

	@Test
	public void test3() {
		String[] jugadores = { "AFE", "SMO", "PGA", "EFE" };
		Juego juego = new Juego(jugadores);
		juego.entregarCartas(3);
		List<Carta> cartas = juego.getCartasJugador().get("PGA");
		int total = juego.devolverTotal("PGA");
		int totalEsperado = 0;
		for (Carta carta : cartas) {
			totalEsperado = totalEsperado + carta.getNumero().getValor();
		}

		assertEquals(total, totalEsperado);
	}

	@Test
	public void test4() {
		String[] jugadores = { "AFE", "SMO", "PGA", "EFE" };
		Juego juego = new Juego(jugadores);
		juego.entregarCartas(3);
		List<Carta> cartas = juego.getCartasJugador().get("EFE");
		int total = juego.devolverTotal("EFE");
		int totalEsperado = 0;
		for (Carta carta : cartas) {
			totalEsperado = totalEsperado + carta.getNumero().getValor();
		}

		assertEquals(total, totalEsperado);
	}
}
