public class Circulo_LPR extends FiguraGeometrica_LPR {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_LPR(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
		}
	
	public double Radiopos(double r) {
		if (r<0);
		return -r;
	}
	

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}
}