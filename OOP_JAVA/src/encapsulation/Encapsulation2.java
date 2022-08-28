package encapsulation;

// Java program to demonstrate encapsulation
class Encapsulate {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String geekName;
    private int geekRoll;
    private int geekAge;

    // get method for age to access
    // private variable geekAge
    public int getAge() {
        return geekAge;
    }

    // get method for name to access
    // private variable geekName
    public String getName() {
        return geekName;
    }

    // get method for roll to access
    // private variable geekRoll
    public int getRoll() {
        return geekRoll;
    }

    // set method for age to access
    // private variable geekage
    public void setAge(int newAge) {
        geekAge = newAge;
    }

    // set method for name to access
    // private variable geekName
    public void setName(String newName) {
        geekName = newName;
    }

    // set method for roll to access
    // private variable geekRoll
    public void setRoll(int newRoll) {
        geekRoll = newRoll;
    }
}

class Name {

    private int age; // Private is using to hide the data

    public int getAge() {
        return age;
    } // getter

    public void setAge(int age) {
        this.age = age;
    } // setter
}

class Account {
    //private data members to hide the data
    private long acc_no;
    private String name, email;
    private float amount;

    //public getter and setter methods
    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

}

public class Encapsulation2 {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);

        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);


        Name n1 = new Name();

        n1.setAge(19);

        System.out.println("The age of the person is: "
                + n1.getAge());


        //creating instance of Account class
        Account acc = new Account();
        //setting values through setter methods
        acc.setAcc_no(7310805450L);
        acc.setName("MD FAIZ");
        acc.setEmail("mdfaiz689@gmail.com");
        acc.setAmount(100000f);
        //getting values through getter methods
        System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
    }
}

