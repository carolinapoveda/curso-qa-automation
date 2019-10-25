package web.components;
import web.components.Button;

public class Card {

    public static void main(String[] args) {

        Button boton = new Button();
        boton.setColor("red");
        boton.setName("Instagram");
        boton.setUrl("instagram.com");

        Button boton1 = new Button("Facebook","facebook.com");

        System.out.println("Primer boton");
        System.out.println(boton.getColor());
        System.out.println(boton.getName());
        System.out.println(boton.getUrl());

        System.out.println("Segundo boton");
        System.out.println(boton1.getColor());
        System.out.println(boton1.getName());
        System.out.println(boton1.getUrl());

    }
}
