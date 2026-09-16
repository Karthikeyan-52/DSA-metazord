import java.util.*;

class Main {

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }

        int count1 = 0;
        int count2 = 0;
        for (int i : nums1) {
            if (set2.contains(i)) {
                count1++;
            }
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                count2++;
            }
        }

        return new int[]{count1, count2};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of nums1: ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter nums1 elements:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of nums2: ");
        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];

        System.out.println("Enter nums2 elements:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = findIntersectionValues(nums1, nums2);

        System.out.println("[" + result[0] + ", " + result[1] + "]");

        sc.close();
    }
}