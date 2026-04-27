package Ejercicio_5;

public class Perro extends Animal{
	private boolean requiereBosal;
    private boolean ladraFuerte;

    public Perro(String n, int e, String d, boolean b, boolean l) {
        super(n, e, d);
        this.requiereBosal = b;
        this.ladraFuerte = l;
    }
    
    public void mostrar() {
    	System.out.println("Nombre: " + this.nombre + "\tEdad: " + this.edad + "\tDueño: " + this.nombreDueño + "\tBosal: " + this.requiereBosal + "\tLadra: " + this.ladraFuerte);
    }
}
