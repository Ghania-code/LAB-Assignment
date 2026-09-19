public class Task4Demo {
    public static void main(String args[]) {

        
        System.out.println("EXPERIMENT A ");
        int number = 50;
        System.out.println("Before: number = " + number);

        StudentDetail2 tempStudent = new StudentDetail2("Demo", 0);
        tempStudent.changeNumber(number);

        System.out.println("After: number = " + number);

     
        System.out.println(" EXPERIMENT B");
        StudentDetail2 student = new StudentDetail2("Ali", 60);

        System.out.println("Before: completedCredits = " + student.completedCredits);
        student.changeStudent(student);
        System.out.println("After: completedCredits = " + student.completedCredits);

    
        System.out.println("EXPERIMENT C ");
        StudentDetail2 originalStudent = new StudentDetail2("Ahmed", 70);

        System.out.println("Before: name = " + originalStudent.name);
        System.out.println("Before: completedCredits = " + originalStudent.completedCredits);

        originalStudent.changeStudentReference(originalStudent);

        System.out.println("After: name = " + originalStudent.name);
        System.out.println("After: completedCredits = " + originalStudent.completedCredits);
    }
}