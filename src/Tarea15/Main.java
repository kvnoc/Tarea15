package Tarea15;

public class Main {

    public static void main(String[] args){

        AlumnoController alumnoCo = new AlumnoController(1);

        alumnoCo.create("Emilio", "Ramos", 72199558,"15/09/2000", 20220225);
        System.out.println("******Alumno******");

        for (Alumno d: alumnoCo.listar()) {

            System.out.println("Nombres: "+d.getNombres()+" "+d.getApellidos());
            System.out.println("Dni: "+d.getDni());
            System.out.println("Fecha de Nacimiento: "+d.getFechaNacimiento());
            System.out.println("Codigo: "+d.getCodigo());
            d.calcularEdad();
            System.out.println();
        }

        DocenteController docenteCo = new DocenteController(2);

        docenteCo.agregar("Julio","Gomez",7214577, "17/03/1965","Doctor","Ingeniero");
        docenteCo.agregar("Jaime","Lopez",8574521, "20/05/1958","Magister","Ingeniero");
        System.out.println("******Docentes******");
        for (Docente d: docenteCo.mostrar()) {

            System.out.println("Nombres: "+d.getNombres()+" "+d.getApellidos());
            System.out.println("Dni: "+d.getDni());
            System.out.println("Fecha de Nacimiento: "+d.getFechaNacimiento());
            System.out.println("Grado: "+d.getGrado());
            System.out.println("Titulo: "+d.getTitulo());
            d.calcularEdad();
            System.out.println();
        }
    }
}
