package web.components;

import java.awt.*;
import javax.swing.*;

public class BotonesRedesSociales extends JFrame{
    private JButton boton1, boton2, boton3, boton4, boton5, boton6;
    private GridLayout cuadricula1, cuadricula2;
    private Container contenedor;
    // configurar GUI
    public BotonesRedesSociales()
    {
        super( "Redes sociales" );

        // establecer esquemas
        cuadricula1 = new GridLayout( 2, 3, 5, 5 );
        cuadricula2 = new GridLayout( 3, 2 );

        // obtener panel de contenido y establecer su esquema
        contenedor = getContentPane();
        contenedor.setLayout( cuadricula1 );

        // crear y agregar botones
        boton1 = new JButton("Facebook");
        boton2 = new JButton("Instagram");
        boton3 = new JButton("Linkedin");
        boton4 = new JButton("Youtube");
        boton5 = new JButton("Twitter");
        boton6 = new JButton("Snapchap");

        contenedor.add(boton1);
        contenedor.add(boton2);
        contenedor.add(boton3);
        contenedor.add(boton4);
        contenedor.add(boton5);
        contenedor.add(boton6);


        setSize( 300, 170 );
        setVisible( true );

    } // fin del constructor de BotonesRedesSociales

    public static void main( String args[] )
    {
        BotonesRedesSociales aplicacion = new BotonesRedesSociales();
        aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

}