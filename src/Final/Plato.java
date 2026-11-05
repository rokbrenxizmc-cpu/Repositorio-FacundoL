package Final;

public class Plato {

    //Atributos de la clase

    int codigo;

    String nombre;

    String vegetariano;


    //Constructor

    public Plato(int codigo, String nombre, String vegetariano) {

        super();

        this.codigo = codigo;

        this.nombre = nombre;

        this.vegetariano = vegetariano;

    }


    //Getters y setters

    public int getCodigo() {

        return codigo;

    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getVegetariano() {

        return vegetariano;

    }

    public void setVegetariano(String vegetariano) {

        this.vegetariano = vegetariano;

    }

}