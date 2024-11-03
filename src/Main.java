import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Step 1
        int[] temperatures = new int[5];

        //Step 2
        temperatures[0] = 24;
        temperatures[1] = 5;
        temperatures[2] = 27;
        temperatures[3] = 17;
        temperatures[4] = -1;

        //Step 3
        temperatures[2] = -15;

        //Step 4
        for (int temp : temperatures) {
            System.out.println(temp);
        }
    }
}