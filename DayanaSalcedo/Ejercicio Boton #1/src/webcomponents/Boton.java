package webcomponents;

public class Boton {

    //Características del botón
    String nombre;
    String color;
    String icono;

    //Obtener nombre al botón
    public String getNombre(){
        return nombre;
    }

    //Dar nombre al botón
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    //Obtener color del botón
    public String getColor(){
        return color;
    }

    //Dar color al botón
    public void setColor(String nuevoColor){
        color = nuevoColor;
    }

    //Obtener el icono del botón
    public String getIcono(){
        return icono;
    }

    //Dar el icono al botón
    public void setIcono(String nuevoIcono){
        icono = nuevoIcono;
    }
}
