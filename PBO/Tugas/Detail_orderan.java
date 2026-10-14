public class Detail_orderan {
    private int jumlah;
    private Menu menu;

    public Detail_orderan(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int hitSubtotal() {
        return menu.getHarga() * jumlah;
    }

    public String getInfo() {
        return  menu.getInfo() + ", Jumlah: " + jumlah + ", Total: Rp" + hitSubtotal() + "\n";
    }
}