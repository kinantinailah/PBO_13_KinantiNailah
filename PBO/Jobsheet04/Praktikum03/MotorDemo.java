public class MotorDemo {
    public static void main(String[] args) {
        motor motor1 = new motor();
        motor1.platNomor = "N 417 AH";
        int kecepatanBaru = 50;

        if(!motor1.statusMesin && kecepatanBaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else {
            motor1.kecepatan = kecepatanBaru;
        }
        motor1.displayInfo();

        motor motor2 = new motor();
        motor2.platNomor = "K 1242 TI";
        motor2.statusMesin = true;
        kecepatanBaru = 40;
        if(!motor2.statusMesin && kecepatanBaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else {
            motor2.kecepatan = kecepatanBaru;
        }
        motor2.displayInfo();  
        
        motor motor3 = new motor();
        motor3.platNomor = "N 0467 AP";
        kecepatanBaru = 60;
        if(!motor3.statusMesin && kecepatanBaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else {
            motor3.kecepatan = kecepatanBaru;
        }
        motor3.displayInfo();
    }
    
}
