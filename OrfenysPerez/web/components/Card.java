package web.components;

public class Card {

    public static void main(String[] args) {

        Boton boton = new Boton("instagram", "instagram.com");
        boton.setColor("rojo");

        System.out.println("Primer boton:");
        System.out.println(boton.getColor());
        System.out.println(boton.getName());
        System.out.println(boton.getUrl());
        System.out.println(boton.getLogo());

        Boton boton1 = new Boton("facebook", "facebook.com");

        System.out.println("Segundo boton:");
        System.out.println(boton1.getColor());
        System.out.println(boton1.getName());
        System.out.println(boton1.getUrl());
        System.out.println(boton1.getLogo());

        Boton boton2 = new Boton("Twitter", "https://twitter.com/?lang=es");

        System.out.println("Tercer boton:");
        System.out.println(boton2.getName());
        System.out.println(boton2.getColor());
        System.out.println(boton2.getUrl());
        System.out.println(boton2.getLogo());

        Boton boton3 = new Boton("YouTube", "youtube.com");

        System.out.println("Cuarto boton:");
        System.out.println(boton3.getName());
        System.out.println(boton.getColor());
        System.out.println(boton3.getUrl());
        System.out.println(boton3.getLogo());

        Boton boton4 = new Boton("Snapchat", "snapchat.com");
        boton4.setColor("amarillo");
        boton4.setLogo("https://es.vexels.com/png-svg/vista-previa/137411/icono-de-snapchat-logo");

        System.out.println("Quinto boton:");
        System.out.println(boton4.getName());
        System.out.println(boton4.getColor());
        System.out.println(boton4.getUrl());
        System.out.println(boton4.getLogo());

        Boton boton5 = new Boton("Whatsapp", "whatsapp.com");
        boton4.setColor("verde");
        boton4.setLogo("https://imagenpng.com/logo-whatsapp-png/");

        System.out.println("Quinto boton:");
        System.out.println(boton5.getName());
        System.out.println(boton5.getColor());
        System.out.println(boton5.getUrl());
        System.out.println(boton5.getLogo());


    }
}
