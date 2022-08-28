package inheritance;

interface classX {
    public void print_geek();
}

interface classY {
    public void print_for();
}

interface classZ extends classX, classY {
    public void print_geek();
}
class child implements classZ {
    @Override public void print_geek()
    {
        System.out.println("Geeks");
    }

    public void print_for() { System.out.println("for"); }
}

public class MultipleInheritance {
    public static void main(String[] args)
    {
        child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}
