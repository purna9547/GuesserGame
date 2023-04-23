public class Umpire {
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