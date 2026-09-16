import java.util.*;

class Main {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> set = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.containsKey(nums[i])) {

                int old = set.get(nums[i]);

                if ((i - old) <= k) {
                    return true;
                }
            }

            set.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        boolean result = containsNearbyDuplicate(nums, k);

        System.out.println("Result: " + result);

        sc.close();
    }
}