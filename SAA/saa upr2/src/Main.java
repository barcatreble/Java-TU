
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{4, 6, 1},
                {5, 8, 6},
                {1, 3, 9}};

        int n = matrix.length;

        zad1(matrix, n);
        zad2(matrix, n);
        zad3(matrix, n);
        zad4(matrix, n);
    }

    //1
    public static void zad1(int[][] matrix, int n){
        int sumObikolka = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) sumObikolka += matrix[i][j];
            }
        }
        System.out.println("Suma na obikolkata na matricata: " + sumObikolka);
    }

    //2
    public static void zad2(int[][] matrix, int n){
        int[] arr = new int[n + 2];
        int sumGlaven = 0;
        int podGlavenDiagonal = 0;
        for (int i = 0; i < n; i++) sumGlaven += matrix[i][i];

        for (int i = 0; i < n; i++) {
            int sumRedove = 0;
            for (int j = 0; j < n; j++) {
                sumRedove += matrix[i][j];
                if (i > j && matrix[i][j] < i + j) podGlavenDiagonal++;
            }
            arr[i] = sumRedove;
        }
        arr[n] = sumGlaven;
        arr[n + 1] = podGlavenDiagonal;
        for(int i = 0; i < n; i++){
            System.out.printf("Suma na red N%d: %d\n", i, arr[i]);
        }
        System.out.println("Suma na glavniq diagonal: " + arr[n]);
        System.out.println("Broi elementi pod glavniq diagonal, po-malki ot sumite na indexite im: " + arr[n+1]);
    }

    //3
    public static void zad3(int[][] matrix, int n){
        int sumVtorichen = 0;
        for (int i = 0; i < n; i++) sumVtorichen += matrix[i][n - 1 - i];
        System.out.println("Suma na vtorichniq diagonal: " + sumVtorichen);
    }

    //4
    public static void zad4(int[][] matrix, int n){
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] < matrix[j][i]) {
                    count++;
                    System.out.printf("Dvoika N%d: %d, %d\n", count, matrix[i][j], matrix[j][i]);
                }
            }
        }
    }
}
