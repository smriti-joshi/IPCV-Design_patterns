public class Adapter implements ModernDatabase {
    LegacyDatabase data;
    public Adapter(LegacyDatabase dataIn)
    {
        data = dataIn;
    }
    public String getAuthor()
    {
        String[] parts = data.getdataString().split("-");
        return parts[0];
    }
    public String getTitle()
    {
        String[] parts = data.getdataString().split("-");
        return parts[1];
    }
    public String getLocation()
    {
        String[] parts = data.getdataString().split("-");
        return parts[2];
    }
}
