public class Demo{
public static void main(String args[]){
 Person p1=new Person("Ghania","SP26-BAI-056");
  Person p2=new Person("Sumavia","SP26-BAI-06","4");
  Person p3=new Person("Sohaib","SP26-BAI-64","3","Lahore");
  Date d1=new Date(1-2-2026);
  Person p4=new Person("Shazeena","SP26-BAI-43","2","Lahore",d1);

System.out.println("Attributes of first object");
p1.display();

System.out.println("Attributes of second object");
p2.display();

System.out.println("Attributes of third object");
p3.display();

System.out.println("Attributes of fourth object");
p4.display();


d1.displayDate();

}
}