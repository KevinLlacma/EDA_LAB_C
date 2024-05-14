package Ejercicio1;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private char sexo = 'H' ;
    private double peso = 0.0;
    private double altura = 0.0;
    public static final double IMCBajo = 18.5;
    public static final char sexoDefecto = 'H';
    public static final double IMCAlto = 25;

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }    
    
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
    }
    
    public Persona (String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public int calcularIMC(){
        int result = 0;
        if (altura == 0.0)
            result = 0;
        double imc = peso / (altura*altura);
        if (imc < IMCBajo)
            result = -1;
        else if (imc <= IMCAlto && imc >= IMCBajo)
            result = 0;
        else 
            result = 1;
        return result;
    }
    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

    public void comprobarSexo(char sexo){
        if (sexo != 'H' && sexo != 'M')
        {
            this.sexo = sexoDefecto;
        }
    }

    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(char sexo) {
        comprobarSexo(sexo);
        this.sexo = sexo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public char getSexo() {
        return sexo;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }

}
