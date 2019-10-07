package web.components;

public class Card {
    public static void main(String[] args) {

        Botones boton1 = new Botones("Instagram", "Instagram.com");
        boton1.setColor("Cafe");

        System.out.println("Primer boton");
        System.out.println(boton1.getColor());
        System.out.println(boton1.getName());
        System.out.println(boton1.getUrl());

        Botones boton2 = new Botones("Facebook", "Facebook.com");

        System.out.println("Segundo boton");
        System.out.println(boton2.getColor());
        System.out.println(boton2.getName());
        System.out.println(boton2.getUrl());

        Botones boton3 = new Botones("Twitter", "Twitter.com");

        System.out.println("Tercer boton");
        System.out.println(boton3.getColor());
        System.out.println(boton3.getName());
        System.out.println(boton3.getUrl());

        Botones boton4 = new Botones("Youtube", "Youtube.com");

        System.out.println("Cuarto boton");
        System.out.println(boton4.getColor());
        System.out.println(boton4.getName());
        System.out.println(boton4.getUrl());

        Botones boton5 = new Botones("Whatsapp", "Whatsapp.com");

        System.out.println("Quinto boton");
        System.out.println(boton5.getColor());
        System.out.println(boton5.getName());
        System.out.println(boton5.getUrl());




    }
}
