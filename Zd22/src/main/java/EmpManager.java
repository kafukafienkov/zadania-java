import javax.swing.*;

public class EmpManager {

    public static Employee defEmp(String msg) {

        JOptionPane.showMessageDialog(null, "***Podaj dane o pracowniku***");

        Employee defEmp = new Employee();

        String fName = JOptionPane.showInputDialog(null, "Podaj imię pracownika");
        defEmp.setFirstName(fName);

        String lName = JOptionPane.showInputDialog(null, "Podaj nazwisko pracownika");
        defEmp.setLastName(lName);

        String a = JOptionPane.showInputDialog(null, "Podaj wiek pracownika");
        defEmp.setAge(Integer.parseInt(a));

        String sal = JOptionPane.showInputDialog(null, "Podaj pensję pracownika");
        defEmp.setSalary(Double.parseDouble(sal));

        return defEmp;
    }

    public static void changeSalary(Employee e) {
        String changeSalary = JOptionPane.showInputDialog(null, "O ile % zwiększyć pensje pracownika?");
        e.chgSalary(Integer.parseInt(changeSalary));
    }

    public static void showInfo(Employee e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }

}
