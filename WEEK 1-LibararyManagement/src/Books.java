//using encpsulated class
public class Books {
    private String[][] books;
    private int count;

    //Constructor to initialize books 2d array
    public Books(int capacity){
    books =new String[capacity][5];
    count = 0;

    //giving books to view something before adding/
     setBooks("01", "Java Basics", "John Doe", true,"None");
     setBooks("02", "OOP Concepts", "Jane Smith", true,"None");
     setBooks("03", "Data Structures", "Alan Turing", true,"None");
     setBooks("04", "Java Basics", "John Doe", true,"None");
     setBooks("05", "OOP Concepts", "Jane Smith", true,"None");
     setBooks("06", "Data Structures", "Alan Turing", true,"None");
    }

    //setter method to add to the array
    public boolean setBooks(String id, String title, String author, boolean isAvailable, String userName){
        if( count >= books.length){
            System.out.println("No space in library");
            return false;
        }
        books[count][0] = id;
        books[count][1] = title;
        books[count][2] = author;
        books[count][3] = isAvailable ? "Available" : "Not Available";
        books[count][4] = userName;
        count++;
        return true;
    }
    public boolean changeAvailability(String id,String userName){
        for (int i = 0;i < count;i++){
            if (books[i][0].equals(id)){
                if(books[i][3].equals("Available")){
                    books[i][3] = "Not Available";
                    books[i][4] = userName;
                    System.out.println("Done-Bring back in 10 days\n---------------------------------\n");
                    return true;
                }else {
                    System.out.println("Not Available");
                    return false;
                }
            }
        }
        return false;
    }
    public void displayBooks(){
        for (int i = 0; i < count; i++) {
            System.out.println(books[i][0] + "\t \t" + books[i][1] + "\t \t" + books[i][2] + "\t \t"  + books[i][3]);
        }
    }
    public void displayBooksAdmin(){
        for (int i = 0; i < count; i++) {
            System.out.println(books[i][0] + "\t \t" + books[i][1] + "\t \t" + books[i][2] + "\t \t"  + books[i][3]+ "\t \t"+ books[i][4] );
        }
    }
}
