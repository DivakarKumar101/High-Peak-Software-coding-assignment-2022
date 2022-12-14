import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {

        // Program using input file
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int count = 0; 

        while (sc.hasNextLine()) {
            System.out.println();
            System.out.println("Day "+ ++count);
            // Array Size
            int n;
            n = sc.nextInt();
            int[] array1 = new int[n];
            int[] array2 = new int[n];
            int[] array3 = new int[n];
            System.out.println("Number of jobs in a day that is n Value " + n);
            System.out.println("------------------------");

            // Adding Values to Array using for loop
            for (int i = 0; i < n; i++) {
                int j = i;
                j++;
                array1[i] = sc.nextInt();
                System.out.println("job-" + j + " Start Time is :" + array1[i]);
                array2[i] = sc.nextInt();
                System.out.println("job-" + j + " End Time is :" + array2[i]);
                array3[i] = sc.nextInt();
                System.out.println("job-" + j + " Profit Value :" + array3[i]);
            }

            // Finding Maximum Profitable Job Value
            int max = array3[0];
            int jobid = 0;
            for (int i = 0; i < n; i++) {
                if (array3[i] > max) {
                    max = array3[i];
                    jobid = i;
                }
            }
            System.out.println("------------------------");
            System.out.println("------------------------");
            System.out.println("Highest Profitable Job Value is : " + max + " That is job-" + ++jobid);

            // Total Sum of remaining jobs
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + array3[i];
            }
            sum = sum - max;

            // Print Outputs
            System.out.println("Total Remaining Jobs : " + --n);
            System.out.println("Total Remaining Jobs Value : " + sum);
        }
    }
}