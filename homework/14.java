import java.util.*;

class Main {

    public static List<Integer> findDuplicates(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for (int i : nums) {

            if (set.contains(i)) {
                res.add(i);
            } 
            else {
                set.add(i);
            }
        }

        return res;
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

        List<Integer> result = findDuplicates(nums);

        System.out.println("Duplicates: " + result);

        sc.close();
    }
}