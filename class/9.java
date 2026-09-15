import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the length of the array : ");
        // int a = sc.nextInt();
        // int[] arr=new int[a];
        // for(int i=0;i<a;i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.print("Enter the targeted number : ");
        // int b = sc.nextInt();
        // int count=0;
        // for(int i=0;i<a;i++){
        //     if(arr[i]==b){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("Enter the target character : ");
        char b = sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==b){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}