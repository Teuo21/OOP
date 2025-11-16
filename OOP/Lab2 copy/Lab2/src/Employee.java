import java.util.*;

class Employee {
    private String name;
    private String surname;
    private int age;
    private String address;

    public Employee(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

class SearchEmployee {
    public static void main (String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Max", "Later", 20, "st. Ola"));
        employeeList.add(new Employee("Rax", "Mater", 24, "st. Porto"));
        employeeList.add(new Employee("Tax", "Pater", 30, "st. Bala"));
        employeeList.add(new Employee("Fax", "Scatter", 41, "st. Ala"));
        employeeList.add(new Employee("Lax", "Capetenia", 10, "st. Sefu"));

        Map<String, Employee> employeeMap = new HashMap<String, Employee>();
        for(Employee e : employeeList) {
            employeeMap.put(e.getName(), e);
        }
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the employee : ");
            String name = sc.nextLine();
            if (employeeMap.containsKey(name)) {
                System.out.println("\nEmployee found:\n" + employeeMap.get(name));
            } else {
                System.out.println("\nNo employee found with that name.");
        }
    }
}