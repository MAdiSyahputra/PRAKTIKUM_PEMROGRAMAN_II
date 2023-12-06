import java.util.Scanner;
public class PRAK005_2210817210017_MAdiSyahputra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Makanan Favorit: "); String MakananFavorit = input.nextLine();
        System.out.print("Masukkan Hobi: "); String Hobi = input.nextLine();
        System.out.println("Aku Suka Makan " + MakananFavorit + ", dan Hobiku " + Hobi);
    }
}