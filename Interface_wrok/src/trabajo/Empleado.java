package trabajo;

public class Empleado extends Persona {

    public Empleado(int idTrabajador) {
      	super(idTrabajador);
    }

    @Override
    public void enviarMail() {
        System.out.println("Mail del Empleado enviado al encargado...");
    }
}