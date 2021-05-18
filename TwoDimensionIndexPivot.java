//import java.util.*;

public class TwoDimensionIndexPivot {
    public static void main(String[] args) {
        double[][] testArray = {{1.0, 2.0, 3.0, 4.0},
                                {2.0, 1.1, 5.0, 8.0},
                                {3.0, 5.0, 1.2, 9.0},
                                {4.0, 8.0, 9.0, 1.3}};
        int swapA = 2;
        int swapB = 0;
        double special = 0;
        double[] temp = {0.0, 0.0, 0.0, 0.0};
    
        for (int i = 0; i < testArray.length; i++) {
            temp[i] = testArray[swapA][i];
        }
        
        for (int y = 0; y < testArray.length; y++) {
            if (y == swapB) {
                special = testArray[swapA][swapA];
                testArray[swapA][swapA] = testArray[swapB][swapB];
                testArray[swapB][swapB] = special;
            } else if (y != swapA) {
                testArray[swapA][y] = testArray[swapB][y];
                testArray[swapB][y] = temp[y];
            }
        }

        for (int j = 0; j < testArray.length; j++) {
            temp[j] = testArray[j][swapA];
        }

        for (int x = 0; x < testArray.length; x++) {
            if (x != swapB && x != swapA) {
                testArray[x][swapA] = testArray[x][swapB];
                testArray[x][swapB] = temp[x];
            }
        }

        System.out.println("========================\n");
        for (int a = 0; a < testArray.length; a++) {
            for (int b = 0; b < testArray.length; b++) {
                System.out.printf("%f ", testArray[a][b]);
            }
            System.out.println("\n");
        }
        System.out.println("========================\n");

    }
}
