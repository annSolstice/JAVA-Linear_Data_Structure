package Project_UAS;

import java.util.Scanner;

public class Main { //Deklarasi kelas Main  

    static QueueLO<Pasien> antrian; //deklarasi variabel antrian bertipe QueueLO 
    private int urutan = 0; //deklarasi variabel urutan dgn tipe data int
    private static int jenis; //deklarasi variabel jenis dgn tipe data int

    public static void main(String[] args) {
        antrian = new QueueLO<>(); //nilai antrian = objek milik QueueLO nantinya
        Scanner sc = new Scanner(System.in);
        Main m = new Main(); //Membuat objek m dari kelas Main
        /* Perulangan Do…while, untuk mengulang statement sebanyak satu kali terlebih dahulu, kemudian akan mengecek statement didalam while 
         apakah bernilai benar, jika bernilai benar maka akan diulang kembali*/
        do {
            System.out.println("----------------------------------------------------------------");
            System.out.println("- - - - - - - INSTALASI FARMASI SEHAT SENTOSA MEDIKA - - - - - -");
            System.out.println("----------------------------------------------------------------");

            //Mencetak header dan daftar menu program dan meminta inputan jenis layanan dari user
            String[] nLayanan = {"Tambah Antrian", "Lihat Antrian", "Panggil Antrian", "Cari Antrian", "Exit"};
            System.out.println("- - - - - - - - - - - - - - MENU UTAMA - - - - - - - - - - - - -");
            System.out.println("1. " + nLayanan[0] + " \n2. " + nLayanan[1] + " \n3. " + nLayanan[2] + " \n4. " + nLayanan[3]
                    + " \n5. " + nLayanan[4]);

            System.out.print("Masukkan Jenis Layanan \t: ");
            jenis = sc.nextInt();

            switch (jenis) { //Deklarasi perulangan switch dengan parameter jenis
                case 1: //jika variabel jenis bernilai 1, akan mengakses data dari method input()
                    m.input();
                    break;
                case 2: //jika variabel jenis bernilai 2, akan mengakses data dari method cetak()
                    m.cetak();
                    break;
                case 3: //jika variabel jenis bernilai 3, akan mengakses data dari method panggil()
                    m.panggil();
                    break;
                case 4: //jika variabel jenis bernilai 4, akan mengakses data dari method cari()
                    m.cari();
                    break;
                case 5: //jika variabel jenis bernilai 6, akan mengakses data dari method exit()
                    m.exit();
                    break;
                default:
                    System.out.println("Masukkan Anda Salah");
            }
        } while (jenis != 0);
    }

    public void input() { //Deklarasi method input
        Scanner sc = new Scanner(System.in);
        //Deklarasi variabel nama, alamat, poli dan noRm
        String nama = null;
        String alamat = null;
        String poli = null;
        int noRm = 0;
        //Menampilkan tulisan dan user mengisi nilai dari masing-masing variabel
        System.out.print("Masukkan Nama \t\t: ");
        nama = sc.next();
        System.out.print("Masukkan Alamat \t: ");
        alamat = sc.next();
        System.out.print("Masukkan Poli \t\t: ");
        poli = sc.next();
        System.out.print("Masukkan No. RM \t: ");
        noRm = sc.nextInt();
        System.out.println("");

        urutan++;
        antrian.enqueue(new Pasien(urutan, nama, alamat, poli, noRm));
        //Memanggil method enqueue dari objek antrian dengan paramater kelas Pasien dan memanggil nilai dari variabel urutan, nama, alamat,poli, noRm
    }

    public void cetak() { //Deklarasi method cetak
        if (antrian.isEmpty() != true) { //Percabangan if, jika kondisi antrian.isEmpty()!= true, maka
            System.out.println("");
            System.out.println("- - - - - - - - - - - - - - - - - Daftar Antrian - - - - - - - - - - - - - - - -");
            System.out.println("================================================================================");
            System.out.println("No\t||Nama \t\t\t||Alamat \t\t||Poli \t\t||No. RM");
            antrian.toString(); //Memanggil method toString dari objek antrian
        } else { //jika if diatas bernilai false, maka
            System.out.println("");
            System.out.println("Antrian Telah Kosong");
        }
    }

    public void panggil() { //Deklarasi method panggil
        antrian.dequeue(); //Memanggil method dequeue() melalui objek antrian
        System.out.println("Telah dikeluarkan dari antrian");
    }
    public void cari() { //Deklarasi method cari
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Masukkan no. RM : ");
        int iden = sc.nextInt();
        
        if (antrian != null) { //Percabangan if, jika kondisi antrian != null bernilai true, maka
            System.out.println("Data Pendaftar dengan nomor Rekam Medis : " +iden+ " ditemukan");
            System.out.println("Sedang dalam proses atau dalam antrian");
           // antrian.toString();
        } else { //jika if diatas bernilai false, maka
            System.out.println("Data Pendaftar dengan nomor Rekam Medis : " +iden+ " tidak ditemukan");
            System.out.println("Sudah dilayani atau belum terdaftar");
        }
    }
    static void exit() { //Deklarasi method exit, maka program selesai
        System.out.println("- - - - - - - - - - - Keluar Dari Program - - - - - - - - - - -");
        System.out.println("---------------------------------------------------------------");
        System.out.println("- - - - - - - - - - - Silahkan Menunggu - - - - - - - - - - - -");
        System.out.println("---------------------------------------------------------------");
        System.out.println("- - - - - - - - - - - SEMOGA LEKAS SEMBUH - - - - - - - - - - -");
        System.out.println("---------------------------------------------------------------");
        System.exit(0);
    }
}
