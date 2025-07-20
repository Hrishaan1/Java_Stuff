import java.util.ArrayList;
import java.util.Scanner;


public class grades {
    
    private static ArrayList<String> studentNames = new ArrayList<String>();
    private static ArrayList<Double> studentGrades = new ArrayList<Double>();



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Student Grades Program!");
        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.println("4. Calculate Average Grade");
            System.out.println("5. Find Student Grade");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    double grade = scanner.nextDouble();
                    addStudent(name, grade);
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting the program.");
                    break;
                case 4:
                    if (studentGrades.size() > 0) {
                        System.out.println("Average: " + findAverage());
                    } else {
                        System.out.println("No students found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter student name: ");
                    String findGrade = scanner.nextLine();
                    System.out.println(findGrade + "'s grade: " + studentGrades.get(studentNames.indexOf(findGrade)));
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Scanner Closed. Goodbye!");






    }


    public static void addStudent(String name, double grade) {
        studentNames.add(name);
        studentGrades.add(grade);
        System.out.println("Added student: " + name + " with grade: " + grade);
// nice


    } 


    public static void viewAllStudents() {
        if (studentNames.size() == 0) {
            System.out.println("No students found");
        } else {
            System.out.println("List of Students:");

            for (int i = 0; i < studentNames.size(); i++) {
                System.out.println("Name: " + studentNames.get(i) + ", Grade: " + studentGrades.get(i));
            }
        }
    }

    public static double findAverage() {
       
        int sum = 0;
        for (int i = 0; i < studentGrades.size(); i++) {
            sum += studentGrades.get(i);
        }
        return sum / studentGrades.size();
    }

}
