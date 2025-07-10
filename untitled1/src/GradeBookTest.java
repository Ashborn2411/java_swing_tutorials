public class GradeBookTest {
    public static void main(String[] args) {
        // Array of student grades
        int[] grades = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        // Create a GradeBook object
        GradeBook myGradeBook = new GradeBook("Introduction to Java Programming", grades);

        // Display a welcome message
        System.out.printf("Welcome to the grade book for %s%n%n",
                myGradeBook.getCourseName());

        // Process and display the grades
        myGradeBook.processGrades();
    }
}
