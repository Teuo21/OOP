class Address:
    def __init__(self, city, number, street):
        self.city = city
        self.number = number
        self.street = street

    def __str__(self):
        return f"{self.street} {self.number}, {self.city}"