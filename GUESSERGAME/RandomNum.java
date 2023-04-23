import java.util.*;

class RandomNum {
	int randomNum() {
		Random rand = new Random();
		int max=155,min=0;
	    return rand.nextInt(max - min + 1) + min;
	}
}
