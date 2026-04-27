package Ejercicio_5;

public class Main {
	public static void main(String[] args) {
		CentroVeterinario CV1 = new CentroVeterinario("Centro Veterinario 1");
		CentroVeterinario CV2 = new CentroVeterinario("Centro Veterinario 2");
		
		Perro P1 = new Perro("Firulais", 3, "Juan", false, false);
		Perro P2 = new Perro("Dogo", 4, "Maria", false, true);
		Perro P3 = new Perro("Toby", 3, "Mario", true, false);
		Perro P4 = new Perro("Choco", 4, "Ramiro", true, true);
		
		Gato G1 = new Gato("Pelusa", 2, "Sandra", true, true);
		Gato G2 = new Gato("Michu", 3, "Juan", false, true);
		Gato G3 = new Gato("Simba", 2, "Hugo", true, false);
		Gato G4   = new Gato("Maya", 3, "Lilia", false, false);
		
		CV1.agregarPerro(P1);
		CV1.agregarPerro(P2);
		CV1.agregarGato(G1);
		CV1.agregarGato(G2);
		
		CV2.agregarPerro(P3);
		CV2.agregarPerro(P4);
		CV2.agregarGato(G3);
		CV2.agregarGato(G4);
		
		
		System.out.println("\t------ Antes del Ordenado ------");
		CV1.mostrar();
		System.out.println();
		CV2.mostrar();
		
		CV1.ordenarGatos();
		CV1.ordenarPerros();
		
		CV1.ordenarGatos();
		CV1.ordenarPerros();
		
		System.out.println("\n\n\t------ Despues del Ordenado ------");
		CV1.mostrar();
		System.out.println();
		CV2.mostrar();
		
		CV1.verificarMismoDueño();
		CV2.verificarMismoDueño();
	}
}
