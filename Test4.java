public class Test4{
int bookID;
String title;
static String libraryName="Central_Library";
static int count=0;

static{
System.out.println("***LIBRARY MANAGEMENT SYSTEM LOADED***");
System.out.println("***Central Library***");

} 

{                         //instance initializer block
System.out.println("Processing new book entry...");
}

Test4(){
this(0,"untitles");

}


Test4(int bookID,String title){
this.bookID=bookID;
this.title=title;
count++;
}
        
void displayDetails(){
System.out.println("BOOKID:"+bookID);
System.out.println("Title:"+title);
System.out.println("Libraryname:"+libraryName);
}

void displayDetails(String category){
System.out.println("BOOKID:"+bookID);
System.out.println("Title:"+title);
System.out.println("Libraryname:"+libraryName);
System.out.println("Category of the book:"+category);
}

static void totalBooks(){
System.out.println("Total books in the library="+count);
}
}

                    