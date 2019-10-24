package herencia.banco;

public class EjecutivoDeVentas extends Colaborador {

    protected int clientes;

    public int clientes() {
        return clientes;
    }


    public EjecutivoDeVentas(String nombre, int cedula, int edad) {
        super(nombre, cedula, edad);
        this.clientes = 30;
    }

    public static void main(String[] args) {

        EjecutivoDeVentas edgar = new EjecutivoDeVentas("Edgar Pimiento", 325345, 40);
        System.out.println(edgar.getNombre());
        System.out.println(edgar.getCedula());
        System.out.println(edgar.getEdad());
        System.out.println(edgar.clientes());
    }

}
