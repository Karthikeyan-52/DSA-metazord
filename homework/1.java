import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int a=sc.nextInt();
        System.out.print("Enter the elements of the array :");
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        
        int sum =0;
        
        int low=arr[0];
        int high=arr[0];
        
        
        System.out.println("Score:");
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
            if(i+1==4){
                System.out.println();
            }
        }
        System.out.println();
        for(int i=0;i<a;i++){
            sum=sum+arr[i];
        }
        double avg = (double)sum/a;
        for(int i=1;i<a;i++){
            if(arr[i]<low){
                low=arr[i];
            }
        }
        for(int i=1;i<a;i++){
            if(arr[i]>high){
                high=arr[i];
            }
        }
        
        System.out.println("Average : "+avg);
        System.out.println("Lowest score : "+low);
        System.out.println("Highest Score : "+high);
        System.out.println("Score Deviation");
        double ans =0;
        for(int i=0;i<a;i++){
            
            ans = arr[i] - avg;
            System.out.println(arr[i]+" "+ans);

        }

        double standard =0;
        for(int i=0;i<a;i++){
            double deviation = arr[i] - avg;
            standard = standard + deviation * deviation;            
        }
        double stand = Math.sqrt(standard / a);
        System.out.printf("Standard Deviation %.2f",stand);
        System.out.println();

        double lower = avg - stand;
        double upper = avg + stand;

        int count = 0;

        for (int i = 0; i < a; i++) {
            if (arr[i] >= lower && arr[i] <= upper) {
            count++;
             }
        }
        System.out.println("Scores within one standard deviation: "+count);

        sc.close();
    }
}