public class Library{
String title;
String author;
double price;
String bookID;
static int count=1;
static int bookCount=0;

//static code block
static{                              
 System.out.println("---Central Library Management System Initialized---");
 System.out.println("---Central Libraray---");

}

{                                              //instance initializer block
System.out.println("---Processing new book entry--");
}

Library(String title,String author,double price){
this.title=title;
this.author=author;
this.price=price;
this.bookID="LIB-"+String.format("%04d",count++);


System.out.println("Title of book:"+title);
System.out.println("Author of book:"+author);
System.out.println("Price of book:"+price);
System.out.println("BookID:"+bookID);

bookCount++;
}


public static void display(){
System.out.println("TOTAL BOOKS IN LIBRARY:"+bookCount);
}
}


