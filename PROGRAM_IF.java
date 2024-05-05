import java.util.Scanner;
public class PROGRAM_IF {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CONTOH PROGRAM IF");
        System.out.print("Masukan nilai: ");
        int angka = input.nextInt();
        if (angka >= 85 && angka <= 100){
            System.out.println("A");
        }
        else if (angka >= 70 && angka <= 84){
            System.out.println("B");
        }
        else if (angka >= 60 && angka <= 69){
            System.out.println("C");
        }
        else if (angka >= 50 && angka <= 59){
            System.out.println("D");
        }
        else if (angka >= 0 && angka <= 49) {
            System.out.println("E");
        }
        else {
            System.out.println("NILAI MELEBIHI AMBANG BATAS 100");
        }
        input.close();
    }
    
}
