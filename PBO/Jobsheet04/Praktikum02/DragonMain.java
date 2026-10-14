public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon(0, 0, 0);
        System.out.println("Dragon 1 posisi awal : ");
        dragon1.printStatus();
        System.out.println("Dragon 1 bergerak ke kanan 3 langkah : ");
        dragon1.changeDirection(2);
        dragon1.move(3);
        dragon1.printStatus();
        System.out.println("Dragon 1 bergerak ke atas 2 langkah : ");
        dragon1.changeDirection(1);
        dragon1.move(2);
        dragon1.printStatus();

        
 }
}
