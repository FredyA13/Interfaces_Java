public class Triangulo implements FiguraGeometrica {

	private String nombre; // Nombre del triangulo
	private double base;
	private double altura;
	private double lado;

	public Triangulo (String nombre, double base, double altura, double lado) {
		super();// De la clase objeto
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}// constructor

	public double calcularArea() {
		return (getBase() * getAltura() / 2);
	}// calcularArea

	public double calcularPerimetro() {
		return getLado() * 3;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Triangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}// toString

}// clase Triangulo
