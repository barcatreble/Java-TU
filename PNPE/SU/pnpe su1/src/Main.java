import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Въведете брой студенти: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] facultyNumbers = new String[n];
        int[] grades = new int[n];

        readResults(sc, facultyNumbers, grades);
        printResults(facultyNumbers, grades);
        System.out.println("Брой скъсани студенти: " + countFailedStudents(grades));
        printFailedStudents(facultyNumbers, grades);
        System.out.printf("Среден успех: %.2f", calculateAverageGrade(grades));
        printTopStudents(facultyNumbers, grades);
    }


    public static void readResults(Scanner sc, String[] facultyNumbers, int[] grades){
        System.out.println("Въведете факултетен номер и оценка: ");
        for(int i = 0; i < facultyNumbers.length; i++){
            String input = sc.nextLine();
            facultyNumbers[i] = input.split(" ")[0];
            grades[i] = Integer.parseInt(input.split(" ")[1]);
        }
    }

    public static void printResults(String[] facultyNumbers, int[] grades){
        System.out.println("Резултати от изпита:");
        for(int i = 0; i < facultyNumbers.length; i++){
            System.out.println("Факултетен номер: " + facultyNumbers[i] + ", oценка: " + grades[i]);
        }
    }

    public static int countFailedStudents(int[] grades){
        int count = 0;
        for(int grade : grades){
            if(grade == 2) count++;
        }
        return count;
    }

    public static void printFailedStudents(String[] facultyNumbers, int[] grades){
        String[] failedStudents = new String[countFailedStudents(grades)];
        int index = 0;

        for(int i = 0; i < facultyNumbers.length; i++){
            if(grades[i] == 2) {
                failedStudents[index] = facultyNumbers[i];
                index++;
            }
        }

        System.out.print("Факултетни номера на скъсаните: ");
        for (String failed : failedStudents) {
            System.out.print(failed + ", ");
        }
        System.out.println();
    }

    public static double calculateAverageGrade(int[] grades){
        int sum = 0;
        for(int grade : grades) sum += grade;

        return (double)sum/grades.length;
    }

    public static void printTopStudents(String[] facultyNumbers, int[] grades){
        int maxGrade = 2;
        for(int i = 0; i < facultyNumbers.length; i++){
            if(grades[i] > maxGrade){
                maxGrade = grades[i];
            }
        }
        System.out.println("Най-висока оценка: " + maxGrade);
        System.out.println("Студенти с най-висока оценка: ");
        boolean first = true;
        for(int i = 0; i < grades.length; i++){
            if(grades[i] == maxGrade){
                if(!first) System.out.print(", ");

                System.out.print(facultyNumbers[i]);
                first = false;
            }
        }
        System.out.println();
    }
}