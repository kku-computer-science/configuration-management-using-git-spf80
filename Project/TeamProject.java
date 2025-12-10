package Project;

import java.util.Scanner;

public class TeamProject {
    public static void main(String[] args) {
        // 1.Input and before sorting
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " numbers : ");
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before sorting : ");
        for(int i=0 ; i<n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 2.bubble sorting
}
