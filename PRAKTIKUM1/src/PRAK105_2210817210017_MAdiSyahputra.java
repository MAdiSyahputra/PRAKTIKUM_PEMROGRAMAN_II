import java.util.Scanner;

public class PRAK105_2210817210017_MAdiSyahputra {
    public static void main(String[] args) {

        final double PI = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung (cm): ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = input.nextDouble();

        double volume = PI * Math.pow(jariJari, 2) * tinggi;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m^3%n", jariJari, tinggi / 100, volume / 1000000);
    }
}
