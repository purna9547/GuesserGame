
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