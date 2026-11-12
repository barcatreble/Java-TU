package zad1;

public abstract class Activity {
    private String name;
    private int durationMinutes;
    Activity(String name, int durationMinutes){
        if(durationMinutes <= 0) throw new IllegalArgumentException("Minutite trqbva da sa polojitelni!");

        this.name = name;
        this.durationMinutes = durationMinutes;
    }

    public abstract int calculateCalories();

    public void printInfo(){
        System.out.println("Deinost: " + name + ", Produljitelnost: "  + durationMinutes + ", Izgoreni kalorii: " + calculateCalories());
        System.out.println();
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
}
