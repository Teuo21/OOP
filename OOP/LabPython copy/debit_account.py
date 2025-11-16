from account import Account

class DebitAccount(Account):
    def withdraw(self, amount):
        if amount > 0 and amount <= self.amount:
            self.amount -= amount
            return True
        return False