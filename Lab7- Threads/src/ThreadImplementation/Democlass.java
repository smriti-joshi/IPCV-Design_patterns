package ThreadImplementation;

import java.util.Random;

public class Democlass {
    public static void main(String[] args) {
        Intersection inter = new Intersection();
        Random random = new Random();
        new Car(inter,random.nextInt()).start();
        new Car(inter,random.nextInt()).start();
        new Car(inter,random.nextInt()).start();
        new Car(inter,random.nextInt()).start();
        new Car(inter,random.nextInt()).start();

    }
}
