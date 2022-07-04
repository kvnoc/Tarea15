package Tarea15;

public class AlumnoController implements Crud{

    private Alumno[] alumno;

    private int contador;

    public AlumnoController(int size) {
        this.alumno = new Alumno[size];
        this.contador = 0;
    }


    @Override
    public void create(String nombres, String apellidos, int dni, String fechaNacimiento, int codigo) {
        this.alumno[this.contador] = new Alumno(nombres, apellidos, dni, fechaNacimiento, codigo);
        this.contador++;

    }

    @Override
    public Alumno[] listar() {

        return this.alumno;
    }

    @Override
    public int update(int dni) {
        return 0;
    }

    @Override
    public int delete(int dni) {
        return 0;
    }
}
