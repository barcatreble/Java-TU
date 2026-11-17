public class zad3 {
    public static void main(String[] args) {
        double[][] rooms = {
                {4.5, 3.2},
                {-2, 5},
                {0, 6},
                {3, 3}
        };
        for(int i = 0; i < rooms.length; i++){
            try{
                System.out.println("Ploshtta na staq " + (i+1) + " e: " + calculateArea(rooms[i][0], rooms[i][1]));
            }
            catch(IllegalArgumentException e){
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }

    public static double calculateArea(double length, double width){
        if(length <= 0 || width <= 0){
            throw new IllegalArgumentException("Razmerite na staqta trqbva da sa polojitelni chisla!");
        }
        return length * width;
    }
}