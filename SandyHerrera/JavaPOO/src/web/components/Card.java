package web.components;
import web.components.Button;

public class Card {
    public static void main(String[] args) {
        Button button = new Button();
        button.setColor("rojo");
        button.setName("Instagram");
        button.setUrl("instagram.com");

        Button button1 = new Button("Facebook","facebook.com");

        System.out.println("Primer botón");
        System.out.println(button.getColor());
        System.out.println(button.getName());
        System.out.println(button.getUrl());

        System.out.println("Segundo botón");
        System.out.println(button1.getColor());
        System.out.println(button1.getName());
        System.out.println(button1.getUrl());
    }
}
