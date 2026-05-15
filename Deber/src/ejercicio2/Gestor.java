package ejercicio2;

public class Gestor {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Toyota", "Corolla", 180, 4, "Nafta");
		Moto moto1 = new Moto("Yamaha", "R6", 220, "600cc", "Si");
		
		System.out.println("------------ AUTO -----------");
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Modelo: " + auto1.getModelo());
		System.out.println("Velocidad máxima: " + auto1.getVelocidad());
		System.out.println("Cantidad de puertas: " + auto1.getCantidadPuertas());
		System.out.println("Tipo de combustible: " + auto1.getTipoCombustible());

		System.out.println("\n------------ MOTO ------------");
		System.out.println("Marca: " + moto1.getMarca());
		System.out.println("Modelo: " + moto1.getModelo());
		System.out.println("Velocidad máxima: " + moto1.getVelocidad());
		System.out.println("Cilindrada: " + moto1.getCilindrada());
		System.out.println("¿Tiene baulera?: " + moto1.getTieneBaulera());

	}

}
