public class StudentDetail2 {
    String name;
    int completedCredits;

    public StudentDetail2(String name, int completedCredits){
        this.name = name;
        this.completedCredits = completedCredits;
    }

    void changeNumber(int x){
        System.out.println("Inside Method - x before change: " + x);
        x = 99;
        System.out.println("Inside Method - x after change: " + x);
    }

   
    void changeStudent(StudentDetail2 st){
        System.out.println("Inside Method - completedCredits before change: " + st.completedCredits);
        st.completedCredits = 120;
        System.out.println("Inside Method - completedCredits after change: " + st.completedCredits);
    }

    
    void changeStudentReference(StudentDetail2 st){
        System.out.println("Inside Method - original object name: " + st.name);
        st = new StudentDetail2("New Student", 0);
        System.out.println("Inside Method - new object name: " + st.name);
    }
}