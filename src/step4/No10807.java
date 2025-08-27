package step4;

import java.util.Scanner;

public class No10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); //몇개의 정수를 받을지
        int arr[] = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i]=sc.nextInt();
        }

        int findNum = sc.nextInt();
        int count = 0;
        for (int i = 0; i < x; i++) {
            if(arr[i]==findNum){
                count ++;
            }
        }
        System.out.println(count);

    }
}
