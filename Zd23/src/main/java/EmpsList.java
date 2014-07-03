public class EmpsList {

    private Emps
                first, // pierwszy element na liście
                last;  // ostatni element na liście

    public EmpsList() {
    }

    public void add(Employee e) {
        Emps nowy = new Emps(e);
        if (first == null) first = nowy;
        else {
            last.setNext(nowy);
            nowy.setPrevious(last);
        }
        last = nowy;
    }

    public void showForward() {
        Emps curr = first;
        while (curr != null) {
            Employee e = curr.getEmployee();
            System.out.println(e);
            curr = curr.getNext();
        }
    }

    public void showBackward() {
        Emps curr = last;
        while (curr != null) {
            Employee e = curr.getEmployee();
            System.out.println(e);
            curr = curr.getPrevious();
        }
    }

    public void changeAllSalaries(double p) {
        Emps curr = first;
        while (curr != null) {
            Employee e = curr.getEmployee();
            e.chgSalary(p);
            curr = curr.getNext();
        }
    }
}