package lab5;

import java.time.LocalDate;

public class StackDemo
{
    public static void main(String[] args)
    {
        MyStack<String> myStack = new MyStack<>();
        MyStack<Person> myStack2 = new MyStack<>();
        Person person1 = new Person("Francesco", LocalDate.of(1989, 5, 11), "male", 379);
        Person person2 = new Person("Ghica", LocalDate.of(1760, 9, 21), "female", 167);
        Person person3 = new Person("Makar", LocalDate.of(2050, 6, 18), "male", 176);
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        myStack2.push(person1);
        myStack2.push(person2);
        myStack2.push(person3);

        myStack.print();
        myStack2.print();

    }
}
