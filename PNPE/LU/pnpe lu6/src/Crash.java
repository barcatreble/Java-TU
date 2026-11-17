public class Crash {
    public static void main(String[] args) {
        int[] grades = {6,5,4};

        try {
            System.out.println("Start");
            printGrade(grades, 3);
            System.out.println("End");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Greshka: " + e.getMessage());
        }

        try{
            System.out.println("Before");
            int r = divide(10, 0);
            System.out.println("Result: " + r);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide: " + e.getMessage());
        }
        System.out.println("After");
    }

    static void printGrade(int[] g, int i){
        System.out.println(g[i]);
    }

    static int divide(int a, int b){
        return a / b;
    }
}
