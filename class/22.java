import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int left = 0;
        int right = n - 1;

        int minDiff = Integer.MAX_VALUE;
        int ansLeft = 0;
        int ansRight = 0;

        while (left < right) {

            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - target);

            if (diff < minDiff) {
                minDiff = diff;
                ansLeft = left;
                ansRight = right;
            }

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                break;
            }
        }

        System.out.println("Pair: " + arr[ansLeft] + " " + arr[ansRight]);
        System.out.println("Sum: " + (arr[ansLeft] + arr[ansRight]));
        System.out.println("Difference: " + minDiff);
        sc.close();
    }
}