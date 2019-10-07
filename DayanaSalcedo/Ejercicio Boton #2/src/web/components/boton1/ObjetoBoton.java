package web.components.boton1;

public class ObjetoBoton {

    public static void main(String[] args) {

        BotonOld objetoboton = new BotonOld();

        //Darle nombre al botón
        objetoboton.setNombre("Twitter");

        //Establecer el color
        objetoboton.setColor("azul cielo");

        //Establecer el icono
        objetoboton.setIcono("un pajarito");

        //Imprimir el botón
        System.out.println("El icono es " + objetoboton.getIcono() + ", el color es "+ objetoboton.getColor() + " y el nombre es "+ objetoboton.getNombre());
    }
}
