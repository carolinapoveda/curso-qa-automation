

public class Colaborador {

    protected String nombre;
    protected String apellidos;
    protected String edad;
    protected String identificacion;
    protected String celular;
    protected String domicilio;
    protected String profesion;
    protected int aniosExperiencia;
    protected String conocimientos;
    protected int bytes;

    public Colaborador(String nombre, String apellidos, String edad, String identificacion, String celular, String domicilio, String profesion, int aniosExperiencia, String conocimientos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.identificacion = identificacion;
        this.celular = celular;
        this.domicilio = domicilio;
        this.profesion = profesion;
        this.aniosExperiencia = aniosExperiencia;
        this.conocimientos = conocimientos;
        this.bytes=0;
    }

    public Colaborador() {
    }

    public Colaborador(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getBytes() {
        return bytes;
    }
}
