public class Ejercicio2 {
    
public static void main(String[] args)
{
    //cantidad de dígitos
    int n = 5;
    incre(n);
}
//método que imprime dígitos de 1 hasta n
//ejemplo: n=5 -> 12345
//ejemplo: n=8 -> 12345678
static void incre(int n)
{
    if(n>0)
    {
        incre(n-1);
        System.out.print(n);
    }
    else
        System.out.println();
}


}







