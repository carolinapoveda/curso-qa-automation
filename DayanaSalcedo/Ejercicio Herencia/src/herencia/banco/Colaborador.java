package herencia.banco;

public class Colaborador {

    protected String nombre;
    protected int cedula;
    protected int edad;


    public Colaborador(String nombre, int cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }


}
