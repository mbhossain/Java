package encapsulation;

class Area {

    // fields to calculate area
    int length;
    int breadth;

    // constructor to initialize values
    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class Person {

    // private field
    private int age;

    // getter method
    public int getAge() {
        return age;
    }

    // setter method
    public void setAge(int age) {
        this.age = age;
    }
}


public class Encapsulation {
    public static void main(String[] args) {

        // create object of Area
        // pass value of length and breadth
        Area rectangle = new Area(5, 6);
        rectangle.getArea();

        // create an object of Person
        Person p1 = new Person();

        // change age using setter
        p1.setAge(24);

        // access age using getter
        System.out.println("My age is " + p1.getAge());
    }
}
