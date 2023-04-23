import java.util.Scanner;

class MyException1 extends Exception {

}

class Facebook {
    String user = "I";
    String pass = "i";
    String user1 = "i";
    String pass1 = "i";
    Scanner scan = new Scanner(System.in);
    public void input() {
        
            System.out.print("Enter your username: ");
            user1 = scan.next();
            System.out.println("Enter your password");
            pass1 = scan.next();
        
    }

    public void validation() throws MyException1 {
        if (user1.equalsIgnoreCase(user) && pass1.equals(pass)) {
            Umpire umpire = new Umpire();
            umpire.collectNumFromGuesser();
            umpire.collectNumFromPlayer();
            umpire.compare();
        } else {
            MyException1 ME = new MyException1();
            throw ME;

        }
    }

}