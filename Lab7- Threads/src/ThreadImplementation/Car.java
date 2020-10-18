package ThreadImplementation;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Car extends Thread {
    int randomID;
    Intersection obj;

    public Car(Intersection objIn, int idIn) {
        this.randomID = idIn;
        this.obj = objIn;
    }

    public void run() {
        //Takes three seconds to enter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now) + " Car " + randomID + " is approaching the intersection");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("got interrupted!");
            }
            obj.crossInt(randomID);
            //Takes one second to exit
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("got interrupted!");
            }
            obj.leaveInt(randomID);

    }
}
