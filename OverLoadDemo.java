  public class OverLoadDemo{

    // enroll(String)
    void enroll(String courseCode){
        System.out.println("Enrolled in: " + courseCode);
    }

    // enroll(String, int)
    void enroll(String courseCode, int section){
        System.out.println("Enrolled in: " + courseCode + " Section: " + section);
    }

    //  enroll(int)
    void enroll(int numericCourseCode){
        System.out.println("Enrolled in course code: " + numericCourseCode);
 }

/*

   INVALID OVERLOADS     
    int enroll(String courseCode) {
        return 1;
    }
*/

public static void main(String args[]) {
        OverLoadDemo demo = new OverLoadDemo();

        // Valid calls
        demo.enroll("CSC241");
        demo.enroll("CSC241", 2);
        demo.enroll(241);

        // Invalid calls (Commented out)
        // demo.enroll();               Missing argument
        // demo.enroll("241", "2");    Argument data type not correct
    }
}