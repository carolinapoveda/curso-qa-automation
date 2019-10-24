package herencia;

public class BicicletaNormal extends Bicicleta {

    public BicicletaNormal(String modelo, String color, int potencia){
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(
                "Bicicleta de modelo: "+modelo+" de color: "+color+" de potencia: "+potencia);
    }
}
