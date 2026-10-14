import java.time.LocalDate;

public class OrderanDemo {
    public static void main(String[] args) {
        Menu nasiGoreng = new Menu("M001", "Nasi Goreng", 20000);
        Menu esTeh = new Menu("M002", "Es Teh", 5000);
        Menu ayamBakar = new Menu("M003", "Ayam Bakar", 25000);

        Orderan order1 = new Orderan(LocalDate.of(2026, 9, 30));
        order1.tambahDetail(nasiGoreng, 2);
        order1.tambahDetail(esTeh, 2);
        System.out.println(order1.getInfo());

        Orderan order2 = new Orderan(LocalDate.of(2026, 10, 1));
        order2.tambahDetail(ayamBakar, 1);
        order2.tambahDetail(esTeh, 1);
        System.out.println(order2.getInfo());

        Orderan order3 = new Orderan(LocalDate.of(2026, 10, 2));
        System.out.println(order3.getInfo());

        this.namaMenu(nasiGoreng) = nasi
    }
}