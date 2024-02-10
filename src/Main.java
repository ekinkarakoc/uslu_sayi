import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;
        int sonuc = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("üssü alinacak sayi :");
        n = scanner.nextInt();
        System.out.println("üs olacak sayi : ");
        k = scanner.nextInt();

        while (k > 0){
            sonuc *= n;
            k--;
        }
        System.out.println(sonuc);
    }
}