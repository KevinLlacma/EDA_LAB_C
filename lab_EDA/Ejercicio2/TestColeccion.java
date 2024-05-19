import Ejercicio1.Persona;
public class TestColeccion {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();
        
        Persona p1 = new Persona("Juan", 25, 'M', 70, 1.75);
        Persona p2 = new Persona("Maria", 30, 'F', 60, 1.65);
        Persona p3 = new Persona("Carlos", 17, 'M', 55, 1.70);
        Persona p4 = new Persona("Ana", 20, 'F', 50, 1.60);

        coleccion.agregarPersona(p1);
        coleccion.agregarPersona(p2);
        coleccion.agregarPersona(p3);
        coleccion.agregarPersona(p4);

        System.out.println("Colección completa:");
        System.out.println(coleccion);

        System.out.println("Personas mayores de edad:");
        System.out.println(coleccion.mayoresEdad());

        System.out.println("Personas con peso ideal:");
        System.out.println(coleccion.pesoIdeal());

        coleccion.eliminarPersona(p3);
        System.out.println("Colección después de eliminar a Carlos:");
        System.out.println(coleccion);
    }
}