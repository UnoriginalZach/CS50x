import java.util.*;
public class Mario {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("What size pyramid would you like: ");
       int n = scanner.nextInt();
       int i = 1; 
       while (i <= n) {
        for(int space = n - i; space >=0; space--){
            System.out.print(" ");
        }
        for(int j = 0; j < i; j++) {
            System.out.print("#");
        }
        System.out.print("  ");
        for(int k = 0; k < i; k++) {
            System.out.print("#");
        }
        System.out.println();
        i++;
       }
       scanner.close();
    }
    
}
