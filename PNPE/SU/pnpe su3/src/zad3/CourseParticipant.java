package zad3;

public abstract class CourseParticipant {
    private String name;
    private int baseScore;
    CourseParticipant(String name, int baseScore){
        this.name = name;
        this.baseScore = baseScore;
    }

    public abstract int calculateFinalScore();

    public String getName() {
        return name;
    }

    public int getBaseScore() {
        return baseScore;
    }
}
