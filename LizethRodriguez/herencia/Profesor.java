package herencia;

public class Profesor extends Persona{

    public Profesor(String nombre, String apellido, String edad, String identificacion, String ceular, String direccion, String profesion, String horario){

        super(nombre, apellido, edad, identificacion, ceular, direccion, profesion, horario);
    }

    public static void main(String[] args) {

        Profesor Alejandro = new Profesor("Alejandro","Perez","35","58236598","3204568963","Calle 50 nro 20 10", "Licenciado en Ciencias Basicas","nocturno");
        Estudiante Andrea = new Estudiante("Andrea","Gonzalez");


        System.out.println(Alejandro.getApellido());
        System.out.println(Alejandro.getHorario());

        System.out.println(Andrea.getNombre());
        System.out.println(Andrea.getApellido());
        System.out.println(Andrea.getMaterias());
        System.out.println(Andrea.getCalificaciones());
        System.out.println(Andrea.getSemestre());

    }
}
