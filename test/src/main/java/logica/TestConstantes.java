package logica;


import static org.junit.Assert.*;
import org.junit.Test;
import com.cmc.evaluacion.entidades.Palos;

public class TestConstantes {

	@Test
	public void getCorazonRojoTest() {
		String corazonRojo = Palos.CORAZON_ROJO;
		assertEquals("CR", corazonRojo);
	}

	@Test
	public void getCorazonNegroTest() {
		String corazonNegro = Palos.CORAZON_NEGRO;
		assertEquals("CN", corazonNegro);

	}

	@Test
	public void getDiamanteTest() {
		String diamante = Palos.DIAMANTE;
		assertEquals("DI", diamante);

	}

	@Test
	public void getTrebolTest() {
		String trebol = Palos.TREBOL;
		assertEquals("TR", trebol);
	}

}
