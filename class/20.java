import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int a= sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the size of the window :");
        int b=sc.nextInt();
        for(int i=0;i<=a-b;i++){
            for(int j=i;j<i+b;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}