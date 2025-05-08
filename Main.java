
public class Main {

	public static void main(String[] args) {
		
		//Triangulo
		Triangulo t = new Triangulo("Tríangulo T", 200, 100,150);
		Main.imprimirCalculos(t);//Usamos la clase Main para imprimir el metodo
		
		//Cuadrado
		Cuadrado cuadrado = new Cuadrado("Cudradote", 4);
		Main.imprimirCalculos(cuadrado);
		
		//Rectangulo
		Rectangulo rectangulo = new Rectangulo("Rectangulo 1", 5,8);
		Main.imprimirCalculos(rectangulo);
		
		//Rombo
		Rombo rombo = new Rombo("Rombo 1",8,10,5);
		Main.imprimirCalculos(rombo);
		
		//Romboide
		Romboide romboide = new Romboide("Romboide 1", 10,5);
		Main.imprimirCalculos(romboide);
		
		//Trapecio
		Trapecio trapecio = new Trapecio("Trapecio 1",5,10,5,10,10,5,3);
		Main.imprimirCalculos(trapecio);
		
	}// main
	
	//Crear las clases de todas las figuras
	//Interface FiguraGeometria
	//Implementar la interface en todas las figuras
	public static void imprimirCalculos(FiguraGeometrica f) {
		System.out.println(f);
		System.out.println("+------------------------------------------------------+");
		System.out.println("| El área de [ " + f.getNombre() + " ]");
		System.out.println("| es: " + f.calcularArea());
		System.out.println("| El perímetro de [ " + f.getNombre() + " ]");
		System.out.println("| es: " + f.calcularPerimetro());
		System.out.println("+------------------------------------------------------+");
	}

}// class Main
