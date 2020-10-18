package proxyPrgm;

public class RealInternet implements  Internet {
    @Override
    public void connectTo(String website, Worker Worker){
        System.out.println("Connecting to " + website);
    }
}
