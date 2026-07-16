package trabajo;

public class Dueño extends Persona {

	public Dueño(int idTrabajador) {
		super(idTrabajador);
	}

	@Override
	public void enviarMail() {
		System.out.println("Mail del Dueño enviado al encargado...");
	}
}