package step7;

import java.util.Scanner;

public class No2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = 2;
        int[][] arr = new int[value][value];
        int max = -1;
        int x = 0;
        int y = 0;
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] > max){
                    max = arr[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
