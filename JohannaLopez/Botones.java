package web.components;

public class Botones {

    private String nombre;
    private String logo;
    private String color;

    public Botones (String nombreBoton){

        nombre = nombreBoton; // establece el nombre del botón
    }

    //Método para obtener el nombre del botón
    public String getNombre (){
        return nombre;
    }

    //Método para establecer logo
    public void setLogo (String nombreLogo){
        logo = nombreLogo;
    }
    //Método para obtener logo
    public String getLogo (){
        return logo;
    }

    //Método para establecer Color
    public void setColor (String nombreColor){
        color = nombreColor;
    }
    //Método para obtener Color
    public String getColor (){
        return color;
    }
}


