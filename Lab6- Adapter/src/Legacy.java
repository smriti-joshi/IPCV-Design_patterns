public class Legacy implements LegacyDatabase {
    String dataString;
    public Legacy(String InDataString)
    {
        dataString = InDataString;
    }
    public String getdataString()
    {
        return dataString;
    }
}
