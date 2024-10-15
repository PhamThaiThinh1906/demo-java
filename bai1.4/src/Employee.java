public class Employee {
    int id;
    String name;
    String lastName;
    int salary;
    public Employee(int id, String name, String lastName, int salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int Salary) {
        this.salary = Salary;
    }
    public int getAnnualSalary(){
        return salary;

    }
    public int raiseSalary(int percentage){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

}
