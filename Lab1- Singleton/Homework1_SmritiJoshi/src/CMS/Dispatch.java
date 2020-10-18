/******* Name: Smriti Joshi   Neptune Code: Y7YQ4L***************/
package CMS;

public class Dispatch {
    protected static Dispatch global_ptr = null;
    protected String topic;
    private Dispatch(){};

    //Function to create object of the Dispatch class
    public static Dispatch Instance()
    {
        if(global_ptr ==null)
            global_ptr = new Dispatch();
        return global_ptr;
    }

    //Function to add a message and notify the observers
    public void sendMessage(Topic title, String message)
    {
        title.addMessage(message);
        title.notifyObservers();

    }

    //Function that lets observers to subscribe to a topic
    public void subscribe(subscriber obj, Topic title)
    {
        title.subscribe(obj);
    }
}
