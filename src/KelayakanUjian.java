import java.util.Scanner;

public class KelayakanUjian {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Kehadiran (%) : ");
        int kehadiran = scanner.nextInt();

        System.out.print("Nilai tugas   : ");
        int nilaiTugas = scanner.nextInt();

        System.out.print("Dispensasi     : ");
        boolean dispensasi = scanner.nextBoolean();
        // Menghitung tiga versi logika
        boolean a = kehadiran >= 75 && nilaiTugas >= 60 || dispensasi;

        boolean b = (kehadiran >= 75 && nilaiTugas >= 60)
                || dispensasi;

        boolean c = kehadiran >= 75
                && (nilaiTugas >= 60 || dispensasi);

        // Negasi
        boolean tidakDispensasi = !dispensasi;

        // Short-circuit dengan post-increment
        int cek = 0;

        boolean x = (kehadiran >= 75) && (cek++ >= 0);

        boolean y = (nilaiTugas >= 60) || (cek++ >= 0);
    }
}
