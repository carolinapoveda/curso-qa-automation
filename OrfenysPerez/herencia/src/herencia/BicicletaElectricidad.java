package herencia;

public class BicicletaElectricidad extends Bicicleta {

    public BicicletaElectricidad(String modelo, String color, int potencia){
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(
                "Bicicleta electrica de modelo: "+modelo+" de color: "+color+" de potencia: "+potencia);
    }
}
