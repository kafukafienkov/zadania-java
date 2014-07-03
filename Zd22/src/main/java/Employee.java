
public class Employee {

    private String firstName;

    private String lastName;

    private int age;

    private double salary;

    public Employee(){

    }

    public Employee(String fName, String lName, int a, double sal){
        firstName = fName;
        lastName = lName;
        age = a;
        salary = sal;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void chgSalary(double percent){
        double perc = percent;
        salary += salary*(perc / 100);
    }

    public String toString(){
        return (firstName + " " + lastName + " " + age + " " + salary);
    }
}
