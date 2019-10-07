package webcomponents.boton2;

public class Card extends BotonNew{

    public static void main(String[] args) {
        BotonNew button = new BotonNew("instagram", "www.instagram.com");
        button.setColor("blue");
        button.setName();
        button.setUrl();

        System.out.println("Primer boton");
        System.out.println(button.getColor());
        System.out.println(button.getName());
        System.out.println(button.getUrl());
    }
}
