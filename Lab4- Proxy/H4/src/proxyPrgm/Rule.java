package proxyPrgm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Rule {
        //Hashmap to store the different kinds of prototypes- Employee, Manager,Boss - created
        public Map<String , Worker> bannedSite;

        //New ArrayList for default values of rules for employee,manager, boss to initialise prototype object with
        public ArrayList<String> Em = new ArrayList();
        public ArrayList<String> Man = new ArrayList();
        public ArrayList<String> Bo = new ArrayList();

        public Rule(){
            bannedSite = new HashMap<>();
            //Adding default rules for Employees
            Em.add("facebook.com");
            Em.add("youtube.com");

            //Adding default rules for Manager
            Man.add("facebook.com");

            //Creating new Prototype Employee with default rulelist
            Worker Employee = new Worker(Em);
            //Creating new Prototype Manager with default rulelist
            Worker Manager = new Worker(Man);
            //Creating new Prototype Boss with default rulelist
            Worker Boss = new Worker(Bo);
            //Putting Prototypes against their keys in hashmap
            bannedSite.put("Employee", Employee);
            bannedSite.put("Manager", Manager);
            bannedSite.put("Boss",Boss);
        }

        //Sends a clone of rules for new worker according to type- 'Employee', 'Worker', 'Boss'
        public Worker getRule(String Worker)
        {
            return bannedSite.get(Worker).clone();
        }
}
