package proxyPrgm;

public class DemoClass {
    public static void main(String[] args)
    {
        //New set of rules in the office
        Rule defaultRule = new Rule();

        //New worker is of type Employee, gets default rules for Employee
        Worker Em = defaultRule.getRule("Employee");

        //new Proxy Object
        Internet internet = new Proxy();
        System.out.println("\nEmployee 1:");
        //Employee connects to abc.org
        internet.connectTo("abc.org", Em);
        //Employee can't connect to facebook.com
        internet.connectTo("facebook.com",Em);
        //Employee can't connect to youtube.com
        internet.connectTo("youtube.com",Em);

        System.out.println("\nEmployee 1(updated rules):");
        //In the banned list, xyz.in is also added
        Em.AddRule("xyz.in");
        //Employee can't access xyz.in
        internet.connectTo("xyz.in", Em);

        System.out.println("\nEmployee 2(cloning rules from Em1 and updating the list):");
        Worker Em2 = Em.clone();
        Em2.AddRule("hjk.hu");
        internet.connectTo("hjk.hu",Em2);
        internet.connectTo("xyz.in", Em2);

        System.out.println("\nNote: Demonstrating that Employee 1 can access website blocked for Employee 2\n\nEmployee 1:");
        internet.connectTo("hjk.hu", Em);

        //New worker is of type Manager, gets default rules for Manager
        Worker Man = defaultRule.getRule("Manager");

        System.out.println("\nManager 1:");
        //Access to facebook.com is blocked
        internet.connectTo("facebook.com",Man);

        //New worker is of type Boss, gets default rules for Boss
        Worker Bo = defaultRule.getRule("Boss");

        System.out.println("\nBoss 1:");
        //No rules, can access facebook.com
        internet.connectTo("facebook.com",Bo);
    }
}
