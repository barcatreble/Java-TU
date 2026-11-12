package zad1;

public class Running extends Activity{
    Running(String name, int durationMinutes){
        super(name, durationMinutes);
    }

    @Override
    public int calculateCalories(){
        return 9 * getDurationMinutes();
    }
}
