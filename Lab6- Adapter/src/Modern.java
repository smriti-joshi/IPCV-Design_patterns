public class Modern implements ModernDatabase {
    String Author;
    String Title;
    String Location;
    public Modern(String Authorname, String TitleName, String LocationName)
    {
        Author = Authorname;
        Title = TitleName;
        Location = LocationName;
    }

    public String getAuthor() {
        return Author;
    }
    public String getTitle(){
        return Title;
    }
    public String getLocation(){
        return Location;
    }
}
