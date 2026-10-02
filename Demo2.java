public class Demo2{
public static void main(String args[]){

Student S1=new Student("Ghania","Lahore",21,500.0);


Student S2=new Student(S1);                     //Information of one constructor copy to another constructor
S2.display();
System.out.println("Attributes of first object");
S1.display();







}
}