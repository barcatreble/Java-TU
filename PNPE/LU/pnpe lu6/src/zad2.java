public class zad2 {
    public static void main(String[] args) {
        int[] measurements = {120, 0, 85, 100, 25};
        int[][] requests = {
                {0, 2},
                {2, 1},
                {7, 1},
                {3, 0}
        };

        for (int i = 0; i < requests.length; i++) {
            try {
                int result = measurements[requests[i][0]] / measurements[requests[i][1]];
                System.out.println(measurements[requests[i][0]] + " / " + measurements[requests[i][1]] + " = " + result);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception: " + e.getMessage());
            }
            catch(ArithmeticException e){
                System.out.println("Exception: " + e.getMessage());
            }
            finally{
                System.out.println("Obrabotkata e zavurshena");
            }
        }
    }
}