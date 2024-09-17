import java.util.Scanner;
public class perimeterRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvad er længden? ");
        int length = input.nextInt();
        System.out.println("Hvad er bredden? ");
        int width = input.nextInt();
        periX(length, width);
        resultat(length, width);

    }
    public static int periX(int length, int width){
     int omkreds = ((length + width) * 2);
    return omkreds;
    }
    public static void resultat(int length, int width){
        int omkreds = periX(width, length);
        System.out.println("Omkredsen er " + omkreds);
    }

}
