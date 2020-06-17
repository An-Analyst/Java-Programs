import java.util.Scanner;

public class Hourglass {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int max_sum = Integer.MIN_VALUE;
        for(int rows=0; rows<4; rows++){
            
            for(int cols =0; cols<4; cols++){

                int sum = arr[rows][cols]+arr[rows][cols+1]+arr[rows][cols+2]
                +arr[rows+1][cols+1]+arr[rows+2][cols]+arr[rows+2][cols+1]
                +arr[rows+2][cols+2];
                
                if(sum > max_sum)
                    max_sum = sum;
            }

        }
    System.out.print(max_sum);
        scanner.close();
    }
}
