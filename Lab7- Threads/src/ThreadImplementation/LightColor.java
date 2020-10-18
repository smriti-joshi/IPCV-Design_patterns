package ThreadImplementation;

public class LightColor extends Thread{

    private String color;
    Intersection intersect;

    public LightColor(Intersection intersect)
    {
        this.intersect = intersect;
    }
    @Override
    public void run() {
        while (true)
        {
            color = "Red";
            try {
                Thread.sleep(2500);
            } catch(InterruptedException e) {
                System.out.println("got interrupted!");
            }
            synchronized(intersect){
            color = "Green";
            intersect.notifyAll();}
            try {
                Thread.sleep(2500);
            } catch(InterruptedException e) {
                System.out.println("got interrupted!");
            }
        }
    }
    public synchronized String getColor()
    {
        return color;
    }
}

