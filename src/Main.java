import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = "";
        char[] ar = a.toCharArray();
        for (int i = ar.length - 1; i >= 0; i--) {
            b += ar[i];

        }
        System.out.println(b);
       
        }
    }

