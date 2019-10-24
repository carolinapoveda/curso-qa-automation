package herencia_ejercicio;

public class Administrador {

    protected String nombre;
    protected String apellidos;
    protected String identificacion;
    protected String celular;
    protected String domicilio;
    protected String profesion;
    protected int aniosExperiencia;
    protected String conocimientos;

    public Administrador (){

    }

    public Administrador(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Administrador(String nombre, String apellidos, String identificacion, String celular, String domicilio, String profesion, int aniosExperiencia, String conocimientos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.celular = celular;
        this.domicilio = domicilio;
        this.profesion = profesion;
        this.aniosExperiencia = aniosExperiencia;
        this.conocimientos = conocimientos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
}
