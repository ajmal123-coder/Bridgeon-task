import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Books sharedBooks = new Books(100);
        mainMenu(sharedBooks);
    }
    public static void mainMenu(Books sharedBooks){
        Scanner scan = new Scanner(System.in);
        System.out.println("For Exit Type 'Exit' as user name\n--------------------------------------");
        System.out.println("Enter Your User Name:");
        String userName = scan.nextLine();
        System.out.println("Enter Your Password");
        String password = scan.nextLine();
        if (userName.equalsIgnoreCase("Admin")&&password.equalsIgnoreCase("12345")){
            Admin.adminSection(sharedBooks);
        } else if (userName.equalsIgnoreCase("user1")&&password.equalsIgnoreCase("user1123")) {
            User1 userObj1 = new User1(sharedBooks);
            userObj1.userViewBooks();
        } else if (userName.equalsIgnoreCase("user2")&&password.equalsIgnoreCase("user2123")) {
            User2 UserObj2 = new User2(sharedBooks);
            UserObj2.userViewBooks();
        }else if (userName.equalsIgnoreCase("user3")&&password.equalsIgnoreCase("user3123")) {
            User3 UserObj3 = new User3(sharedBooks);
            UserObj3.userViewBooks();
        } else if (userName.equalsIgnoreCase("Exit")||password.equalsIgnoreCase("exit")) {
            return;
        }else {
            System.out.println("Invalid!. Enter again");
            mainMenu(sharedBooks);
        }
//        System.out.println("Enter your role:\n\t1 Teacher \n\t2 Student \n\t3 Admin");
//        int role = scan.nextInt();
//        if(role == 1){
//            User1 userObj1 = new User1(sharedBooks);
//            userObj1.viewBooks();
//        }
//        else if(role == 2){
//            User2 UserObj2 = new User2(sharedBooks);
//            UserObj2.viewBooks();
//        }
//        else if (role == 3){
//            Admin.adminSection(sharedBooks);
//        }
    }
    }
