from datetime import date
from storable import Storable

class Client(Storable):
    def __init__(self, name, bday, CNP, address, gender, height):
        self.name = name
        self.bday = bday
        self.CNP = CNP
        self.address = address
        self.gender = gender
        self.height = height
        self.accounts = []

    def add_account(self, account):
        self.accounts.append(account)

    def remove_account(self, iban):
        for acc in self.accounts:
            if acc.get_IBAN() == iban:
                self.accounts.remove(acc)
                return True
        return False

    def print_accounts(self):
        print(f"Accounts for {self.name}:")
        for a in self.accounts:
            print(f" - {a.get_IBAN()} | Balance: {a.get_amount()}")

    def __lt__(self, other):
        if self.name != other.name:
            return self.name < other.name
        if self.bday != other.bday:
            return self.bday < other.bday
        if self.gender != other.gender:
            return self.gender < other.gender
        return self.height < other.height

    def __eq__(self, other):
        return (
            self.name == other.name and
            self.bday == other.bday and
            self.gender == other.gender and
            self.height == other.height
        )

    def __str__(self):
        return f"{self.name} | {self.bday} | {self.gender} | {self.height}"

    def store(self, file):
        try:
            with open(file, "a") as f:
                f.write(str(self) + "\n")
        except Exception as e:
            print("Error storing client:", e)