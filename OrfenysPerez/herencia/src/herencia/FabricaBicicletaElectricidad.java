package herencia;

public class FabricaBicicletaElectricidad implements FabricaBicicleta {

    @Override
    public Bicicleta creaBicicleta(String modelo, String color, int potencia) {
        return new BicicletaElectricidad(modelo, color, potencia);
    }


}
