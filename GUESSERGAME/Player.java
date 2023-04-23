import java.util.Scanner;

class Player {
    int guessNum;
    Scanner sc = new Scanner(System.in);

    int guessNum() {
        System.out.println("Player Please guess number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}