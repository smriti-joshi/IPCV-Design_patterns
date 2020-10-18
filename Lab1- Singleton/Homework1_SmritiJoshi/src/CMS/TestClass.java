/******* Name: Smriti Joshi   Neptune Code: Y7YQ4L***************/
package CMS;

public class TestClass {
    public static void main(String[] args)
    {
        //Topic for storing messages
        Topic newspaper = new Topic();
        Topic radio = new Topic();
        Topic googlenews = new Topic();

        //Subscribers for topics

        //NS: Newspaper R: Radio
        subscriber one = new subscriber("NS1");
        subscriber two = new subscriber("NS2");
        subscriber three = new subscriber("R1");
        subscriber four = new subscriber("R2");

        //Adding subscribers NS1 and NS2 to newspaper and R1 and R2 to radio
        Dispatch.Instance().subscribe(one, newspaper);
        Dispatch.Instance().subscribe(two,newspaper);
        Dispatch.Instance().subscribe(three,radio);
        Dispatch.Instance().subscribe(four,radio);

        /*******Sending messages to topics*****/
        //Objects NS1 and NS2 are subscribed to newspaper, when a message is sent, they display the new message
        Dispatch.Instance().sendMessage(newspaper, "Earthquake reported in NCR area\n");

        //Objects R1 and R2 are subscribed to radio. When a message is sent, they display the new message
        Dispatch.Instance().sendMessage(radio, "Taylor Swift releases a new album\n");

        //There are no subscribers to googlenews. Therefore, this message does not show in the output
        Dispatch.Instance().sendMessage(googlenews, "Restriction on numbers of pets in the household\n");

        //Add another message to radio, observers recieve notification for the last message added
        Dispatch.Instance().sendMessage(radio, "ABCD\n");
    }
}
