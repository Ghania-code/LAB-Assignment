public class Person{

String name;
String Email;
String ID;
String city;
String doB;

Person(String name,String Email){
this(name,Email,"defaultID");

}

Person(String name,String Email,String ID){
this(name,Email,ID,"defaultcity");
}

Person(String name,String Email,String ID,String city){
this(name,Email,ID,city,"defaultdoB");
}

Person(String name,String Email,String ID,String city,String doB){
this.name=name;
this.Email=Email;
this.ID=ID;
this.city=city;
this.doB=doB;
}

void display(){
System.out.println(name);
System.out.println(Email);
System.out.println(ID);
System.out.println(city);
System.out.println(doB);


}}
