package flyweight;
import java.util.HashMap;
public class PixelFactory {

    HashMap<Integer, PixelInterface> map = new HashMap<>();

    public PixelInterface getRow(int i)
    {
        PixelInterface r = null;
        //If the map contains key, it returns the object corresponding to the key
       if(map.containsKey(i))
       {
           r = map.get(i);
           return r;
       }
       //If map doesn't contain the key, it creates the new object, adds it to the hashmap and returns the object
       else {
           r = new ConcretePixel(i);
           map.put(i,r);
           return r;
       }
    }

    //To verify that 6 objects are added to the map
   /* public void ShowList()
    {
        for ( Integer key : map.keySet() ) {
            System.out.println( key );
        }

    }*/


}
