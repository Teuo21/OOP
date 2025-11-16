from account import Account

class CreditAccount(Account):
    def __init__(self, IBAN, amount, max_credit):
        super().__init__(IBAN, amount)
        self.max_credit = max_credit

    def withdraw(self, amount):
        if amount > 0 and amount <= (self.amount + self.max_credit):
            self.amount -= amount
            return True
        return False