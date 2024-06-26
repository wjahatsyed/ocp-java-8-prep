package chapter_02.design_principles.creational_design_patterns.singleton;

/**
 * Created by Syed Wajahat on 12/12/2019.
 * Using synchronized keyword on getInstance method to make it thread safe
 */
public class VisitorTicketTracker_TS {
    private static VisitorTicketTracker_TS instance;

    private VisitorTicketTracker_TS() {
    }

    public synchronized static VisitorTicketTracker_TS getInstance() {
        if (instance == null) {
            instance = new VisitorTicketTracker_TS();
        }
        return instance;
    }

    public static void main(String[] args){
        VisitorTicketTracker_TS visitorTicketTrackerTs = VisitorTicketTracker_TS.getInstance();

    }
}
