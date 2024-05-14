import Ejercicio1.Persona;

public class Coleccion {
    private Persona[] arrPersona;
    private int contador;

    public Coleccion(){
        this(10);
    }
    public Coleccion(int tamaño){
        arrPersona = new Persona[tamaño];
        contador = 0;
    }
    public void agregarPersona(Persona p1) {
        if(contador < arrPersona.length){
            arrPersona[contador] = p1;
            contador++;
        }else{
            System.out.println("El arreglo esta lleno");
        }
    }    
    public int buscarPersona(Persona p){
        for(int i=0; i < contador;i++){
            if(arrPersona[i].getNombre().equals(p.getNombre())&& arrPersona[i].getEdad() == p.getEdad() && arrPersona[i].getSexo() == p.getSexo()){
                return i;
            }
        }
        return -1;
    }
    public void eliminarPersona(Persona p){
        int pos = buscarPersona(p);
        if(pos!= -1){
            for(int i=pos; i < contador-1;i++){
                arrPersona[i] = arrPersona[i+1];
            }
            arrPersona[contador-1] = null;
            contador--;
        }else{
            System.out.println("No se encontro la persona");
        }
    }
    public Coleccion mayoresEdad(){
        Coleccion mayores = new Coleccion();
        for(int i=0; i < contador;i++){
            if(arrPersona[i].getEdad() >= 18){
                mayores.agregarPersona(arrPersona[i]);
            }
        }
        return mayores;
    }
    public Coleccion pesoIdeal(){
        Coleccion ideal = new Coleccion();
        for(int i=0; i < contador;i++){
            if(arrPersona[i].getSexo() == 'M'){
                if(arrPersona[i].getEdad() >= 18){
                    if(arrPersona[i].getPeso() < 18.5){
                        ideal.agregarPersona(arrPersona[i]);
                    }
                }
            }else{
                if(arrPersona[i].getEdad() >= 18){
                    if(arrPersona[i].getPeso() < 24.9){
                        ideal.agregarPersona(arrPersona[i]);
                    }
                }
            }
        }
        return ideal;
    }
    public String toString() {
        String cadena = "";
        for (int i = 0; i < contador; i++) {
            cadena += arrPersona[i].toString() + "\n";
        }
        return cadena;
    }
    public Coleccion condicionPeso(String condicion){
        Coleccion peso = new Coleccion();
        for(int i=0; i < contador;i++){
            if(arrPersona[i].getSexo() == 'M'){
                if(arrPersona[i].getEdad() >= 18){
                    if(arrPersona[i].getPeso() < 18.5){
                        peso.agregarPersona(arrPersona[i]);
                    }
                }
            }else{
                if(arrPersona[i].getEdad() >= 18){
                    if(arrPersona[i].getPeso() < 24.9){
                        peso.agregarPersona(arrPersona[i]);
                    }
                }
            }
        }
        return peso;
    }
}
