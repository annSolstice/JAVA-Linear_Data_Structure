
package Project_UAS;

public class Pasien implements Comparable<Pasien> {
    private String nama, alamat, poli;
    private int rm, no;

    public Pasien() {
    }

    public Pasien(String nama) {
        this.nama = nama;
    }
    
    public Pasien(int rm) {
        this.rm = rm;
    }
    
    public Pasien(int no, String nama, String alamat, String poli, int rm) {
        this.no = no;
        this.nama = nama;
        this.alamat = alamat;
        this.poli = poli;
        this.rm = rm;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPoli() {
        return poli;
    }

    public void setPoli(String poli) {
        this.poli = poli;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    
    @Override
    public String toString() {
        return no+" \t||" +nama+" \t\t||" +alamat+ " \t\t||" +poli+ " \t\t||" +rm;
    }
    
    @Override
    public int compareTo(Pasien o) {
        if (rm == ((Pasien) o).getRm()) {
            return 0;
        } else if (rm > ((Pasien) o).getRm()) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
