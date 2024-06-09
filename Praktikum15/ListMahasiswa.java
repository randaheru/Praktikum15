import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMahasiswa {
    private List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        if (index >= 0 && index < mahasiswas.size()) {
            mahasiswas.remove(index);
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void update(int index, Mahasiswa mhs) {
        if (index >= 0 && index < mahasiswas.size()) {
            mahasiswas.set(index, mhs);
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void tampil() {
        for (Mahasiswa mhs : mahasiswas) {
            System.out.println(mhs);
        }
    }

    public void sortAscending() {
        Collections.sort(mahasiswas, (a, b) -> a.getNim().compareTo(b.getNim()));
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, (a, b) -> b.getNim().compareTo(a.getNim()));
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");

        // Menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);

        // Menampilkan list mahasiswa sebelum sorting
        System.out.println("Daftar Mahasiswa sebelum sorting:");
        lm.tampil();

        // Sorting secara ascending
        lm.sortAscending();
        System.out.println("\nDaftar Mahasiswa setelah sorting secara ascending:");
        lm.tampil();

        // Sorting secara descending
        lm.sortDescending();
        System.out.println("\nDaftar Mahasiswa setelah sorting secara descending:");
        lm.tampil();
    }
}
