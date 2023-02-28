public class Employee {

    private final int id;
    private int salary;
    String firstName, lastName;


    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Use IDE to auto generate the required getters and setters
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {       // User defined method to return concatenated name
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // User defined method to return annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // User defined method to increase then return salary by the percent
    public int raiseSalary(int percent) {
        return salary *= (percent + 100) / 100.0;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                "," + "name=" + getName() +
                "," + "salary=" + salary +
                "]";
    }


}
