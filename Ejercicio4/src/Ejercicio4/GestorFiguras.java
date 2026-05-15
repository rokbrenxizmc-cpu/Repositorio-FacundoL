package Ejercicio4;

public class GestorFiguras {

	public static void main(String[] args) {
		Triangulo triangulo1 = new Triangulo("Naranja", 23.5, 45.0, 25.5, 27.5, 25.5, 26.23, 26.23);
		Circulo circulo1 = new Circulo("Rojo", 50.0, 80.5, 25.0, 50.0, 94.5);
		
		System.out.println("---------- TRIANGULO ----------");
		System.out.println("Color: " + triangulo1.getColor());
		System.out.println("Area: " + triangulo1.getArea());
		System.out.println("Perímetro: " + triangulo1.getPerimetro());
		System.out.println("Base: " + triangulo1.getBase());
		System.out.println("Altura: " + triangulo1.getAltura());
		System.out.println("Lado 1: " + triangulo1.getLado1());
		System.out.println("Lado 2: " + triangulo1.getLado2());
		System.out.println("Lado 3: " + triangulo1.getLado3());
		
		System.out.println("\n--------- CIRCULO ----------");
		System.out.println("Color: " + circulo1.getColor());
		System.out.println("Area: " + circulo1.getArea());
		System.out.println("Perimetro: " + circulo1.getPerimetro());
		System.out.println("Radio: " + circulo1.getRadio());
		System.out.println("Diametro: " + circulo1.getDiametro());
		System.out.println("Circunferencia: " + circulo1.getCircunferencia());

	}

}
