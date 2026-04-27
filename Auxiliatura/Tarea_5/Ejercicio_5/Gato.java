package Ejercicio_5;

public class Gato extends Animal {
    private boolean cazaRatones;
    private boolean tomaLeche;

    public Gato(String n, int e, String d, boolean c, boolean t) {
        super(n, e, d);
        this.cazaRatones = c;
        this.tomaLeche = t;
    }

    public void mostrar() {
    	System.out.println("Nombre: " + this.nombre + "\tEdad: " + this.edad + "\tDueño: " + this.nombreDueño + "\tCaza: " + this.cazaRatones + "Toma Leche: " + this.tomaLeche);
    }
    public boolean isTomaLeche() { return tomaLeche; }
}
