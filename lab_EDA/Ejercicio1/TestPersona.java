package Ejercicio1;
public class TestPersona {
    public static void main(String[] args){
        Persona p1 = new Persona();
        Persona p2 = new Persona("Alice",25,'M');
        Persona p3 = new Persona("Bob",30,'H',70,1.75);
        

        System.out.println(p1);
        System.out.println("IMC"+p1.calcularIMC());
        System.out.println("Es mayor de edad " + p1.esMayorDeEdad());

        System.out.println(p2);
        System.out.println("IMC"+p2.calcularIMC());
        System.out.println("Es mayor de edad " + p2.esMayorDeEdad());

        System.out.println(p3);
        System.out.println("IMC"+p3.calcularIMC());
        System.out.println("Es mayor de edad " + p3.esMayorDeEdad());
    }

}
