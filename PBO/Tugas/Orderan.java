import java.time.LocalDate;
import java.util.ArrayList;

public class Orderan {
    private LocalDate tanggal;
    private ArrayList<Detail_orderan> daftarDetail;

    public Orderan(LocalDate tanggal) {
        this.tanggal = tanggal;
        this.daftarDetail = new ArrayList<Detail_orderan>();
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public void tambahDetail(Menu menu, int jumlah) {
        Detail_orderan detail = new Detail_orderan(menu, jumlah);
        daftarDetail.add(detail);
    }

    public int hitTotalBayar() {
        int total = 0;
        for (Detail_orderan detail : daftarDetail) {
            total += detail.hitSubtotal();
        }
        return total;
    }

    public String getInfo() {
        String info = "Tanggal: " + tanggal + "\n";

        if (!daftarDetail.isEmpty()) {
            info += "Detail Pesanan:\n";
            for (Detail_orderan detail : daftarDetail) {
                info += detail.getInfo();
            }
        } else {
            info += "Belum ada pesanan\n";
        }

        info += "Total Bayar: Rp" + hitTotalBayar() + "\n";
        return info;
    }
}