public abstract class Account implements Comparable<Account> {
    private String IBAN;
    protected int amount;

    public Account(String IBAN, int amount) {
        this.IBAN = IBAN;
        this.amount = amount;
    }

    public String getIBAN() {
        return IBAN;
    }

    public int getAmount() {
        return amount;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.amount += amount;
        }
    }

    public abstract boolean withdraw(int amount);

    @Override
    public int compareTo(Account o) {
        if (this.amount == 0)
        {
            return 0;
        }
        if (this.amount != o.amount)
        {
            return this.amount - o.amount;
        }
        return this.IBAN.compareTo(o.IBAN);
    }
}