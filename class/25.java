import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        String str2="";
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            str2+=ch;
        }
        if(str.equals(str2)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
        sc.close();
    }
}