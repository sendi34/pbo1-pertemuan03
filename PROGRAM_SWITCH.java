import java.util.Scanner;

public class PROGRAM_SWITCH {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("CONTOH PROGRAM SWITCH");
        System.out.println("================================================");
        System.out.println("=============DAFTAR TIKET KERETA API============");
        System.out.println("1. Ekonomi");
        System.out.println("2. Bisnis");
        System.out.println("3. Eksekutif");
        System.out.println("================================================");
        System.out.print("Masukan Pilihan: ");
        int pilih = masukan.nextInt();
        int harga = 0;
        switch (pilih) {
            case ( 1 ):
                harga = 150000;
                break;
            case ( 2 ):
                harga = 250000;
                break;
            case ( 3 ):
                harga = 400000;
                break;
            default:
                System.out.println("Pilihan tidak valid");
                System.exit(0);
                break;
        }
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        Scanner jum = new Scanner(System.in);
        int jumlah = jum.nextInt();
        int total = harga * jumlah;
        System.out.println("Total harga tiket: " +total);
        masukan.close();
        jum.close();
    }
}
