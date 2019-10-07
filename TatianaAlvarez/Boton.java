package Web.Components;

import java.sql.SQLOutput;

public class Boton {
    private String name;
    private String color;
    private String logo;
    private String url;
    private boolean new_window;
    private int cant;
    cant = 0;
   //Declarar constructor

    public static void main(String[] args) {

        Boton button = new Boton();
        button.setColor("Rojo");
        button.setName("Instagram");
        button.setUrl("instagram.com");
        System.out.println(button.color);
        System.out.println(button.name);
        System.out.println(button.url);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setNew_window(boolean new_window) {
        this.new_window = new_window;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getLogo() {
        return logo;
    }

    public String getUrl() {
        return url;
    }

    public boolean isNew_window() {
        return new_window;
    }
}
