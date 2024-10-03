import java.util.Scanner;
public class Pemilihan2Percobaan218 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        int menu;
        double diskon,harga, totalBayar;
        String member;
        
        System.out.println("___________________________________________");
        System.out.println("|============= MENU KAFE JTI =============|");
        System.out.println("|_________________________________________|");
        System.out.println("|1. Rice Bowl                             |");
        System.out.println("|2. Ice Tea                               |");
        System.out.println("|3.Paket Bunding (Rice Bowl + Ice Tea)    |");
        System.out.println("|_________________________________________|"); 
        System.out.print("Masukkan angka dari menu yg anda pilh : ");
        menu = input18.nextInt();
        input18.nextLine();
        System.out.print("Apakah punya member (y/n) : ");
        member = input18.nextLine();
        System.out.println("___________________________________________");
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.1;
            System.out.println("Besar diskon = 10%");
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga rice bowl = " + harga);
            }else if (menu == 2) {
                harga =  3000;
                System.out.println("Harga ice tea = " + harga);
            }else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga paket buinding = " + harga);
            }else{
                System.out.println("Masukkan menu pilihan yg benar ");
                return;
            }
    
            totalBayar = harga - ( harga * diskon);   
            System.out.println("Total bayar : " + totalBayar);     
        }
        else if (member.equalsIgnoreCase("n")) {
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga rice bowl = " + harga);
            }else if (menu == 2) {
                harga =  3000;
                System.out.println("Harga ice tea = " + harga);
            }else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga paket buinding = " + harga);
            }else{
                System.out.println("Masukkan menu pilihan yg benar ");
                return;
            }
            System.out.println("Total bayar : " + harga);

        }
        else{
            System.out.println("Member invalid");
        }
        System.out.println("___________________________________________");
        System.out.println("|============= TERIMA KASIH ==============|");
        System.out.println("|_________________________________________|");
    }
}

