public class CreditCard {
    private Money balance;
    private final Money creditLimit;
    private final Person owner;

    // TASK #2.2
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit); 
        this.balance = new Money(0.0);    
    }

    // TASK #2.3
    public Money getBalance() {
        return new Money(this.balance);
    }

    // TASK #2.3: Return a new Money object via copy constructor for security
    public Money getCreditLimit() {
        return new Money(this.creditLimit);
    }

    // TASK #2.4
    public String getPersonals() {
        return owner.toString();
    }

    // TASK #2.5
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // TASK #2.6
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
