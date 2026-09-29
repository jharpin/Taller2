import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

public class Paciente {
    String documento;
    String nombre;
    int gravedad; // 1 es el mas grave, 5 el mas leve

    public Paciente(String documento, String nombre, int gravedad) {
        this.documento = documento;
        this.nombre = nombre;
        this.gravedad = gravedad;
    }

    public void mostrar() {
        System.out.println(documento + " - " + nombre + " - gravedad: " + gravedad);
    }
}

// Comparador para que salgan primero los mas graves
class ComparadorGravedad implements Comparator<Paciente> {
    public int compare(Paciente a, Paciente b) {
        return a.gravedad - b.gravedad;
    }
}

