public class Anggota {
    private String nomorKTP;
    private String nama;
    private long limitPinjaman;
    private long jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, long limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getLimitPinjaman() {
        return limitPinjaman;
    }

    public long getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(long nominal) {
        if (nominal <= 0) {
            System.out.println("Maaf, nominal pinjaman harus lebih dari 0.");
        } else if (jumlahPinjaman + nominal > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += nominal;
        }
    }

    public void angsur(long nominal) {
        if (nominal <= 0) {
            System.out.println("Maaf, nominal angsuran harus lebih dari 0.");
        } else if (nominal < 0.1 * jumlahPinjaman) {
            
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else if (nominal > jumlahPinjaman) {
            System.out.println("Maaf, angsuran melebihi jumlah pinjaman.");
        } else {
            jumlahPinjaman -= nominal;
        }
    }
}