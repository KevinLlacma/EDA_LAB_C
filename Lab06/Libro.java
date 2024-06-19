package Lab06;

public class Libro {
    private String titulo;
    private String autor;
    private double precio;


    public Libro(String titulo, String autor) {
        this.titulo= titulo;
        this.autor =autor;
        this.precio= 0.0;
    }

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }


    public void imprimirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: $" + String.format("%.2f", precio));
    }

}



