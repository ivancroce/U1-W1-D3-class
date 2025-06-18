package exs2;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        // fixed SIM (this one won't change)
        SIM mySim = new SIM("+353 051828139");
        mySim.addCredit(10);
        // mySim.printSIMData();

        Call[] callHistory = new Call[5];

        callHistory[0] = new Call(5, "0123419028");
        callHistory[1] = new Call(3, "23142231321");
        callHistory[2] = new Call(1, "1214244142");
        callHistory[3] = new Call(2, "5661212321");
        callHistory[4] = new Call(4, "98977826134");

        mySim.setLastFiveCalls(callHistory);
        mySim.printSIMData();
    }
}
