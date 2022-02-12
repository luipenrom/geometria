/**
 *
 * @author Luis Peñalver Romero
 * @version 1.2
 *
 */
public class Rectangulo_LPR extends FiguraGeometrica_LPR {
	private double l1;
	private double l2;
	
	/**
	 * 
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_LPR(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Calcula el área multiplicando lado 1 * lado2
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Calcula el perímetro, multiplicando cada lado * 2 y sumandolos
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
