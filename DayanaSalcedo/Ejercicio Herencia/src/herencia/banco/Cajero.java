package herencia.banco;

public class Cajero extends Colaborador {

    public Cajero(String nombre, int cedula, int edad) {
        super(nombre, cedula, edad);
    }

    public static void main(String[] args) {

        Cajero jhon = new Cajero("Jhon Gomez", 54354354, 33);
        System.out.println(jhon.getNombre());
        System.out.println(jhon.getCedula());
        System.out.println(jhon.getEdad());
    }
}
