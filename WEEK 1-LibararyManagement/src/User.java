import java.util.Scanner;

public class User {
    Scanner scan = new Scanner(System.in);
    Books sharedBooks;
    String userName;
    public User( Books sharedBooks, String userName){
        this.sharedBooks = sharedBooks;
        this.userName = userName;
    }
    public void userViewBooks(){

        System.out.println("Enter numbers for \n\t1 VIEW BOOKS \n\t2 SELECT BOOK\n\t3 PREVIOUS");
        int input = scan.nextInt();
        scan.nextLine();
        if (input == 1){
            sharedBooks.displayBooks();
            System.out.println();
            userViewBooks();
        }else if (input == 2){
           selectBooks();
        }else if (input == 3){
            Main.mainMenu(sharedBooks);
        }

    }
    public void selectBooks(){
        sharedBooks.displayBooks();
        System.out.println("Enter the id of a book you want\n--------------------------------------");
        String idBooks = scan.nextLine();
        sharedBooks.changeAvailability(idBooks,userName);
        sharedBooks.displayBooks();
        userViewBooks();
    }
}
class User1 extends User{
    public User1(Books sharedBooks) {
        super(sharedBooks,"User1");
    }

}
class User2 extends User{
    public User2(Books sharedBooks) {
        super(sharedBooks,"user2");
    }
}

class User3 extends User{
    public User3(Books sharedBooks) {
        super(sharedBooks,"user3");
    }
}
