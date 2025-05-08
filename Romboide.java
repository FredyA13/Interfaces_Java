
public class Romboide implements FiguraGeometrica {
	
	private String nombre;
	private double base;
	private double altura;
	
	public Romboide(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}//constructor
	
	public double calcularArea() {
		return getBase()*getAltura();
	}// calcularArea

	public double calcularPerimetro() {
		return (2*getBase())+(2*getAltura());
	}//calcularPerimetro

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public double getBase() {
		return base;
	}//getBase

	public void setBase(double base) {
		this.base = base;
	}//setBase

	public double getAltura() {
		return altura;
	}//getAltura

	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura

	@Override
	public String toString() {
		return "Romboide [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
	}//toString
	
}//class Romboide
