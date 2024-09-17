import java.util.Scanner;
public class Funktion3_0 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Hvad er dit navn? ");
        String name = input.nextLine();
        System.out.println("Hvor mange gange vil du printe? ");
        int n = input.nextInt();
        printer(name, n);
        checker(n);
        input.nextLine();
        System.out.println("Hvilket bogstav vil du printe? ");
        String bogstav = input.next();
        bogstavcase(bogstav);

    }
    public static void printer(String name, int n) {
        for(int i = 0; i < n; i++) {
            System.out.println("Hej: " + name);
        }
        }
        public static void checker(int n) {
            if (n % 2 == 0){
                System.out.println("Tallet er lige ");
            }
        else{
                System.out.println("Tallet er ulige ");
            }
        }
        public static void bogstavcase(String bogstav){
        bogstav = bogstav.toUpperCase();
            System.out.println("Dit bogstav er: " + bogstav);
        }
    }

