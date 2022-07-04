package Tarea15;

public interface Crud {

    public void create(String nombres, String apellidos, int dni, String fechaNacimiento, int codigo);

    public Alumno[] listar();

    public int update(int dni);

    public int delete(int dni);
}
