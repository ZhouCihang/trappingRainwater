import java.util.Scanner;

public class TrapRainwater{
    public static void main(String[] args) {
        
        //define array length, trapping rain water as sum.
        int inputLength;
        int sum = 0;

        //read user input for array size and array integer
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your array size:");
        inputLength = in.nextInt();
        System.out.println("Enter all the elements:");
        int[] input = new int[inputLength];
        for (int i = 0; i <inputLength; i++){
            input[i] = in.nextInt();
        }

        //define two same size integer array
        int[] leftToRight = new int[inputLength];
        int[] rightToLeft = new int[inputLength];

        //give an initial value for these two array
        leftToRight[0] = input[0];
        rightToLeft[inputLength-1] = input[inputLength - 1];

        //scan list from left to right, and find the maxheight for each array index
        for (int i = 1; i < input.length; i++){
            leftToRight[i] = Math.max(leftToRight[i-1], input[i]);
        }

        //scan list from right to left, and find the maxheight for each array index
        for(int j = inputLength - 2; j >= 0; j--){
            rightToLeft[j] = Math.max(rightToLeft[j+1], input[j]);
        }
        
        //overlap these two arrays, the rain water can be calculated as below
        for(int q = 0; q < inputLength; q++){
            sum = sum + Math.min(leftToRight[q], rightToLeft[q]) - input[q];
        }

        //print out result. 
        System.out.println("total can trap rain water "+ sum);
    }
}