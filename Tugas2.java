import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahBuku ;
        String jenisBuku ;

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku = sc.nextInt();

        switch (jenisBuku.toLowerCase()) {
            case "kamus":
                if (jumlahBuku > 2) {
                    System.out.println("Total Diskon 12%");
                }
                else{System.out.println("Total Diskon 10%");}
                break;
            case "novel":
                if (jumlahBuku > 3) {
                    System.out.println("Total Diskon 9%");  
                }
                else {System.out.println("Total Diskon 8%");}
                break;
            default:
            if (jumlahBuku > 3) {
                System.out.println("Total Diskon 5%");  
            }
            else {System.out.println("Total Diskon 0%");}
                break;
        }
    }
}
