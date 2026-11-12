package zad1;

public class Swimming extends Activity{
    Swimming(String name, int durationMinutes){
        super(name, durationMinutes);
    }

    @Override
    public int calculateCalories(){
        return 7 * getDurationMinutes();
    }
}
