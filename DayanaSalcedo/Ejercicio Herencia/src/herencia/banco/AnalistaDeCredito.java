package herencia.banco;

public class AnalistaDeCredito extends Colaborador {

    protected int clientes;

    public int clientes() {
        return clientes;
    }


    public AnalistaDeCredito(String nombre, int cedula, int edad) {
        super(nombre, cedula, edad);
        this.clientes = 15;
    }

    public static void main(String[] args) {

        AnalistaDeCredito patricia = new AnalistaDeCredito("Patricia Quintero", 5345435, 35);
        System.out.println(patricia.getNombre());
        System.out.println(patricia.getCedula());
        System.out.println(patricia.getEdad());
        System.out.println(patricia.clientes());

    }

}
