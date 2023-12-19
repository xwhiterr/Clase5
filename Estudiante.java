// Practica 05 Ejercicio 1 Estudiante
// @author Walter Aquino
// Clase asincrónica
public class Estudiante extends Persona {

    private int creditos;

    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
        this.creditos = 60;
    }

    public int getCredtios() {
        return this.creditos;
    }
// Instancias
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Estudiante matriculado de "+creditos+" créditos" );
    }
}