public class Task2Demo {
    public static void main(String args[]) {

        StudentDetails s1 = new StudentDetails ();
        s1.studentId = "BAI-001";
        s1.name = "Ghania";
        s1.completedCredits = 20;

        StudentDetails  s2 = new StudentDetails ();
        s2.studentId = "BAI-002";
        s2.name = "Ahmed";
        s2.completedCredits = 15;

        
        System.out.println(s1.summary());
        System.out.println(s2.summary());

        
        s1.addCredits(3);
        s2.addCredits(4);

        System.out.println("\nAFTER ADDING CREDITS:");
        System.out.println(s1.summary());
        System.out.println(s2.summary());

        
        int s1Remaining = s1.remainingCredits(130);
        int s2Remaining = s2.remainingCredits(130);

        System.out.println("\nREMAINING CREDITS:");
        System.out.println(s1.name + " remaining: " + s1Remaining);
        System.out.println(s2.name + " remaining: " + s2Remaining);
    }
}