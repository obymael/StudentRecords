import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ARRAY FOR THE STUDENT RECORDS
        int MAX_STUDENT = 4;
        Student[] studentRecords = {
                new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 78),
                new Student("David", 89)
        };

        // ARRAY FOR THE UPDATED RECORDS
        Student[] updatedRecords = new Student[MAX_STUDENT];
        for (int i = 0; i < studentRecords.length; i ++){
            updatedRecords[i] = new Student(studentRecords[i].name, studentRecords[i].score);
        }

        // PRINT STUDENT SCORES:
        System.out.println("\nStudent Scores:");
        printStudentRecords(studentRecords);

        // GIVE BONUS POINTS TO ONE STUDENT
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the name of the student who will receive bonus points: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter the amount of bonus points (max 10): ");
        int bonus = scanner.nextInt();
        scanner.nextLine();

        boolean studentFound = false;
        int i = 0;
        // she did the > instead of <, hers doesn't work
        while (!studentFound && i < studentRecords.length){
            if (studentName.equalsIgnoreCase(updatedRecords[i].name)){
                updatedRecords[i].score += bonus;
                studentFound = true;
            }
            i++;
        }

        // PRINT UPDATED SCORES:
        System.out.println("\nUpdated Score:");
        printStudentRecords(updatedRecords);

        scanner.close();
    }

    // METHOD FOR PRINTING THE STUDENT RECORDS
    public static void printStudentRecords(Student[] studentRecords){
        for (Student student: studentRecords){
            System.out.println(student.toString());
        }
    }


}