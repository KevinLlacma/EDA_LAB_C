import Ejercicio1.Persona;

public class Coleccion {
    private Persona[] arrPersona;
    private int contador;

    // Constructor por defecto
    public Coleccion() {
        this.arrPersona = new Persona[10];
        this.contador = 0;
    }

    // Constructor con capacidad n
    public Coleccion(int n) {
        this.arrPersona = new Persona[n];
        this.contador = 0;
    }

    // Método para agregar una persona
    public void agregarPersona(Persona p) {
        if (contador < arrPersona.length) {
            arrPersona[contador] = p;
            contador++;
        } else {
            System.out.println("El arreglo está lleno. No se puede agregar más personas.");
        }
    }

    // Método para buscar una persona
    public int buscarPersona(Persona p) {
        for (int i = 0; i < contador; i++) {
            Persona persona = arrPersona[i];
            if (persona.getNombre().equals(p.getNombre()) && persona.getEdad() == p.getEdad() && persona.getSexo() == p.getSexo()) {
                return i;
            }
        }
        return -1;
    }

    // Método para eliminar una persona
    public void eliminarPersona(Persona p) {
        int pos = buscarPersona(p);
        if (pos != -1) {
            arrPersona[pos] = arrPersona[contador - 1];
            arrPersona[contador - 1] = null;
            contador--;
        }
    }

    // Método para obtener personas mayores de edad
    public Coleccion mayoresEdad() {
        Coleccion mayores = new Coleccion();
        for (int i = 0; i < contador; i++) {
            if (arrPersona[i].getEdad() >= 18) {
                mayores.agregarPersona(arrPersona[i]);
            }
        }
        return mayores;
    }

    // Método para obtener personas con peso ideal
    public Coleccion pesoIdeal() {
        Coleccion ideales = new Coleccion();
        for (int i = 0; i < contador; i++) {
            if (arrPersona[i].esPesoIdeal()) {
                ideales.agregarPersona(arrPersona[i]);
            }
        }
        return ideales;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contador; i++) {
            sb.append(arrPersona[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
