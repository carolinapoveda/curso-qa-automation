package web.components;

public class Button {
    private String name;
    private String color;
    private String logo;
    private String url;
    private boolean new_window;


    public Button() {
    }

   /* //Declarar un constructor, sirve para inicializar un objeto
    public Button(String name1, String url1){ //Parametros obligatroios
        name = name1;
        url = url1;
        color = "blue";
        logo = "http://lees.fe.uni-lj.si/uploads/default-logo.png";
        new_window = true;
    }

    public Button(String url1){ //Parametros obligatroios
        name = "Name default";
        url = url1;
        color = "blue";
        logo = "http://lees.fe.uni-lj.si/uploads/default-logo.png";
        new_window = true;
    }*/

    public Button(String logo) {
        logo = "http://lees.fe.uni-lj.si/uploads/default-logo.png";
    }

    //Set ayuda acceder al atributo y definir un valor
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

    //Get ayuda acceder al atributo y obtener un valor
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
