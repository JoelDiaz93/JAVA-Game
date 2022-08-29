package logica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cmc.evaluacion.entidades.Random;

public class TestRandom {

	@Test
	public void getMaximaPositionTest() {
		int maximaPosicion =0;
		for(int i =0; i<=2000; i++) {
			int posicion = Random.obtenerPosicion();
			if (posicion==51) {
				maximaPosicion = posicion;
				break;
			}
		}
		assertEquals(51, maximaPosicion);
	}
	
	@Test
	public void getMinimumPositionTest() {
		int maximaPosicion =0;
		for(int i =0; i<=2000; i++) {
			int posicion = Random.obtenerPosicion();
			if (posicion==0) {
				maximaPosicion = posicion;
				break;
			}
		}
		assertEquals(0, maximaPosicion);
	}

	@Test
	public void getAleatorioPositionTest() {
		int maximaPosicion =0;
		for(int i =0; i<=2000; i++) {
			int posicion = Random.obtenerPosicion();
			if (posicion==31) {
				maximaPosicion = posicion;
				break;
			}
		}
		assertEquals(31, maximaPosicion);
	}
	
	@Test
	public void getOnePositionTest() {
		int maximaPosicion =0;
		for(int i =0; i<=2000; i++) {
			int posicion = Random.obtenerPosicion();
			if (posicion==1) {
				maximaPosicion = posicion;
				break;
			}
		}
		assertEquals(1, maximaPosicion);
	}
}
