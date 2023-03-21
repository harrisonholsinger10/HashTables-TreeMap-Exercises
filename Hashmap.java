import java.util.Hashtable;

public class Hashmap {

    public static void main(String args[]){

        Hashtable<String, String> table = new Hashtable<>(10);

        table.put("100", "Student1");
        table.put("101", "Student2");
        table.put("102", "Student3");
        table.put("103", "Student4");
        table.put("104", "Student5");
        table.put("105", "Student6");
        table.put("555", "Student7");

        System.out.println("Student5 and Student7 share the same bucket, but can still be referenced separately:");
        System.out.println(table.get("555"));
        System.out.println(table.get("104"));
        System.out.println();

        System.out.println("Print Hashtable with corresponding index and key value pair");
        for (String key : table.keySet()){

            System.out.println("Index " + key.hashCode() % 10 + ":\t" + "(" + key + ", " +
                    table.get(key) + ")");
        }
    }
}
