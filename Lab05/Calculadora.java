
public class Calculadora<T extends Number> {
    private T numero1;
    private T numero2;


    public Calculadora(T numero1, T numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    // comprueba si es int o float y hace sy respectiva operacion obteniendo su valor ya sea entero o float
    //luego devuelve el resultado como un Integer o Float
    // retorna un resultado T
    public T sumar() {
        if (numero1 instanceof Integer) {
            return (T) Integer.valueOf(numero1.intValue() + numero2.intValue());
        } else if (numero1 instanceof Float) {
            return (T) Float.valueOf(numero1.floatValue() + numero2.floatValue());
        }
        return null;
    }


    public T restar() {
        if (numero1 instanceof Integer) {
            return (T) Integer.valueOf(numero1.intValue() - numero2.intValue());
        } else if (numero1 instanceof Float) {
            return (T) Float.valueOf(numero1.floatValue() - numero2.floatValue());
        }
        return null;
    }


    public T multiplicar() {
        if (numero1 instanceof Integer) {
            return (T) Integer.valueOf(numero1.intValue() * numero2.intValue());
        } else if (numero1 instanceof Float) {
            return (T) Float.valueOf(numero1.floatValue() * numero2.floatValue());
        }
        return null;
    }
    //no puede dividir entre 0
    public T dividir() {
        if (numero2.intValue() == 0 || numero2.floatValue() == 0.0) {
            System.out.println("No se puede dividr entre 0.");
            return null;
        }
        if (numero1 instanceof Integer) {
            return (T) Integer.valueOf(numero1.intValue() / numero2.intValue());
        } else if (numero1 instanceof Float) {
            return (T) Float.valueOf(numero1.floatValue() / numero2.floatValue());
        }
        return null;
    }


    public static void main(String[] args) {
       
        int num1=5;
        int num2=3;
        float num3=5.5f;
        float num4 = 4.2f;
        Calculadora<Integer> calcEnteros = new Calculadora<>(num1,num2 );
        System.out.println("Los numeros son: "+ num1 +" y "+num2);
        System.out.println("Suma (enteros): " + calcEnteros.sumar());
        System.out.println("Resta (enteros): " + calcEnteros.restar());
        System.out.println("Multiplicación (enteros): " + calcEnteros.multiplicar());
        System.out.println("División (enteros): " + calcEnteros.dividir());


       
        Calculadora<Float> calcFlotantes = new Calculadora<>(num3, num4);
        System.out.println("Los numeros son: "+ num3 +" y "+num4);
        System.out.println("Suma (float): " + calcFlotantes.sumar());
        System.out.println("Resta (float): " + calcFlotantes.restar());
        System.out.println("Multiplicación (float): " + calcFlotantes.multiplicar());
        System.out.println("División (float): " + calcFlotantes.dividir());
    }
}



