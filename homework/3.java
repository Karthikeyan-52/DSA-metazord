import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int a=sc.nextInt();
        System.out.print("Enter the Target Element : ");
        int b = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        } 
        // for(int i=0;i<a;i++){
        //     if(arr[i]==b){
        //         System.out.print(i+" ");
        //         break;
        //     }
        //     else{
        //         System.out.print("-1");
        //         break;
        //     }
        // }
        // for(int i=a-1;i>=0;i--){
        //     if(arr[i]==b){
        //         System.out.print(i);
        //         break;
        //     }
        //     else{
        //         System.out.print("-1");
        //         break;
        //     }
        // }
        int left = 0;
        int right = a-1;

        int first = -1;
        int last = -1;

        while (left <= right) {
            if (first == -1 && arr[left] == b) {
                first = left;
            }
            if (last == -1 && arr[right] == b) {
                last = right;
            }

            left++;
            right--;
        }

        System.out.print(first+" ");
        System.out.print(last);
        sc.close();
    }
}