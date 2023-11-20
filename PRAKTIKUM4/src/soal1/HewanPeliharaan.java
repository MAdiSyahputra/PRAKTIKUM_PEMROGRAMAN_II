package soal1;

import java.util.Scanner;
public class HewanPeliharaan {
    private String nama;
    private String ras;
    public HewanPeliharaan(String r, String n) {
        ras = r;
        nama = n;
    }
    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String namaHewan = scanner.nextLine();

        System.out.print("Ras: ");
        String rasHewan = scanner.nextLine();

        HewanPeliharaan hewan = new HewanPeliharaan(rasHewan, namaHewan);

        hewan.display();

        scanner.close();
    }
}
