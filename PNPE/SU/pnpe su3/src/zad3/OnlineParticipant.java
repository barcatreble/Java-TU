package zad3;

public class OnlineParticipant extends CourseParticipant{
    private int completedTasks;
    OnlineParticipant(String name, int baseScore, int completedTasks){
        super(name, baseScore);
        this.completedTasks = completedTasks;
    }
    @Override
    public int calculateFinalScore(){
        return getBaseScore()+ completedTasks * 2;
    }
}
