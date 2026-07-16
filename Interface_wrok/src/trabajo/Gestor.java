package trabajo;
import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dueño Dueñito = new Dueño(1);
		Encargado Encargadito = new Encargado(2);
		Empleado Empleadito = new Empleado(3);
		int rol = 0;
		int rol2 = 0;
		do {
		System.out.println("-----GESTOR CORREO-----"
				+ "\nA quien le enviará el mail?"
				+ "\n1) Dueño"
				+ "\n2) Encargado"
				+ "\n3) Empleado"
				+ "\n4) Salir"
				+ "\nElija una opción: ");
		
		rol = sc.nextInt();
		if (rol == 1) {
			System.out.println("A quien le va a enviar el mail?"
					+ "\n1) Encargado"
					+ "\n2) Volver");
			rol2 = sc.nextInt();
			if (rol2 == 1) {
				Encargadito.enviarMail();
			}
		
	}else if (rol == 2) {
		System.out.println("A quien le va a enviar el mail?"
				+ "\n1) Dueño"
				+ "\n2) Empleado"
				+ "\n3) Volver");
		rol2 = sc.nextInt();
		if (rol2 == 1) {
			Dueñito.enviarMail();
		}else if (rol2 == 2) {
			Empleadito.enviarMail();
		}
	}else if (rol == 3) {
		System.out.println("A quien le va a enviar el mail?"
				+ "\n1) Encargado"
				+ "\n2) Volver");
		rol2 = sc.nextInt();
		if (rol2 == 1) {
			Encargadito.enviarMail();
		}
	}

		}while(rol != 4);
		System.out.println("Saliendo...");
}
}