import java.util.Scanner;
class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int a = sc.nextInt();
        System.out.print("Enter the cutoff range : ");
        int range = sc.nextInt();
        int [] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<a;i++){
            if(arr[i]>=range){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}