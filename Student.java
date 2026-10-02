public class Student{
private String name;
private String city;
private int creditHours;
private double marks;


Student(String name,String city,int creditHours,double marks){
this.name=name;
this.city=city;
this.creditHours=creditHours;
this.marks=marks;

}


Student(Student s2){
this.name=s2.name;
this.city=s2.city;
this.creditHours=s2.creditHours;
this.marks=s2.marks;
}

void display(){
System.out.println("Name of student:"+name);
System.out.println("city:"+city);
System.out.println("creditHours:"+creditHours);
System.out.println("marks:"+marks);

}

}
