import java.util.Scanner;
public class Tugas1Bagian1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1,bil2,bil3;

        System.out.println("Masukkan bilangan pertama : ");
        bil1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Masukkan bilangan kedua : ");
        bil2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Masukkan bilangan ketiga : ");
        bil3 = sc.nextInt();
        
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan pertama yg terbesar");
            }
            else {
                System.out.println("Bilangan ketiga yg terbesar");
            }
        }
        else if (bil2 > bil3) {
            System.out.println("Bilangan kedua yg terbesar");
        }
        else{
            System.out.println("Bilangan ketiga yg terbesar");
        }
    }
}
