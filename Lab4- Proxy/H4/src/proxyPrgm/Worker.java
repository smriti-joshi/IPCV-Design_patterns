package proxyPrgm;
import java.util.ArrayList;

public class Worker {

    //Every prototype object has a list of rules- banned sites
    public ArrayList<String> ListRules;

    //Whenever a prototype object is created, it gets its list of rules
    public Worker(ArrayList<String> Rules)
    {
        ListRules = new ArrayList<>();
        ListRules = Rules;
    }

    //Getter function to access list of rules
    public ArrayList getRuleList()
    {
        return ListRules;
    }

    //Returns the clone of object
    public Worker clone()
    {
        Worker newProto = new Worker((ArrayList<String>)this.getRuleList().clone());
        return  newProto;
    }
    //Adds to the list of rules in the ListRules arraylist
    public void AddRule(String newRule)
    {
       ListRules.add(newRule);
    }
}
