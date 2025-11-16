from datetime import date
from address import Address
from client import Client
from debit_account import DebitAccount
from credit_account import CreditAccount

def main():
    address = Address("Bucharest", 10, "Main Street")
    address1 = Address("Malta", 11, "SECONDS Street")
    address2 = Address("Aici", 12, "Second Street")
    address3 = Address("Acolo", 13, "Third Street")

    c1 = Client("Alice", date(1998, 5, 12), "1091", address, "F", 1.70)
    c2 = Client("Bob", date(1997, 8, 22), "2134", address1, "M", 1.80)
    c3 = Client("Charlie", date(1995, 3, 10), "21314", address2, "M", 1.75)
    c4 = Client("Alice", date(2000, 1, 1), "21314", address3, "F", 1.65)

    print("\n--- Individual compareTo() equivalent tests ---")
    print("Different names (Alice vs Bob):", c1 < c2)
    print("Same name, different birthday (Alice 1998 vs Alice 2000):", c1 < c4)

    people = [c1, c2, c3, c4]
    print("\n--- Before sorting ---")
    for p in people:
        print(p)

    people.sort()

    print("\n--- After sorting ---")
    for p in people:
        print(p)

    debit = DebitAccount("RO1BNK01", 1000)
    credit = CreditAccount("RO1BNK02", 500, 1000)
    c1.add_account(debit)
    c1.add_account(credit)

    c1.print_accounts()

    c1.store("clients.txt")
    c2.store("clients.txt")
    print("\nClients written to file 'clients.txt'")

if __name__ == "__main__":
    main()