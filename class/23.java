import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            arr1[i]=sum;
            
        } 
        System.out.print(Arrays.toString(arr1));
        sc.close();
    }
}