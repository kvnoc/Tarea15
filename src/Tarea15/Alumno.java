package Tarea15;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Alumno extends Persona {

    private int codigo;

    public Alumno(String nombres, String apellidos, int dni, String fechaNacimiento, int codigo) {
        super(nombres, apellidos, dni, fechaNacimiento);
        this.codigo = codigo;
    }


    public int getCodigo() {
        return codigo;
    }

    @Override
    public long calcularEdad() {

        LocalDate fHoy= LocalDate.now();
        LocalDate cumple= LocalDate.of(2000, Month.SEPTEMBER, 17);
        long edad = ChronoUnit.YEARS.between(cumple, fHoy);
        System.out.println("Edad actual "+edad+" años");
        return edad;
    }
}
