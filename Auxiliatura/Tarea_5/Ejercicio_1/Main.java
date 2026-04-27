package Ejercicio_1;

public class Main {
	public static void main(String[] args) {
		Biblioteca B1 = new Biblioteca("Biblioteca_1");
		Biblioteca B2 = new Biblioteca("Biblioteca_2");
		
		Libro L1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
		Libro L2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 1967);
		Libro L3 = new Libro("Orgullo y prejuicio", "Jane Austen", 1813);
		Libro L4 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1605);
		
		B1.agregarLibro(L1);
		B1.agregarLibro(L2);
		B2.agregarLibro(L3);
		B2.agregarLibro(L4);
		
		B1.buscarLibro("Cien años de soledad");
		B1.buscarLibro("Orgullo y prejuicio");
		
		B2.mostrarMayor(B1, B2);
	}
}
