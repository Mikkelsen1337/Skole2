import java.util.Scanner;
public class AreaRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hvad er bredden af din rektangel? ");
        int width = input.nextInt();
        System.out.println("Hvad er længden af din rektangel? ");
        int length = input.nextInt();
        rektangelX(width, length);
        resultat(width, length);

    }
    public static int rektangelX(int width, int length){
        int area = (width * length);
        return area;
    }
    public static void resultat(int width, int length){
       int area = rektangelX(width, length);
        System.out.println("Arealet er: " + area);
    }
}
