package ej3;

class Turista implements Comparable<Turista> {
    String nombre;
    String documento;

    public Turista(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Documento: " + this.documento;
    }

    @Override
    public int compareTo(Turista otroTurista) {
         // compara por nombre
        return this.nombre.compareTo(otroTurista.nombre);
    }
}
