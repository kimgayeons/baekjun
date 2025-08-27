package step4;

import java.util.Scanner;

public class No10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //정수 개수
        int x = sc.nextInt(); //해당 수보다 작은 수를 입력받을값
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            if(arr[i]<x){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
