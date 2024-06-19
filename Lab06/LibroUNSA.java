package Lab06;

public class LibroUNSA extends LibroTexto{
   
    private String facultad;
   
    public LibroUNSA(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }
   
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Facultad: " + facultad);
    }
}
   



