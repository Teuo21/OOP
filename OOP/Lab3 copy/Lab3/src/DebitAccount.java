public class DebitAccount extends Account {

    public DebitAccount(String IBAN, int amount) {
        super(IBAN, amount);
    }

    @Override
    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= this.amount) {
            this.amount -= amount;
            return true;
        }
        return false;
    }
}