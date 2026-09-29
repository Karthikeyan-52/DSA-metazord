import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        char[] cha = {'a','e','i','o','u','A','E','I','O','U'};
        HashSet<Character> set = new HashSet<>();
        for (char c : cha) {
            set.add(c);
        }
        int vow=0;
        int cons=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (set.contains(ch)) {
                    vow++;
                } else {
                    cons++;
                }
            }
        }
        System.out.println(vow);
        System.out.println(cons);
        sc.close();
    }
}