public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private int harga;

    public Menu(String kodeMenu, String namaMenu, int harga) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public String getKodeMenu() {
        return kodeMenu;
    }

    public void setKodeMenu(String kodeMenu) {
        this.kodeMenu = kodeMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getInfo() {
        return namaMenu + " (" + kodeMenu + ") Rp" + harga;
    }
    
}