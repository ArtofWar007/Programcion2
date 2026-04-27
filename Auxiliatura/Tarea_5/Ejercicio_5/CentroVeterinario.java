package Ejercicio_5;
import java.util.*;

public class CentroVeterinario {
    private String nombre;
    private List<Perro> perros = new ArrayList<>();
    private List<Gato> gatos = new ArrayList<>();

    public CentroVeterinario(String nombre) { this.nombre = nombre; }

    public void agregarPerro(Perro p) { perros.add(p); }
    public void agregarGato(Gato g) { gatos.add(g); }

    public void ordenarPerros() {
        int n = perros.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Perro p1 = perros.get(j);
                Perro p2 = perros.get(j + 1);
                boolean cambiar = false;

                if (p1.edad > p2.edad) {
                    cambiar = true;
                } else if (p1.edad == p2.edad) {
                    if (p1.nombreDueño.compareTo(p2.nombreDueño) > 0) {
                        cambiar = true;
                    } else if (p1.nombreDueño.equals(p2.nombreDueño)) {
                        if (p1.nombre.compareTo(p2.nombre) > 0) {
                            cambiar = true;
                        }
                    }
                }

                if (cambiar) {
                    perros.set(j, p2);
                    perros.set(j + 1, p1);
                }
            }
        }
    }

   
    public void ordenarGatos() {
        int n = gatos.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Gato g1 = gatos.get(j);
                Gato g2 = gatos.get(j + 1);
                boolean cambiar = false;
                if (!g1.isTomaLeche() && g2.isTomaLeche()) {
                    cambiar = true;
                } else if (g1.isTomaLeche() == g2.isTomaLeche()) {
                  
                    if (g1.edad < g2.edad) {
                        cambiar = true;
                    } else if (g1.edad == g2.edad) {
                        
                        if (g1.nombre.compareTo(g2.nombre) > 0) {
                            cambiar = true;
                        }
                    }
                }
                if (cambiar) {
                    gatos.set(j, g2);
                    gatos.set(j + 1, g1);
                }
            }
        }
    }

    public void verificarMismoDueño() {       
        List<Animal> todos = new ArrayList<>();
        todos.addAll(perros);
        todos.addAll(gatos);

        int n = todos.size();
        boolean[] yaContado = new boolean[n]; 
        System.out.println("\n--- Reporte de Dueños con múltiples mascotas ---");
        
        for (int i = 0; i < n; i++) {
            if (yaContado[i]) continue; 

            String dueñoActual = todos.get(i).nombreDueño;
            int contador = 1; 

            for (int j = i + 1; j < n; j++) {
                if (todos.get(j).nombreDueño.equalsIgnoreCase(dueñoActual)) {
                    contador++;
                    yaContado[j] = true; 
                }
            }
            if (contador >= 2) {
                System.out.println("Dueño: " + dueñoActual + " | Cantidad de animales: " + contador);
            }
        }
    }
    
    public void mostrar() {
    	int n1 = perros.size();
    	int n2 = gatos.size();
    	System.out.println("Nombre del Ceentro Veterinario: " + this.nombre);
    	for (int i = 0; i < n1; i++) {
    		perros.get(i).mostrar();
    	}
    	for (int j = 0; j < n2; j++) {
    		gatos.get(j).mostrar();
    	}
    }
}