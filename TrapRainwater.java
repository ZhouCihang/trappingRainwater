import java.util.Scanner;

public class TrapRainwater{
    public static void main(String[] args) {
        int inputLength;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your array size:");
        inputLength = in.nextInt();

        int[] input = new int[inputLength];
        for (int i = 0; i <inputLength; i++){
            input[i] = in.nextInt();
        }
        
    }
}