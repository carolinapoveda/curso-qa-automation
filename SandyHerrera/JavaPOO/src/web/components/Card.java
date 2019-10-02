package web.components;
import web.components.Button;

import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        /*Button button = new Button();
        button.setColor("rojo");
        button.setName("Instagram");
        button.setLogo("instagram.com");
        Button button1 = new Button();
        System.out.println("Primer botón");
        System.out.println(button.getColor());
        System.out.println(button.getName());
        System.out.println(button.getUrl());
        System.out.println("Segundo botón");
        System.out.println(button1.getColor());
        System.out.println(button1.getName());
        System.out.println(button1.getUrl());*/

        Button button = new Button();

        int cantidadBoton;
        String nombreBoton = null;
        String nombreColor = null;
        String nombreUrl = null;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de botones a crear: ");
        cantidadBoton = leer.nextInt();

        for(int i = 1;i<=cantidadBoton;i++){
            System.out.printf("Ingrese el nombre del botón %d \n",i);
            nombreBoton = leer.next();
            System.out.printf("Ingrese el color del botón %d \n",i);
            nombreColor = leer.next();
            System.out.printf("Ingrese la url del botón %d \n",i);
            nombreUrl = leer.next();
        }

        for(int i = 1;i<=cantidadBoton;i++){
            System.out.printf("***botón creado %d ******\n",i);
            button.setName(nombreBoton);
            button.setColor(nombreColor);
            button.setUrl(nombreUrl);
            button.setLogo("http://lees.fe.uni-lj.si/uploads/default-logo.png");

            System.out.println("El nombre del botón es: "+ button.getName());
            System.out.println("El color del botón es: "+button.getColor());
            System.out.println("La url del botón es: "+button.getUrl());
            System.out.println("El logo del botón es: "+button.getLogo());
        }
    }
}
