import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLE FOR ARRAY SIZE
        int MAX_STUDENT = 4;

        Student[] studentRecords = {
                new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 78),
                new Student("David", 89)
        };
        /*// SAME AS:
        Student[] studentRecords = new Student[MAX_STUDENT];
        Student alice = new Student("Alice", 85);
        Student bob = new Student("Bob", 92);
        Student charlie = new Student("Charlie", 78);
        Student david = new Student("David", 89);*/
        //

        Student[] updatedRecords = new Student[MAX_STUDENT];

        // FOR LOOP TO ADD BONUS POINTS TO STUDENT (add + 10 after .score to add 10 BP to each student)
        for (int i = 0; i < studentRecords.length; i ++){
            updatedRecords[i] = new Student(studentRecords[i].name, studentRecords[i].score);
        }

        // PRINT STUDENT SCORES:
        System.out.println("\nStudent Scores:");
        printStudentRecords(studentRecords);

        // REFACTORING CODE STARTS HERE
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the student who will receive bonus points: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter the amount of bonus points (max 10): ");
        int bonus = scanner.nextInt();
        // she forgot to do the scanner.nextLine();
        scanner.nextLine();

        // OPTION 1 FOR ADDING THE BP TO THE CHOSEN STUDENT
        // she did the > instead of <, hers doesn't work
        /*for (int i = 0; i < studentRecords.length; i ++){
            if (studentName.equalsIgnoreCase(updatedRecords[i].name))
                updatedRecords[i].score += bonus;
        }*/

        // OPTION 2 FOR ADDING THE BP TO THE CHOSEN STUDENT
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

        /*System.out.println(alice);
        System.out.println(bob);
        System.out.println(charlie);
        System.out.println(david);*/

        // she also forgot to close the scanner
        scanner.close();
    }

    // METHOD FOR PRINTING THE STUDENT RECORDS
    public static void printStudentRecords(Student[] studentRecords){
        for (Student student: studentRecords){
            System.out.println(student.toString());
        }
    }


}
