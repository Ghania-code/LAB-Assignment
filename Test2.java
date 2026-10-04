public class Test2{
String name;
double gpa;
String ID;
static int count=1;                //When we change anything in the class then we use the static because static variable load in memory one time when class load.

{
System.out.println("Welcome to the Code block");
}

static{
System.out.println("Welcome to the static code block");
}


Test2(String name,double gpa){
this.name=name;
this.ID="SP26-BAI-"+String.format("%04d",count++);      //class function
this.gpa=gpa;
System.out.println("Name:"+name);
System.out.println("ID:"+ID);
System.out.println("gpa:"+gpa);
}



}