package Ejercicio_1;

public class Libro {
	private String nombre;
    private String autor;
    private int año;

    public Libro(String nombre, String autor, int año) {
        this.nombre = nombre;
        this.autor = autor;
        this.año = año;
    }

    public void mostrar() {
        System.out.println("Libro: " + nombre + " | Autor: " + autor + " | Año: " + año);
    }

    public String getNombre() { 
    	return nombre; 
    }
}
