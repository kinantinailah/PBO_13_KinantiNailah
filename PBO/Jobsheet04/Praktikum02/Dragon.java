public class Dragon {
    int x, y, direction;

    public Dragon(int newx, int newy, int newDirection) {
        x = newx;
        y = newy;
        direction = newDirection;
    }
    
    public void changeDirection(int newDirection) {
        direction = newDirection;
    }

    public void move(int steps) {
        switch (direction) {
            case 0:
                System.out.println("Dragon tidak bergerak");
                break;
            case 1:
                y += steps;
                System.out.println("ke atas "+ steps);
                break;
            case 2:
                x += steps;
                System.out.println("ke kanan "+ steps);
                break;
            case 3:
                y -= steps;
                System.out.println("ke bawah "+ steps);
                break;
            case 4: 
                x -= steps;
                System.out.println("ke kiri"+ steps);
                break;
        }
    }

    public void printStatus(){
        System.out.println("Steps : " + direction);
        System.out.println("Dragon : (" + x + ", " + y + ")");
        System.out.println("======================================");


    }

}
