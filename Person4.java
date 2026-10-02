public class Person4{
private String name;
private String ID;
private String dob;
private String Email;
private String city;


public Person4(String name, String ID,String dob,String Email,String city){
this.name=name;
this.ID=ID;
this.dob=dob;
this.Email=Email;
this.city=city;
}


public Person4(String name, String ID,String dob,String Email){
this.name=name;
this.ID=ID;
this.dob=dob;
this.Email=Email;

}

public void display(){
System.out.println("ID: "+ID);
System.out.println("name: "+name);
System.out.println("dob: "+dob);
System.out.println("Email: "+Email);
System.out.println("city: "+city);

}

public void notcitydisplay(){
System.out.println("ID: "+ID);
System.out.println("name: "+name);
System.out.println("dob: "+dob);
System.out.println("Email: "+Email);
}
}