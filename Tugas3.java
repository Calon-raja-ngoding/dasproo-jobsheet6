import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ukuran;
        String merk,slipon,woman,kids;

        System.out.print("Masukkan merk : ");
        merk = sc.nextLine();
        System.out.print("Masukkan ukuran : ");
        ukuran = sc.nextInt();
        sc.nextLine();

        switch (merk.toLowerCase()) {
            case "specs":
                System.out.print("Apakah kategori Slip on (y/n) : ");
                slipon = sc.nextLine();
                if (slipon.equalsIgnoreCase("y")) {
                    if (ukuran >= 36) {
                        if (ukuran <= 40) {
                            System.out.println("Total harga 800.000");
                        }
                        else { System.out.println("Ukuran yg anda input invalid");}
                    }
                    else { System.out.println("Ukuran yg anda input invalid");}
                }
                else {
                    if (ukuran >= 40) {
                        if (ukuran <= 44) {
                            System.out.println("Total harga 1.200.000");
                        }
                        else { System.out.println("Ukuran yg anda input invalid");}
                    }
                    else { System.out.println("Ukuran yg anda input invalid");}
                }
                break;
                case "910":
                System.out.print("Apakah kategori woman (y/n) : ");
                woman = sc.nextLine();
                if (woman.equalsIgnoreCase("y")) {
                    if (ukuran >= 36) {
                        if (ukuran <= 41) {
                            System.out.println("Total harga 1.000.000");
                        }
                        else { System.out.println("Ukuran yg anda input invalid");}
                    }
                    else { System.out.println("Ukuran yg anda input invalid");}
                }
                else {
                    if (ukuran >= 41) {
                        if (ukuran <= 44) {
                            System.out.println("Total harga 1.800.000");
                        }
                        else { System.out.println("Ukuran yg anda input invalid");}
                    }
                    else { System.out.println("Ukuran yg anda input invalid");}
                }
                break; 
                case "ortus":
                System.out.print("Apakah kategori kids (y/n) : ");
                kids = sc.nextLine();
                if (kids.equalsIgnoreCase("y")) {
                    if (ukuran >= 36) {
                        if (ukuran <= 40) {
                            System.out.println("Total harga 750.000");
                        }
                        else { System.out.println("Ukuran yg anda input invalid");}
                    }
                    else { System.out.println("Ukuran yg anda input invalid");}
                }
                else {
                    if (ukuran >= 40) {
                        if (ukuran <= 44) {
                            System.out.println("Total harga 1.500.000");
                        }
                        else { System.out.println("Ukuran yg anda input invalid");}
                    }
                    else { System.out.println("Ukuran yg anda input invalid");}
                }
                break;   
            default:
            System.out.println("Merk yg anda input invalid");
                break;
        }
    }
}
