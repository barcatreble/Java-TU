package zad1;

public class Main {
    static void main() {
        Activity[] activities = new Activity[5];
        activities[0] = new Running("r1", 45);
        activities[1] = new Running("r2", 30);
        activities[2] = new Running("r3", 60);
        activities[3] = new Swimming("sw1", 20);
        activities[4] = new Swimming("sw2", 15);

        Activity maxCalories = activities[0];
        for(Activity a : activities){
            a.printInfo();

            if(a.calculateCalories() > maxCalories.calculateCalories()){ maxCalories = a; }
        }
        maxCalories.printInfo();

        try{
            Running run = new Running("r3", 0);
        }
        catch(IllegalArgumentException e){
            System.out.println("Minutite trqbva da sa polojitelni!");
        }
    }
}
