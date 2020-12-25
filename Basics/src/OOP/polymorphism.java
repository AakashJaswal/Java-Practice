package OOP;

class Addition {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class SuperForPolymorphism {
    void print() {
        System.out.println("Super implementation");
    }
}

class SubForPolymorphism extends SuperForPolymorphism {
    void print() {
        System.out.println("Sub implementation");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Addition a = new Addition();
        //Function overloading, static polymorphism
        System.out.println(a.add(1, 2));
        System.out.println(a.add(1, 2, 3));

        //Function overriding,Dynamic polymorphism
        SuperForPolymorphism sp = new SubForPolymorphism();
        sp.print();
    }
}
