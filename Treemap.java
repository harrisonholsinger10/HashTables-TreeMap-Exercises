import java.util.*;

public class Treemap {

    public static void main(String args[]){

        Hashtable<Integer, String> table2 = new Hashtable<>(10);

        table2.put(555, "Student7");
        table2.put(102, "Student3");
        table2.put(100, "Student1");
        table2.put(104, "Student5");
        table2.put(103, "Student4");
        table2.put(105, "Student6");
        table2.put(101, "Student2");



        // Print hashtable
        System.out.println("Hash Table with the Index Number and Key Value Pair:");
        for (Integer key : table2.keySet()){

            System.out.println("Index " + key.hashCode() % 10 + ":\t" + "(" + key + ", " +
                    table2.get(key) + ")");
        }

        // Convert hashtable into a tree map in order to sort the table
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(table2);

        Set<Integer> keys = tm.keySet();
        Iterator<Integer> itr = keys.iterator();

        System.out.println("\n");
        System.out.println("TreeMap Table with the Hashcode Number and Key Value Pair:");

        while (itr.hasNext()) {
            Integer i = itr.next();
            System.out.println(table2.keySet().hashCode() + " (" + table2.keySet().hashCode() % 10 + ")" +
                    "\t" + "(" + i + ", " + tm.get(i) + ")");
        }

    }
}
