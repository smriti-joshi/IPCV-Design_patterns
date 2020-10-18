package ThreadImplementation;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class Intersection {
    LightColor LC;
    boolean cross= true;

    public Intersection() {
        LC = new LightColor(this);
        LC.start();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now) + "Light initialised:" + LC.getColor());
    };

    public synchronized void crossInt(int Id)
    {
        while(cross==false || LC.getColor()=="Red") {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Got interrupted at cross!");
            }
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();
        System.out.println("\n"+dtf.format(now)+ " Color: " + LC.getColor());

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("\n"+dtf.format(now2)+" Car"+Id+" arrived at the intersection");
        cross = false;
    }
    public synchronized void leaveInt(int Id){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now)+" Car "+Id+" has left the intersection");
        cross = true;
        notifyAll();
    }

}
