import java.util.*;

class Main {

    public static int sumOfUnique(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (freq.get(nums[i]) == 1) {
                sum += nums[i];
            }
        }

        return sum;
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

        int result = sumOfUnique(nums);

        System.out.println("Sum of unique elements: " + result);

        sc.close();
    }
}