import java.util.Arrays;
import java.util.Random;

public class RandomByteArray {
    public static void main(String[] args) {
        byte arr [] = new byte [5];
        Random rand = new Random();
        rand.nextBytes(arr);

        System.out.println(Arrays.toString(arr));
    }
}
