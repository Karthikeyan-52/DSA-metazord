import java.util.*;

class Main {

    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        HashSet<Integer> res = new HashSet<>();

        for (int count : freq.values()) {

            if (res.contains(count)) {
                return false;
            }

            res.add(count);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = uniqueOccurrences(arr);

        System.out.println("Unique occurrences: " + result);

        sc.close();
    }
}