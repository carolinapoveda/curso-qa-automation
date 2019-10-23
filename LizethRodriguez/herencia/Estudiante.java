package herencia;

public class Estudiante extends Persona {

    private int materias;
    private Double calificaciones;
    private String semestre;

    public Estudiante(String nombre, String apellido){
        super(nombre,apellido);
        this.materias = 6;
        this.calificaciones = 3.0;
        this.semestre = "sexto";
    }

    public int getMaterias() {
        return materias;
    }

    public Double getCalificaciones() {
        return calificaciones;
    }

    public String getSemestre() {
        return semestre;
    }
}
