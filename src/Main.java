import java.util.Scanner;
//massive
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            System.out.print("int number: ");
            int valvue = scanner.nextInt();
            arr[i] = valvue;
        }
        int min = arr[0];
        for (int i = 0;i < arr.length; i++){
            if(arr[i] < min)
                min = arr[i];

        }
        System.out.print("Minimal: " + min);
    }
}
