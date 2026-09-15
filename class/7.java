class Main {
    public static void main(String[] args) {

        int[] arr = {5, 3, 7, 10, 4, 48, 3};

        boolean unique = true;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }

            if (!unique) {
                break;
            }
        }

        if (unique) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}