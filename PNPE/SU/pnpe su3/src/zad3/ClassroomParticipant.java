package zad3;

import java.sql.DataTruncation;

public class ClassroomParticipant extends CourseParticipant{
    private int attendanceBonus;
    ClassroomParticipant(String name, int baseScore, int attendanceBonus){
        super(name, baseScore);
        this.attendanceBonus = attendanceBonus;
    }
    @Override
    public int calculateFinalScore(){
        return getBaseScore()+ attendanceBonus;
    }
}
