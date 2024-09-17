import java.util.Scanner;
public class MetodeParameter2Repetition {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Hvor mange gange ønsker du at printe? ");
        int n = input.nextInt();
        printer(n);
    }
    public static void printer(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Programmering ");
        }
    }
}