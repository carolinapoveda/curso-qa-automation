package web.components;
import web.components.Botones;

public class Menu {

    public static void main(String[] args) {

        // Asigno nombre del botón "Facebook"
        Botones menu = new Botones("Facebook");
        System.out.println("Nombre Botón: " + menu.getNombre());

        // Asigno logo del botón
        menu.setLogo("Facebook");
        System.out.println("Logo Botón: " + menu.getLogo());

        // Asigno Color del botón
        menu.setColor("Azul");
        System.out.println("Color boton: " + menu.getColor());
    }

}
