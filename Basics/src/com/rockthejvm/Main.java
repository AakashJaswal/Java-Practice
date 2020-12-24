package com.rockthejvm;

//Java class should have one public class, with static main method with below signature.

public class Main {
    public static void main(String[] args) {

        //basic printing
        System.out.println("Hello from JAVA");

        // Variable
        int aNumber = 4;
        double test = 4 / 0.0;
        System.out.println(test);


        //Primitive types
        boolean aTruthValue = true; /// 1 bit
        char anChar = 'a'; // 2 bytes
        int anInteger = 20; // 4 bytes
        float aDecimal = 2.3f; // 4 bytes
        long aBigInteger = 1231211234343L; // 8 bytes
        double aDouble = 3.14; // double precision 8 bytes

        //String, reference type, uses + for concatenating
        String aString = "bleh bleh";


        //expression
        int mulInt = 2 * 3;
        int divInt = 7 / 3;
        //System.out.println(divInt);
        int remainder = 7 % 3;


        //working with decimal better to have double type
        double aResult = 7.0 / 3;
        //System.out.println(aResult);

        //Summation
        aNumber += 6;


        //Simple If Else
        int num = 24;
        if (num < 25) {
            System.out.println("right time to get that certification");
        } else {
            System.out.println("Jump on the guns yo!");
        }


        //While loop
        int counter = 0;
        while (counter < 10) {
            //System.out.println(++counter);
            ++counter;
        }


        //Do-While
        int newCounter = 1;
        do {
            //init hear maybe
            //System.out.println(newCounter++);
            newCounter++;
        } while (newCounter < 10);
        {
            //System.out.println(newCounter++);
            newCounter++;
        }

        int[] ar = {1,2,3,4};

        //Simple for loop
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+ " ");
        }
        System.out.println();
        //For Each loop
        for(int a : ar){
            System.out.print(a + " ");
        }


        //Class
        Person Jazz = new Person("Aakash", 24);
        Person Jim = new Person("Jim", 34);


        //Arrays
        Person[] persons = new Person[2];
        persons[0] = Jazz;
        persons[1] = Jim;


        //ForEach Loop
        for (Person person : persons) {
            System.out.println("\n");
            person.printNameAndAge();
        }

        //Static members and methods, no need ot instantiate class to access this
        boolean canFly = Person.canFly;


    }//end of main
}

class Person {
    String userName;
    int age;
    //Shared. if you make a method static it can only access static vals
    static boolean canFly = false;
    //access modifiers
    //Public, Private, protected and no modifier(can only access in package)
    private String secret = "some pass";

    Person(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void printNameAndAge() {
        System.out.println("My name is: " + this.userName + "\nMy age is: " + this.age);
    }
}




