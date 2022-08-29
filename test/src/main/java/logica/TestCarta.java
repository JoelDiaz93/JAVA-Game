package logica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cmc.evaluacion.entidades.Carta;
import com.cmc.evaluacion.entidades.Numero;
import com.cmc.evaluacion.entidades.Palos;

public class TestCarta {

	@Test
	public void validateToStringCNtest() {
		Carta carta = new Carta(new Numero("A", 1), Palos.CORAZON_NEGRO);
		String expected = "A-CN";
		assertEquals(expected, carta.toString());
	}
	
	@Test
	public void validateToStringDItest() {
		Carta carta = new Carta(new Numero("10", 10), Palos.DIAMANTE);
		String expected = "10-DI";
		assertEquals(expected, carta.toString());
	}
	
	
	@Test
	public void validateToStringCRtest() {
		Carta carta = new Carta(new Numero("J", 11), Palos.CORAZON_ROJO);
		String expected = "J-CR";
		assertEquals(expected, carta.toString());
	}
	
	@Test
	public void validateToStringTRtest() {
		Carta carta = new Carta(new Numero("8", 8), Palos.TREBOL);
		String expected = "8-TR";
		assertEquals(expected, carta.toString());
	}

}
