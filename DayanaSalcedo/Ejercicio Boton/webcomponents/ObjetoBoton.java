package webcomponents;
import java.util.Scanner;

public class ObjetoBoton {

    //Declarar y crear el objeto
    Boton objetoboton = new Boton();

    public static void main(String[] args) {

        //Darle nombre al botón
        System.out.println("Por favor ingrese un nombre: ");
        Scanner scanner = new Scanner(System.in);
        String nuevoNombre = new String();

        //double num = scanner1.nextDouble();

        //Establecer el color
        System.out.println("Por favor ingrese un color: ");
        Scanner scanner1 = new Scanner(System.in);
        String nuevoColor = new String();

        //Establecer el icono
        System.out.println("Por favor ingrese un icono: ");
        Scanner icono = new Scanner(System.in);
        String nuevoIcono = new String();

        //Imprimir el botón
        System.out.println("El icono es:" + nuevoIcono + "el color es"+ nuevoColor + "y el nombre es:"+ nuevoNombre);
    }

}
