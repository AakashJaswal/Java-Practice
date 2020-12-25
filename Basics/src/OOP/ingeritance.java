package OOP;

class A {
    void eat(){System.out.println("Eating");}
}

class B extends A{
    void bark(){System.out.println("Woof");}
}

class main {
    public static void main(String[] args)
    {
        B b = new B();
        b.eat();
        b.bark();
    }

}
