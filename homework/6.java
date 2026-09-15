import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 0, 0, 1};

        int present = (int) Arrays.stream(arr).filter(x -> x == 1).count();

        int absent = (int) Arrays.stream(arr).filter(x -> x == 0).count();

        int n = arr.length;

        int att = (int) Math.ceil((present * 100.0) / n);

        System.out.println("Present: " + present +
                           ", Absent: " + absent +
                           ", Att: " + att + "%");
    }
}






class Main {
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 0, 0, 1};

        int present = 0;
        int absent = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                present++;
            } else {
                absent++;
            }
        }

        int n = arr.length;

        double percentage = (present * 100.0) / n;

        int att = (int) percentage;

        
        if (percentage > att) {
            att++;
        }

        System.out.println("Present: " + present +
                           ", Absent: " + absent +
                           ", Att: " + att + "%");
    }
}