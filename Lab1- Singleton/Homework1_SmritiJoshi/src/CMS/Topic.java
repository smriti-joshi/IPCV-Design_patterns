/******* Name: Smriti Joshi   Neptune Code: Y7YQ4L***************/

package CMS;
import java.util.ArrayList;
public class Topic
{
    //List of subscribers subscribed to a topic
    protected ArrayList<subscriber> list = new ArrayList<>();

    //List of messages in a topic
    protected ArrayList<String> messageList = new ArrayList<>();

    public Topic()
    {
    }

    //Adds subscribers to a topic
    public void subscribe(subscriber obj)
    {
        list.add(obj);
    }

    //Adds messages to a topic
    public void addMessage(String message)
    {
        messageList.add(message);
    }

    //Removes subscribers from a topic
    public void removeSubscriber(subscriber obj)
    {
        list.remove(obj);
    }

    //Notifies observers that a new topic is added
    public void notifyObservers() {
        for (subscriber o : list) {
            String last;
            last = messageList.get(messageList.size() - 1);
            o.update(o.name, last);
        }
    }

}

