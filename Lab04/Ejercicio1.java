package Lab04;

import java.util.Arrays;

public class Ejercicio1 {
    public int minSal(int[] cities) {
        int n = cities.length;
        int[][] dp = new int[n][2];
        
        // Inicializa con valores grandes
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE / 2);
        }
        
        // Inicializa la primera ciudad mundo normal
        dp[0][0] = 0;
        
        for (int i = 0; i < n; i++) {
            int maxJump = cities[i];
            
            // Explora saltos desde la ciudad actual en el mundo normal
            for (int j = 1; j <= maxJump && i + j < n; j++) {
                dp[i + j][0] = Math.min(dp[i + j][0], dp[i][0] + 1);
            }
            
            // Explora saltos desde la ciudad actual en el mundo del reves
            for (int j = 1; j <= maxJump && i + j < n; j++) {
                dp[n - i - j][1] = Math.min(dp[n - i - j][1], dp[i][1] + 1);
            }
        }
        
        // Verifica si se puede llegar al final en el mundo normal
        return dp[n - 1][0] == Integer.MAX_VALUE / 2 ? -1 : dp[n - 1][0];
    }

    public static void main(String[] args) {
        int[] cities = {3, 0, 0, 1, 2};
        Ejercicio1 hpc = new Ejercicio1();
        System.out.println("minimo de saltos:");
        System.out.println(hpc.minSal(cities)); 
    }


}