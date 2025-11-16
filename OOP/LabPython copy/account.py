from abc import ABC, abstractmethod

class Account(ABC):
    def __init__(self, IBAN, amount):
        self.IBAN = IBAN
        self.amount = amount

    def get_IBAN(self):
        return self.IBAN

    def get_amount(self):
        return self.amount

    def deposit(self, amount):
        if amount > 0:
            self.amount += amount

    @abstractmethod
    def withdraw(self, amount):
        pass

    def __lt__(self, other):
        if self.amount != other.amount:
            return self.amount < other.amount
        return self.IBAN < other.IBAN

    def __eq__(self, other):
        return self.amount == other.amount and self.IBAN == other.IBAN