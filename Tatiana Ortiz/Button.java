package web.components1;

public class Button{
    private String name;
    private String color;
    private String logo;
    private String url;


    public boolean isNew_window() {
        return new_window;
    }

    private boolean new_window;

    //Declara constructor con el mismo nombre de la clase
    public Button (String name1, String url1){
        name=name1;
        url=url1;
        color="blue";
        logo="https://norfipc.com/img/logos/logotipo-oficial-facebook-2014.png";
        new_window=true;
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

}
