package exs2;

public class SIM {
    // attributes
    private final String phoneNumber;
    private double credit;
    private Call[] lastFiveCalls;

    // Constructor
    public SIM(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.credit = 0.0;
        this.lastFiveCalls = new Call[5];
    }

    // methods
    public void addCredit(double newCredit) {
        this.credit += newCredit;
    }

    // setter
    public void setLastFiveCalls(Call[] newCalls) {
        if (newCalls != null && newCalls.length == 5) {
            this.lastFiveCalls = newCalls;
        } else {
            System.out.println("Error: The provided call history is invalid.");
        }
    }

    // method to print
    public void printSIMData() {
        System.out.println("--- SIM DATA ---");
        System.out.println("Phone number: " + this.phoneNumber);
        System.out.println("Available Credit: " + this.credit + "$");
        System.out.println("Last 5 Calls: ");

        // for each to avoid all the 'if' below.
        // it is ideal for read-only operations where the index ('i') is not needed.
        // for (Type variable : collection)
        for (Call call : lastFiveCalls) {
            // Inside the loop, 'call' holds the current element from the array.
            if (call != null) {
                System.out.println(" - Call to: " + call.getDialedNumbers() + "- Duration: " + call.getDurationMins() + " minutes");
            }
        }

        /* if (lastFiveCalls[0] != null) {
            System.out.println(" - Call 1 to: " + lastFiveCalls[0].getDialedNumbers() + " - Duration: " + lastFiveCalls[0].getDurationMins());
        }
        if (lastFiveCalls[1] != null) {
            System.out.println(" - Call 2 to: " + lastFiveCalls[1].getDialedNumbers() + " - Duration: " + lastFiveCalls[1].getDurationMins());
        }
        if (lastFiveCalls[2] != null) {
            System.out.println(" - Call 3 to: " + lastFiveCalls[2].getDialedNumbers() + " - Duration: " + lastFiveCalls[2].getDurationMins());
        }
        if (lastFiveCalls[3] != null) {
            System.out.println(" - Call 4 to: " + lastFiveCalls[3].getDialedNumbers() + " - Duration: " + lastFiveCalls[3].getDurationMins());
        }
        if (lastFiveCalls[4] != null) {
            System.out.println(" - Call 5 to: " + lastFiveCalls[4].getDialedNumbers() + " - Duration: " + lastFiveCalls[4].getDurationMins());
        } */
    }
}
