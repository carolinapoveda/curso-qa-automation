package herencia;

public class FabricaBicicletaNormal implements FabricaBicicleta {

    @Override
    public Bicicleta creaBicicleta(String modelo, String color, int potencia) {
        return new BicicletaNormal(modelo, color, potencia);
    }

}
