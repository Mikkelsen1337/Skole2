import java.util.Scanner;
public class Minreturn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast variabel 1 ");
        int x = input.nextInt();
        System.out.println("Indtast variabel 2 ");
        int y = input.nextInt();
        resultat(x, y);
        printer(x, y);

    }

    public static int resultat(int x, int y){
        int lowestnumber = 0;

        if (x < y) {
           lowestnumber = x;
        }
        else if (x > y) {
           lowestnumber = y;
        }
        return lowestnumber;
    }
    public static void printer (int x, int y){
        int sum = resultat(x, y);
        System.out.println("Det mindstetal er " + sum);
    }
}
