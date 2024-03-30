import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericExample<T> {
    
    private T data;

    public GenericExample(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    // Generic method untuk mencetak semua elemen dalam ArrayList
    public static <E> void printArrayList(List<E> list) {
        for (E element : list) {
            System.out.println(element);  
        }
    }

    // Generic method untuk mencetak semua key dan value dalam HashMap
    public static <K, V> void printHashMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()); 
        }
    }

    public static void main(String[] args) {
        // Membuat instance GenericExample dengan tipe String
        GenericExample<String> stringExample = new GenericExample<>("Hello, World!");
        System.out.println("Data from GenericExample: " + stringExample.getData());

        // Membuat ArrayList dengan tipe Integer
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        // Memanggil generic method printArrayList untuk mencetak ArrayList integerList
        System.out.println("Contents of integerList:");
        printArrayList(integerList);

        // Membuat HashMap dengan tipe String sebagai key dan Integer sebagai value
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("One", 1);
        stringIntegerMap.put("Two", 2);
        stringIntegerMap.put("Three", 3);

        // Memanggil generic method printHashMap untuk mencetak HashMap stringIntegerMap
        System.out.println("Contents of stringIntegerMap:");
        printHashMap(stringIntegerMap);

    }
}