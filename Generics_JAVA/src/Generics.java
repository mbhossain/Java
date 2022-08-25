//Reference: https://www.javatpoint.com/generics-in-java

import java.util.*;

public class Generics {
    public static void main(String args[]) {
        //Generics Advantage: 1. Type-safety:

        //Creating a List
        List list = new ArrayList();

        //Adding elements in the List
        list.add(10);
        list.add("Apple");

        System.out.println("Result1:" + list);

        //With Generics, it is required to specify the type of object we need to store.
        List<Integer> list_generics = new ArrayList<Integer>();
        list_generics.add(10);
        list_generics.add(20);
        list_generics.add(30);

        // compile-time error
        //list.add("Apple");

        //2. Type casting is not required

        //typecasting
        Integer i = (Integer) list.get(0);
        System.out.println("Result2:" + i);
        String s = (String) list.get(1);
        System.out.println("Result3:" + s);

        //no need typecasting
        Integer i_generics = list_generics.get(0);
        System.out.println("Result4:" + i_generics);

        //You can use Generics any collection class such as ArrayList, LinkedList, HashSet, TreeSet, HashMap, Comparator etc.

        Iterator<Integer> itr = list_generics.iterator();
        while (itr.hasNext()) {
            System.out.println("Result5:" + itr.next());
        }

        Iterator<Integer> itr2 = list_generics.iterator();
        while (itr2.hasNext()) {
            System.out.println("Result6:" + itr2.next());
        }

        //Java Generics using Map
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "vijay");
        map.put(4, "umesh");
        map.put(2, "ankit");

        //Now use Map.Entry for Set and Iterator
        Set<Map.Entry<Integer, String>> set = map.entrySet();

        Iterator<Map.Entry<Integer, String>> itr3 = set.iterator();
        while (itr3.hasNext()) {
            Map.Entry e = itr3.next();//no need to typecast
            System.out.println("Result7:" + e.getKey() + " " + e.getValue());
        }
    }
}
