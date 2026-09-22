import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int a = sc.nextInt();

        int[] arr = new int[a];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < a; i++) {

            int value = Math.abs(arr[i]);
            int index = value - 1;

            if (arr[index] < 0) {
                result.add(value);
            } 
            else {
                arr[index] = -arr[index];
            }
        }

        System.out.println("Duplicate elements: " + result);

        sc.close();
    }
}