import java.util.Scanner;
public class Pemilihan2Percobaan3 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajibersih ;
        double pajak = 0;
        
        System.out.print("Masukkan kategori pekerjaan : ");
        kategori = input18.nextLine();
        System.out.print("Masukkan jumlah penghasilan : ");
        penghasilan = input18.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak =  0.1;
            }
            else if (penghasilan <= 3000000) {
                pajak = 0.15;
            }
            else {
                pajak = 0.2;
            }
            gajibersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Penghasilan bersih = " + gajibersih);
        }
        else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak =  0.15;
            }
            else if (penghasilan <= 3500000) {
                pajak = 0.2;
            }
            else {
                pajak = 0.25;
            }
            gajibersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Penghasilan bersih = " + gajibersih);
        }
        else {
            System.out.println("Kategori pekerjaan salah");
        }
    }
}
