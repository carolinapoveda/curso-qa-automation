package web.components;

public class Button {

    private String name;
    private String color;
    private String logo;
    private String url;
    private boolean new_window;


    public Button() {
    }

    //Declarate a contructor
    public Button(String name1, String url1){
        name = name1;
        url = url1;
        color = "blue";
        logo = "http://lees.fe.uni-lj.si/uploads/default-logo.png";
        new_window = true;
    }

    public Button(String url1){
        name = "Name by default";
        url = url1;
        color = "blue";
        logo = "http://lees.fe.uni-lj.si/uploads/default-logo.png";
        new_window = true;
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

    public static void main(String[] args) {
        Button boton = new Button();
        boton.setColor("red");
        boton.setName("Instagram");
        boton.setUrl("instagram.com");

        Button boton1 = new Button("Facebook","facebook.com");

        System.out.println("Primer boton");
        System.out.println(boton.color);
        System.out.println(boton.name);
        System.out.println(boton.url);

        System.out.println("Segundo boton");
        System.out.println(boton1.color);
        System.out.println(boton1.name);
        System.out.println(boton1.url);


    }






}
