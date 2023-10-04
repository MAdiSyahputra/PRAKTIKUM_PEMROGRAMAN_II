import java.util.Scanner;
public class PRAK102_2210817210017_MAdiSyahputra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka awal: ");

        int angkaAwal = input.nextInt();
        int jumlahDeret = 10;

        for (int i = 0; i < jumlahDeret; i++) {
            int angka = (angkaAwal % 5 == 0) ? angkaAwal / 5 - 1 : angkaAwal;
            System.out.print(angka);
            if (i < jumlahDeret - 1) {
                System.out.print(",");
            }
            angkaAwal++;
        }
    }
}

