
public class Rombo implements FiguraGeometrica {
	
	private String nombre;
	private double lado;
	private double diagonalMayor;
	private double diagonalMenor;
	
	public Rombo(String nombre, double lado, double diagonalMayor, double diagonalMenor) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor = diagonalMenor;
	}
	
	public double calcularArea() {
		return (getDiagonalMayor()*getDiagonalMenor())/2;
	}// calcularArea

	public double calcularPerimetro() {
		return getLado()*4;
	}//calcularPerimetro

	public double getDiagonalMayor() {
		return diagonalMayor;
	}//getDiagonalMayor

	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}//setDiagonalMayor

	public double getDiagonalMenor() {
		return diagonalMenor;
	}//getDiagonalMenor

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}//setDiagonalMenor
	
	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	@Override
	public String toString() {
		return "Rombo [diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor + "]";
	}//toString
	
	
}//class Rombo
