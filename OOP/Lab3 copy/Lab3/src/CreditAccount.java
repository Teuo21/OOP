public class CreditAccount extends Account {
    private int maxCredit;

    public CreditAccount(String IBAN, int amount, int maxCredit) {
        super(IBAN, amount);
        this.maxCredit = maxCredit;
    }

    @Override
    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= (getAmount() + maxCredit)) {
            this.amount -= amount;
            return true;
        }
        return false;
    }
}