package herencia;


public abstract class Bicicleta {


    protected String modelo;
    protected String color;
    protected int potencia;



    public Bicicleta(String modelo, String color, int potencia) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
    }


    public abstract void mostrarCaracteristicas();
}
