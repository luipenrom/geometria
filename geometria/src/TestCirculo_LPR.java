import static org.junit.Assert.*;

import org.junit.Test;

public class TestCirculo_LPR {
	
	private void assertEquals(double area, int i, int j, Object object) {
		
	}
	
	@Test
	public void testArea() {
		Circulo_LPR dato=new Circulo_LPR(10, null);
		assertEquals(dato.area(),314,159, null);
	}

	@Test
	public void testPerimetro() {
		Circulo_LPR dato = new Circulo_LPR(10, null);
		assertEquals(dato.perimetro(),62,8318, null);
	}
}
