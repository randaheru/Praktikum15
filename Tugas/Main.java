import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemNilai sistem = new SistemNilai();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Menambahkan beberapa data mahasiswa dan mata kuliah
        sistem.tambahMahasiswa("20001", "Tha lhah", "021xxx");
        sistem.tambahMahasiswa("20002", "Zubair", "021xxx");
        sistem.tambahMahasiswa("20003", "Abdur-Rahman", "021xxx");
        sistem.tambahMahasiswa("20004", "Sa'ad", "021xxx");
        sistem.tambahMahasiswa("20005", "Sa'id", "021xxx");
        sistem.tambahMahasiswa("20006", "Ubaidah", "021xxx");

        sistem.tambahMataKuliah("00001", "Internet of Things", 3);
        sistem.tambahMataKuliah("00002", "Algoritma dan Struktur Data", 3);
        sistem.tambahMataKuliah("00003", "Algoritma dan Pemrograman", 3);
        sistem.tambahMataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3);
        sistem.tambahMataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3);

        do {
            System.out.println("=======================================");
            System.out.println(" SISTEM PENGOLAHAN DATA NILAI MAHASISWA ");
            System.out.println("=======================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Tambah Mahasiswa ke Antrian Penghapusan");
            System.out.println("6. Hapus Mahasiswa dari Antrian");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Kode Mata Kuliah: ");
                    String kodeMk = scanner.nextLine();
                    System.out.print("Masukkan Nilai: ");
                    double nilai = scanner.nextDouble();
                    sistem.inputNilai(nim, kodeMk, nilai);
                    break;
                case 2:
                    sistem.tampilNilai();
                    break;
                case 3:
                    System.out.print("Masukkan NIM: ");
                    nim = scanner.nextLine();
                    sistem.cariNilaiMahasiswa(nim);
                    break;
                case 4:
                    sistem.urutDataNilai();
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa yang akan ditambahkan ke antrian penghapusan: ");
                    nim = scanner.nextLine();
                    sistem.antrianHapusMahasiswa(nim);
                    break;
                case 6:
                    sistem.hapusMahasiswa();
                    break;
                case 7:
                    System.out.println("Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 7);

        scanner.close();
    }
}
