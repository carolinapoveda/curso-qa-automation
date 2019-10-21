package herencia;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected String edad;
    protected String identificacion;
    protected String ceular;
    protected String direccion;
    protected String profesion;
    protected String horario;


    public Persona (){

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, String edad, String identificacion, String ceular, String direccion, String profesion, String horario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.identificacion = identificacion;
        this.ceular = ceular;
        this.direccion = direccion;
        this.profesion = profesion;
        this.horario = horario;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getHorario() {
        return horario;
    }
}
