package Lab04;

public class Ejercicio2 {
    private static final int[][] contribuciones = {
        {-1, 1, -1, -1, 0}, // ConocimientosEquipo
        {-1, 1, 0, 0, -1}, // Plazo
        {-1, 0, -1, -1, 0}, // RecursosParaCalidad
        {1, -1, 0, 1, 0},   // HerramientasDeDesarrollo
        {0, -1, 1, 0, 1}    // GestionDeRequisitos
    };

    private static final int nProp = contribuciones.length;
    private static final int nRiesgos = contribuciones[0].length;
    private static final int maxPropAFavorecer = 4;
    private static final int sumaMaxPorRiesgo = 2;

    private static int[][] solucionParcial;

    public static void main(String[] args) {
        solucionParcial = new int[maxPropAFavorecer + 1][nRiesgos];
        for (int i = 0; i <= maxPropAFavorecer; i++) {
            for (int j = 0; j < nRiesgos; j++) {
                solucionParcial[i][j] = getSolucionParcialCasoBase(i, j, nProp);
            }
        }

        for (int i = 1; i <= maxPropAFavorecer; i++) {
            for (int j = 0; j < nRiesgos; j++) {
                solucionParcial[i][j] = Math.max(solucionParcial[i][j], getSolucionParcialPorAlternativa(i, j, nProp, nRiesgos));
            }
        }

        int mejorSolucion = Integer.MIN_VALUE;
        for (int i = maxPropAFavorecer; i >= 0; i--) {
            mejorSolucion = Math.max(mejorSolucion, getSolucionReconstruidaCasoRecursivo(i, nRiesgos - 1, nProp, nRiesgos));
        }
        System.out.println();
        System.out.println("Mejor solución: " + mejorSolucion);
    }

    private static int getSolucionParcialCasoBase(int i, int j, int nProp) {
        if (i == 0 ) {
            return 0;
        }
        return Integer.MIN_VALUE / 2;
    }

    private static int getSolucionParcialPorAlternativa(int i, int j, int nProp, int nRiesgos) {
        int mejorSolucion = solucionParcial[i][j];
        for (int k = j - 1; k >= 0 && k < nRiesgos; k--) {
            int contribucion = contribuciones[i - 1][k];
            if (contribucion <= sumaMaxPorRiesgo) {
                int solucionParcialRestante = solucionParcial[i - 1][k] + contribucion;
                mejorSolucion = Math.max(mejorSolucion, solucionParcialRestante);
            }
        }
        return mejorSolucion;
    }

    private static int getSolucionReconstruidaCasoRecursivo(int i, int j, int nProp, int nRiesgos) {
        if (j == -1 || i == 0) {
            return 0;
        }
        int mejorSolucion = solucionParcial[i][j];
        if (mejorSolucion == Integer.MIN_VALUE / 2) { // Cambio adicional
            return Integer.MIN_VALUE / 2;
        }
        for (int k = j - 1; k >= 0 && k < nRiesgos; k--) {
            int contribucion = contribuciones[nProp - i][k];
            if (contribucion <= sumaMaxPorRiesgo) {
                int solucionParcialRestante = solucionParcial[i - 1][k] + contribucion;
                if (solucionParcialRestante == solucionParcial[i][j]) {
                    mejorSolucion = Math.max(mejorSolucion, getSolucionReconstruidaCasoRecursivo(i - 1, k - 1, nProp, nRiesgos));
                }
            }
        }
        return mejorSolucion;
    }
}