import java.util.Scanner;
public class PRAK103_2210817210017_MAdiSyahputra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.print("Masukkan bilangan awal: ");
        int bilanganAwal = input.nextInt();

        int baris = 1;
        int bilangan = bilanganAwal;

        System.out.print("Bilangan ganjil: ");

        while (baris <= N) {
            if (bilangan % 2 != 0) {
                System.out.print(bilangan);
                if (baris < N) {
                    System.out.print(", ");
                }
                baris++;
            }
            bilangan++;
        }
    }
}

