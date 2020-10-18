package proxyPrgm;

public class Proxy implements Internet {
    Internet internet = new RealInternet();
    @Override
    public void connectTo(String website, Worker Worker){
        //Checks whether worker - 'Employee','Manager','Boss' can access the website
        if(Worker.getRuleList().contains(website))
        {
            System.out.println("Access to " + website + " is blocked!");
        }
        else
            {
                //If website is not banned, calls the real Internet class
            internet.connectTo(website,Worker);
        }
    }
}
