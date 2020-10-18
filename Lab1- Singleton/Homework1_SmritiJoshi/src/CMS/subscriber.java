/******* Name: Smriti Joshi   Neptune Code: Y7YQ4L***************/
package CMS;

public class subscriber {

    protected String name;

    //Definition of the constructor
    public subscriber(String name)
    {this.name = name; }

   /* public String toString()
    {
        return name+ " ";
    }*/
    //Recieves the notification for new message
    public void update(String name, String title)
    {
        System.out.println(name+":"+title);
    }
}
