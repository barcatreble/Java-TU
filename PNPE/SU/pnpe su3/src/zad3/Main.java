package zad3;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        CourseParticipant[] participants = new CourseParticipant[5];

        /*participants[0] = new OnlineParticipant("Boris", 10, 4);
        participants[1] = new OnlineParticipant("Ivan", 8, 8);
        participants[2] = new ClassroomParticipant("Daniel", 6, 5);
        participants[3] = new ClassroomParticipant("Simeon", 9, 4);
        participants[4] = new ClassroomParticipant("Yavor", 5, 3);*/

        String[] names = {"Boris", "Ivan", "Daniel", "Simeon", "Yavor"};
        int[] bonuses = {4, 8, 5, 4, 3};
        int i = 0;

        for (String name : names) {
            System.out.print("Vuvedete baseScore za " + name + ": ");

            try {
                int baseScore = Integer.parseInt(sc.nextLine());

                if (i < 2) { participants[i] = new OnlineParticipant(name, baseScore, bonuses[i]); }
                else { participants[i] = new ClassroomParticipant(name, baseScore, bonuses[i]); }
            }
            catch (NumberFormatException e) {
                System.out.println("Nevalidno chislo!");
                i--;
            }
            i++;
        }

        CourseParticipant maxScore = participants[0];
        for (CourseParticipant p : participants) {
            System.out.println("Ime: " + p.getName() + ", Tochki: " + p.calculateFinalScore());
            if (maxScore.calculateFinalScore() < p.calculateFinalScore()) {
                maxScore = p;
            }
        }
        System.out.println("Uchastnik s nai-mnogo tochki: " + maxScore.getName() + ", " + maxScore.calculateFinalScore() + "t.");
    }
}