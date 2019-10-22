public class Comercial extends Colaborador{


    private float ventas;
    private int clientes;

    public Comercial(String nombre, String apellidos){
        super(nombre,apellidos);
        this.ventas=0;
        this.clientes=1;


    }

    public float getVentas() {
        return ventas;
    }

    public int getClientes() {
        return clientes;
    }
}
