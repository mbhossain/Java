public class GenericsClass {
    public static void main(String args[]) {
        GenericsClassTemplate<Integer> m = new GenericsClassTemplate<Integer>();
        m.add(2); //m.add("vivek"); Compile time error

        System.out.println("Result1:" + m.get());
    }
}
