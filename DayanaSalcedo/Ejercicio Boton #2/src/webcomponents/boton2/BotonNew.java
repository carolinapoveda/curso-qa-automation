package webcomponents.boton2;

public class BotonNew {

    private String name;
    private String color;
    private String logo;
    private String url;
    private boolean new_window;

    //Declarar el constructor
    public BotonNew(){
        name = "name1";
        url = "url1";
        color = "blue";
        logo = "https://s1.logaster.com/static/v3/img/products/logo.png";
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

}
