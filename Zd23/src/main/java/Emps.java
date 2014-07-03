public class Emps {
    private Employee e;
    private Emps next;
    private Emps prev;

    public Emps (Employee c) {
        e = c;
    }

    public Emps getNext() {
        return next;
    }

    public Emps getPrevious() {
        return prev;
    }

    public void setNext(Emps n) {
        next = n;
    }

    public void setPrevious (Emps p) {
        prev = p;
    }

    public Employee getEmployee(){
        return e;
    }

    public void setEmployee (Employee e) {
        this.e = e;
    }
}
