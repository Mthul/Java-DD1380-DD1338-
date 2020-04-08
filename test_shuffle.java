
import java.util.*;

public class Shuffle {


    public void shuffleArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int n = rand.nextInt(numbers.length);
            swap(numbers[i], numbers[n]);

        }

    }

}