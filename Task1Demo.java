public class Task1Demo{
    public static void main(String args[]){
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

       
        s1.studentId = "Sp26-BAI-001";
        s1.name = "Ghania";
        s1.completedCredits = 18;

        s2.studentId = "Sp26-BAI-002";
        s2.name = "Haseeb";
        s2.completedCredits = 15;

        s3.studentId = "Sp26-BAI-003";
        s3.name = "Ali";
        s3.completedCredits = 21;

        System.out.println("s1: " + s1.studentId + " "+" Name:"  + s1.name +" " +" Credits: " + s1.completedCredits);
        System.out.println("s2: " + s2.studentId + " "+" Name:"  + s2.name +" " +" Credits: " + s2.completedCredits);
        System.out.println("s3: " + s3.studentId + " "+" Name:"  + s3.name +" " +" Credits: " + s3.completedCredits);

        s2.completedCredits += 3;


      System.out.println("After Change");
      System.out.println("s1: " + s1.studentId + " | " + s1.name + " | Credits: " + s1.completedCredits);
      System.out.println("s2: " + s2.studentId + " | " + s2.name + " | Credits: " + s2.completedCredits);
      System.out.println("s3: " + s3.studentId + " | " + s3.name + " | Credits: " + s3.completedCredits);

    //TWO LINE COMMENT: Each Student object points to its own separate memory location on the heap.
        // Modifying s2 instance variable updates only its own memory state without affecting s1 or s3.
    }
}