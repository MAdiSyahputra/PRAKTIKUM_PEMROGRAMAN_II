import java.util.Scanner;
public class PRAK101_2210817210017_MAdiSyahputra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap Anda: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan Tempat Kelahiran Anda: ");
        String tempatLahir = input.nextLine();

        System.out.print("Masukkan Tanggal Kelahiran Anda: ");
        int tanggalLahir = input.nextInt();

        System.out.print("Masukkan Bulan Kelahiran Anda: ");
        int bulanLahir = input.nextInt();

        System.out.print("Masukkan Tahun Kelahiran Anda: ");
        int tahunLahir = input.nextInt();

        System.out.print("Masukkan Tinggi Badan Anda (dalam cm): ");
        int tinggiBadan = input.nextInt();

        System.out.print("Masukkan Berat Badan Anda (dalam kilogram): ");
        double beratBadan = input.nextDouble();

        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.println("Halo, Nama Saya " + namaLengkap + ". Saya Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + namaBulan[bulanLahir - 1] + " " + tahunLahir + ".");
        System.out.println("Tinggi Badan Saya " + tinggiBadan + " cm dan Berat Badan Saya " + beratBadan + " kilogram.");
    }
}
