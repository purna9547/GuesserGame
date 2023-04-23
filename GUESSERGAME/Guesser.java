
class Guesser {
    int guessNum;

    int guessNum() {
        RandomNum RN = new RandomNum();
        guessNum = RN.randomNum();
        System.out.println(guessNum);
        return guessNum;
    }
}