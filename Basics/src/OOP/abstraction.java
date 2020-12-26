package OOP;

abstract class AbsClass {
    abstract void print();

    void nonAbstractPrint() {
        System.out.println("implementation in abstract");
    }
}

class abstraction extends AbsClass {
    void print() {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        abstraction abs = new abstraction();
        abs.print();
        abs.nonAbstractPrint();
    }
}
