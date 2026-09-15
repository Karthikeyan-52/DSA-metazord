import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
        sc.close();
    }
}