//Code by Intakhab Alam

import java.util.*;
// package GUESSERGAME;

public class LaunchGame {
    public static void main(String[] args) {
        Login log = new Login();
        log.login();
    }
}


class Login {
    public void login() {
        FBCompany FBC = new FBCompany();
        FBC.checking();
    }
}



class FBCompany {

    public void checking() {
        int i = 3;
        Facebook FB = new Facebook();
        try {
            FB.input();
            FB.validation();
        } catch (MyException1 e) {
            System.out.println("Error.....\nEnter again");
            System.out.println("Attempt left : " + --i);
            try {
                FB.input();
                FB.validation();
            } catch (MyException1 e1) {
                System.out.println("Error.....\nEnter again");
                System.out.println("Attempt left : " + --i);
                try {
                    FB.input();
                    FB.validation();
                } catch (MyException1 e2) {
                    System.out.println("Attempt left : " + --i);
                    System.out.println("You exausted all the three attempt");
                    System.out.println("Please Re-Run the program to try again");
                }
            }
        }
    }

}

class RandomNum {
	int randomNum() {
		Random rand = new Random();
		int max=155,min=0;
	    return rand.nextInt(max - min + 1) + min;
	}
}


class Guesser {
    int guessNum;

    int guessNum() {
        RandomNum RN = new RandomNum();
        guessNum = RN.randomNum();
        System.out.println(guessNum);
        return guessNum;
    }
}

class Player {
    int guessNum;
    Scanner sc = new Scanner(System.in);

    int guessNum() {
        System.out.println("Player Please guess number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNum();
    }

    void collectNumFromPlayer() {
        Player P1 = new Player();
        Player P2 = new Player();
        Player P3 = new Player();

        numFromPlayer1 = P1.guessNum();
        numFromPlayer2 = P2.guessNum();
        numFromPlayer3 = P3.guessNum();
    }

    void compare() {
        if (numFromPlayer1 == numFromGuesser) {
            if (numFromPlayer2 == numFromGuesser && numFromPlayer3 == numFromGuesser) {
                System.out.println("1,2,3 win");
            } else if (numFromPlayer2 == numFromGuesser) {
                System.out.println("1,2 win");
            } else if (numFromPlayer3 == numFromGuesser) {
                System.out.println("1,3 win");
            } else {
                System.out.println("1 win");
            }
        } else if (numFromPlayer2 == numFromGuesser) {
            if (numFromPlayer3 == numFromGuesser) {
                System.out.println("2,3 win");
            } else {
                System.out.println("2 win");
            }
        } else if (numFromPlayer3 == numFromGuesser) {
            System.out.println("3 win");
        } else {
            System.out.println("Tum to madharchod nikle ek number guess nhi kar sakte");
        }
        System.out.println(numFromGuesser);
    }
}

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