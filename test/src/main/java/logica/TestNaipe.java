package logica;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.cmc.evaluacion.entidades.Carta;
import com.cmc.evaluacion.entidades.Naipe;
import com.cmc.evaluacion.entidades.Numero;
import com.cmc.evaluacion.entidades.Palos;

public class TestNaipe {

	@Test
	public void validateSizaTest() {
		Naipe naipe = new Naipe();
		int actualSize = naipe.getCartas().size();
		assertEquals(52, actualSize);
	}

	@Test
	public void getCartaCorazonNegroTest() {
		Naipe naipe = new Naipe();
		List<Carta> cartas = naipe.getCartas();
		Carta cartaBusqueda = new Carta(new Numero("A", 10), Palos.CORAZON_NEGRO);
		for (Carta carta : cartas) {
			if (validarExistenciaCarta(carta, cartaBusqueda)) {

			}
		}
	}
	
	@Test
	public void getCartaDiamanteTest() {
		Naipe naipe = new Naipe();
		List<Carta> cartas = naipe.getCartas();
		Carta cartaBusqueda = new Carta(new Numero("A", 10), Palos.DIAMANTE);
		for (Carta carta : cartas) {
			if (validarExistenciaCarta(carta, cartaBusqueda)) {

			}
		}
	}
	
	@Test
	public void getCartaTrebolTest() {
		Naipe naipe = new Naipe();
		List<Carta> cartas = naipe.getCartas();
		Carta cartaBusqueda = new Carta(new Numero("K", 10), Palos.TREBOL);
		for (Carta carta : cartas) {
			if (validarExistenciaCarta(carta, cartaBusqueda)) {

			}
		}
	}

	private boolean validarExistenciaCarta(Carta carta, Carta cartaBusqueda) {
		boolean existe = false;
		if (cartaBusqueda.getPalo().equals(carta.getPalo())
				&& cartaBusqueda.getNumero().getNumeroCarta().equals(carta.getNumero().getNumeroCarta())) {
			existe = true;
		}
		return existe;
	}
}
