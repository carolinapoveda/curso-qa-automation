package herencia_ejercicio;

public class Mesero extends Administrador{

    public Mesero (String nombre, String apellidos, String identificacion, String celular, String domicilio, String profesion, int aniosExperiencia, String conocimientos){

        super(nombre, apellidos,identificacion, celular, domicilio, profesion, aniosExperiencia, conocimientos);
    }

    private static void main(String [] args) {

        Mesero Pilar= new Mesero("Pilar","Gomez", "52869926", "3134897904", "Cra 10A", "Administrador", 1, "protocolo" );
        Chef Andres=new Chef("Andres", "Sanchez");

        System.out.println(Pilar.getApellidos());

        System.out.println(Andres.getNombre());
        System.out.println(Andres.getApellidos());
        System.out.println(Andres.getEspecialidad());
    }

}

