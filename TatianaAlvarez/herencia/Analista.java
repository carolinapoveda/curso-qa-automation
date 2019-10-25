public class Analista extends Colaborador {

    public Analista(String nombre, String apellidos, String edad, String identificacion, String celular, String domicilio, String profesion, int aniosExperiencia, String conocimientos)
    {

        super(nombre, apellidos, edad, identificacion, celular, domicilio, profesion, aniosExperiencia, conocimientos);
    }

    public static void main(String[] args) {

        Analista dayana = new Analista ("Dayana", "Salcedo","15", "10160165858", "3152145263","cr 14 98 54","Ing Alimentos",5,"SQL");
        Comercial carlos = new Comercial("Carlos","Vargas");
        System.out.println(dayana.getNombre());
        System.out.println(dayana.getBytes());
        System.out.println(carlos.getApellidos());
        System.out.println(carlos.getClientes());
        System.out.println(carlos.getVentas());


    }
}
