import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}};

        int[][] transpoze = new int[3][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                transpoze[j][i] = matrix[i][j];
            }
        }

        // Transpoze matrisini ekrana yazdırma
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println(); // Yeni satıra geçmek için
        }
    }
}