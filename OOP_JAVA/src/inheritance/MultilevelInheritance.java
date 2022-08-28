package inheritance;

class one_ex {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

class two_ex extends one_ex {
    public void print_for() {
        System.out.println("for");
    }
}

class three extends two_ex {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        three g = new three();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
