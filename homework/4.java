import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String a = sc.nextLine();
        String rev ="";
        int b = a.length();
        // for(int i=b-1;i>=0;i--){
        //     rev+=a.charAt(i);
        // }
        // System.out.println(rev);
        // sc.close();
        char[] arr=new char[b];
        for(int i=0;i<b;i++){
            arr[i]=a.charAt(i);
        }
        int stat =0;
        int lat=b-1;
        while(stat<lat){
            char temp = arr[lat];
            arr[lat] = arr[stat];
            arr[stat] = temp;
            stat++;
            lat--;

        }
        for(int i=0;i<b;i++){
            System.out.print(arr[i]);
        }

    }
}