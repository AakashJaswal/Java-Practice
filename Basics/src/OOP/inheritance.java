package OOP;

class SuperClass {
    void eat() {
        System.out.println("Eating");
    }
}

class SubClass extends SuperClass {
    void bark() {
        System.out.println("Woof");
    }
}

class Inheritance {
    public static void main(String[] args) {
        SubClass b = new SubClass();
        b.eat();
        b.bark();
    }
}
