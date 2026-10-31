import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Vuvedete 10 chisla za masiva:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        zad1(sc);
        zad2(sc);
        zad3(sc);
        zad4(arr);
        zad5_1(arr);
        zad5_2(arr);

        sc.close();
    }

    //1
    public static void zad1(Scanner sc){
        int num; int sum = 0;
        System.out.print("Vuvedete tricifreno polojitelno chislo: ");
        num = sc.nextInt();
        for(int i = 0; i < 3; i++)
        {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Suma na cifrite: " + sum);
    }

    //2
    public static void zad2(Scanner sc){
        System.out.println("Vuvedete chisla a i b za razmqna: ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Sled razmqna: a = " + a + ", b = " + b);
    }

    //3
    public static void zad3(Scanner sc){
        int x = 2;
        while(x < 100)
        {
            x = 2 * x + 10;
        }
        System.out.println("x = " + x);
    }

    //4
    public static void zad4(int[] arr){
        int count = 0;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i - 1] * arr[i] < 0) count++;
        }
        System.out.println("Broi dvoiki susedni elementi s razlichni znaci: " + count);
    }

    //5 susedni
    public static void zad5_1(int[] arr){
        long proizvedenie = 1;
        long obshtoPr = 1;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i - 1] + arr[i] <= 120)
            {
                proizvedenie = arr[i - 1] * arr[i];
                obshtoPr *= proizvedenie;
            }
        }
        System.out.println("Proizvedenieto na elementite ot masiva, uchastvashti v susedni dvoiki, chiito suma sa <= 120 e: " + obshtoPr);
    }

    //5 dvoiki
    public static void zad5_2(int[] arr){
        long obshtoPr = 1;

        for (int i = 0; i < arr.length; i++)
        {
            int found = 0;
            for(int j = 0; j < arr.length; j++)
            {
                if(i != j && arr[i] + arr[j] <= 120)
                {
                    found = 1;
                    break;
                }
            }
            if(found == 1) obshtoPr *= arr[i];
        }
        System.out.println("Proizvedenieto na elementite ot masiva, uchastvashti v dvoiki, chiito suma sa <= 120 e: " + obshtoPr);
    }
}

