import java.util.*;
public class Mario {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("What size pyramid would you like: ");
       int n = scanner.nextInt();
       int i = 0; 
       while (i < n) {
        for(int j = 1; j < i; j++) {
            System.out.print("#");
        }
        System.out.print(" ");
        for(int k = 1; k < i; k++) {
            System.out.print("#");
        }
        System.out.println();
       }
    }
}
