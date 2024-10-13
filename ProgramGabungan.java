import java.util.Scanner;

public class ProgramGabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih program:");
            System.out.println("1. Deteksi Ganjil atau Genap");
            System.out.println("2. Menentukan Lulus atau Tidak");
            System.out.println("3. Konversi Nilai");
            System.out.println("4. Hitung Pecahan Uang");
            System.out.println("5. Hitung Harga Jeruk");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    ganjilGenap(input);
                    break;
                case 2:
                    lulusTidak(input);
                    break;
                case 3:
                    konversiNilai(input);
                    break;
                case 4:
                    hitungPecahan(input);
                    break;
                case 5:
                    hitungHargaJeruk(input);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
            System.out.println();
        }
    }

    // 1. Program untuk mendeteksi bilangan ganjil atau genap
    public static void ganjilGenap(Scanner input) {
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap.");
        } else {
            System.out.println(angka + " adalah bilangan ganjil.");
        }
    }

    // 2. Program untuk menentukan lulus atau tidak lulus
    public static void lulusTidak(Scanner input) {
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai > 75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }

    // 3. Program untuk konversi nilai A, B, C, D, dan E
    public static void konversiNilai(Scanner input) {
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        char grade;

        if (nilai > 85) {
            grade = 'A';
        } else if (nilai > 75) {
            grade = 'B';
        } else if (nilai > 65) {
            grade = 'C';
        } else if (nilai > 55) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Grade: " + grade);
    }

    // 4. Program untuk menghitung pecahan uang
    public static void hitungPecahan(Scanner input) {
        System.out.print("Masukkan jumlah uang: ");
        int uang = input.nextInt();

        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};
        for (int i = 0; i < pecahan.length; i++) {
            int jumlah = uang / pecahan[i];
            if (jumlah > 0) {
                System.out.println(jumlah + " lembar " + pecahan[i] + "an");
                uang %= pecahan[i];
            }
        }
    }

    // 5. Program untuk menghitung harga jeruk
    public static void hitungHargaJeruk(Scanner input) {
        System.out.print("Masukkan jumlah jeruk yang dibeli: ");
        int jumlah = input.nextInt();
        int totalHarga = 0;

        // Harga jeruk sesuai jumlah yang dibeli
        while (jumlah >= 5) {
            totalHarga += 10000;
            jumlah -= 5;
        }
        while (jumlah >= 2) {
            totalHarga += 5000;
            jumlah -= 2;
        }
        if (jumlah == 1) {
            totalHarga += 3000;
        }

        System.out.println("Total harga: " + totalHarga + " rupiah");
    }
}
