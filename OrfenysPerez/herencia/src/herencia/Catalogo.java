package herencia;

import java.util.Scanner;

public class Catalogo {

    public static int nBici = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FabricaBicicleta fabrica;
        Bicicleta[] bicicleta = new Bicicleta[nBici];

        System.out.println("Desea utilizar: " + " bicicletas electricas (1) o normales (2):");
        String eleccion = scanner.next();

        if (eleccion.equals("1")) {
            fabrica = new FabricaBicicletaElectricidad();
        } else {
            fabrica = new FabricaBicicletaNormal();
        }

        for (int index = 0; index  < nBici; index ++)
            bicicleta [index] = fabrica.creaBicicleta("estandar", "amarillo", 6+index);

        for (Bicicleta bicicletas : bicicleta)
            bicicletas.mostrarCaracteristicas();
    }
}
