package herencia_ejercicio;

    public class Chef extends Administrador{

        private String especialidad;

        public Chef (String nombre, String apellidos){
            super(nombre,apellidos);
            this.especialidad= null;
        }

        public String getEspecialidad() {
            return especialidad;
        }
    }
