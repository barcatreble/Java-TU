import java.util.Scanner;

public class zad3 {
    static int sumArray(int[] arr, int i){
        if(i < 0){
            return 0;
        }

        return arr[i] + sumArray(arr, i - 1);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vuvedete golemina na masiva: ");
        int n = Integer.parseInt(sc.next());

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(sc.next());
        }

        System.out.println("Sumata na elementite na masiva e: " + sumArray(arr, n - 1));
    }
}
