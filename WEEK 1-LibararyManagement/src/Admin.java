import javax.swing.*;
import java.util.Scanner;

public class Admin {
    static void adminSection(Books sharedBooks){

        System.out.println("\t1 VIEW BOOKS \n\t2 ADD BOOKS\n\t3 EXIT");
        Scanner scan = new Scanner(System.in);
        int Enter = scan.nextInt();
        scan.nextLine();

        if (Enter == 2){
            System.out.println("How many books want add: ");
            int num = scan.nextInt();
            scan.nextLine();

            for (int i = 0;i < num; i++){
                System.out.println("Enter book id");
                String id = scan.nextLine();

                System.out.println("Enter book title");
                String title = scan.nextLine();

                System.out.println("Enter author");
                String author = scan.nextLine();

                System.out.println("give availablity");
                String available = scan.nextLine();
                boolean availinput = available.equalsIgnoreCase("yes");

                boolean add = sharedBooks.setBooks(id, title, author, availinput,"None");
                if (add){
                    System.out.println("Book added successfully");
                }else {
                    System.out.println("Sorry Memory is full");
                }
            }
            adminSection(sharedBooks);
        } else if (Enter == 1) {
           sharedBooks.displayBooksAdmin();
           System.out.println();
           adminSection(sharedBooks);
        } else if (Enter == 3) {
            Main.mainMenu(sharedBooks);
        }
    }
}
