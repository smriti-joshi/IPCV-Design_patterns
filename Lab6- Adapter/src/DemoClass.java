public class DemoClass {
    public static void main(String[] args)
    {
        Database DATABASE = new Database();

        ModernDatabase bookM1 = new Modern("Baba Ramdev","Meditation","6789");
        ModernDatabase bookM2 = new Modern( "Enid blyton","Famous five", "7890");
        ModernDatabase bookL1 = new Adapter(new Legacy("J.K. Rowling-Harry Potter-5467"));
        ModernDatabase bookL2 = new Adapter(new Legacy("Charles Dickens-Tale Of Two Cities-5468"));

        DATABASE.addToDatabase(bookM1);
        DATABASE.addToDatabase(bookM2);
        DATABASE.addToDatabase(bookL1);
        DATABASE.addToDatabase(bookL2);


        DATABASE.getInfoByTitle("Harry Potter");
        DATABASE.getInfoByAuthor("Baba Ramdev");
        DATABASE.getInfoByLocation("5468");

    }
}
