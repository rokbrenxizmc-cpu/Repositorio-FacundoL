package trabajo;

public class Encargado extends Persona{
	
	public Encargado(int idTrabajador) {
		super(idTrabajador);
	}

	@Override
	public void enviarMail() {
		System.out.println("Mail del Encargado enviado con éxito...");
	}
}
