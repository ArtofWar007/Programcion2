package Ejercicio_1;

public class Biblioteca {
	private String nombre;
    private int cantLibros;
    private Libro[] libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[100];
        this.cantLibros = 0;
    }

    public void agregarLibro(Libro l) {
        if (cantLibros < 100) {
            libros[cantLibros] = l;
            cantLibros++;
        }
    }
    
    public void buscarLibro(String nombreX) {
        boolean encontrado = false;
        for (int i = 0; i < cantLibros; i++) {
            if (libros[i].getNombre().equalsIgnoreCase(nombreX)) {
                libros[i].mostrar();
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("El libro '" + nombreX + "' no está.");
    }
    
    public static void mostrarMayor(Biblioteca b1, Biblioteca b2) {
        if (b1.getCantLibros() > b2.getCantLibros()) {
            System.out.println("La mayor es: " + b1.getNombre());
        } else if (b2.getCantLibros() > b1.getCantLibros()) {
            System.out.println("La mayor es: " + b2.getNombre());
        } else {
            System.out.println("Empate. Bibliotecas: " + b1.getNombre() + " y " + b2.getNombre());
        }
    }
    
    public String getNombre() { return nombre; }
    public int getCantLibros() { return cantLibros; }
    public Libro[] getLibros() { return libros; }
}
