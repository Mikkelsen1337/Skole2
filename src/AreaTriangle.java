import java.util.Scanner;
public class AreaTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvad er højden af din trekant? ");
        int height = input.nextInt();
        System.out.println("Hvad er grundlinjen af din trekant? ");
        int ground = input.nextInt();
        trianglex(height, ground);
    }
    public static void trianglex(int height, int ground){
        int sum = (height/2 * ground);
        System.out.println("Arealet af din trekant er: " + sum);
    }
}
