public class Money {
    private long dollars;
    private long cents;

    // Constructor that accepts a double value
    public Money(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }

    // TASK #1: Copy Constructor
    public Money(Money otherObject) {
        if (otherObject != null) {
            this.dollars = otherObject.dollars;
            this.cents = otherObject.cents;
        }
    }

    public Money add(Money otherAmount) {
        long totalCents = (this.dollars * 100 + this.cents) + (otherAmount.dollars * 100 + otherAmount.cents);
        return new Money(totalCents / 100.0);
    }

    public Money subtract(Money otherAmount) {
        long totalCents = (this.dollars * 100 + this.cents) - (otherAmount.dollars * 100 + otherAmount.cents);
        return new Money(totalCents / 100.0);
    }

    // Compares two Money objects 
    public int compareTo(Money otherObject) {
        long thisTotal = this.dollars * 100 + this.cents;
        long otherTotal = otherObject.dollars * 100 + otherObject.cents;
        return Long.compare(thisTotal, otherTotal);
    }

    // Checks if two Money objects are equal in value
    public boolean equals(Money otherObject) {
        if (otherObject == null) return false;
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    // Formats money
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}