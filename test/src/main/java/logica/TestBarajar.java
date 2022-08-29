package logica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.cmc.evaluacion.entidades.Carta;
import com.cmc.evaluacion.entidades.Naipe;

public class TestBarajar {

	@Test
	public void getSizeNaipeTest() {
		Naipe naipe = new Naipe();
		int actualSize = naipe.barajar().size();
		assertEquals(52, actualSize);
	}

	@Test
	public void getValidarPrimeraCartaTest() {
		Naipe naipe = new Naipe();
		boolean esAs = false;
		List<Carta> naipeNuevo = naipe.barajar();
		if (naipeNuevo.get(0).getNumero().getNumeroCarta().equals("A")) {
			esAs = true;
		}
		assertFalse(esAs);
	}
	
	@Test
	public void getValidarSegundaCartaTest() {
		Naipe naipe = new Naipe();
		boolean esAs = false;
		List<Carta> naipeNuevo = naipe.barajar();
		if (naipeNuevo.get(0).getNumero().getNumeroCarta().equals("2")) {
			esAs = true;
		}
		assertFalse(esAs);
	}

	@Test
	public void getValidarTerceraCartaTest() {
		Naipe naipe = new Naipe();
		boolean esAs = false;
		List<Carta> naipeNuevo = naipe.barajar();
		if (naipeNuevo.get(0).getNumero().getNumeroCarta().equals("2")) {
			esAs = true;
		}
		assertFalse(esAs);
	}
	
	@Test
	public void validarTodasBarajadasTest() {
		Naipe naipe = new Naipe();
		boolean barajado = false;
		naipe.barajar();
		for (Carta carta: naipe.getCartas()) {
			if (!carta.getBarajado().equals("N")) {
				barajado= true;
			}
		}
		assertTrue(barajado);
	}
}
