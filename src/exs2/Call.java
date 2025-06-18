package exs2;

public class Call {
    // attributes
    // private attributes for a single Call
    // final = when the attribute's value is set only once in the constructor and never changes again.
    // used for attributes that don't have a setter.
    private final int durationMins;
    private final String dialedNumbers;

    // constructor
    // to create a new Call obj
    public Call(int durationMins, String dialedNumbers) {
        this.durationMins = durationMins;
        this.dialedNumbers = dialedNumbers;
    }

    // getter
    // public methods to read the private attributes
    public int getDurationMins() {
        return this.durationMins;
    }

    public String getDialedNumbers() {
        return this.dialedNumbers;
    }
}
