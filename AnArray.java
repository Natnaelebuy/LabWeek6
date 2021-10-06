import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class AnArray {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<String, Integer>(4);

//print ages hash map
System.out.println("ages = " + ages);

//intial 3 myfriends

ages.put("Hawaz", 19);
ages.put("Yordanos", 21);
ages.put("Yonatan", 20);
ages.put("Gelila", 18);

Integer TomAge = ages.get("Tom");
System.out.println("TomAge = " + TomAge);

for (Integer value : ages.values())
System.out.println(value);

/// create an array 5 strings 
String[] person = new String[5]; // Creating a new Array of Size 5 
            person[0] = "Hawaz";   
            person[1] = "Yonatan";  
            person[2] = "Yordanos";  
            person[3] = "Jose";  
            person[4] = "Gelila";  
            System.out.println("Original Array Elements:" + Arrays.toString(person)); 

            /// create an 5 string into likedlist 
LinkedList<String> ll= new LinkedList<String>();
   // Adding elements to the linked list
		ll.add("Hawaz");
		ll.add("Yonatan");
		ll.addLast("Yordanos");
		ll.addFirst("Jose");
		ll.add(2, "Gelila");

		System.out.println(ll);

		ll.remove("Jose");
		

		System.out.println(ll);

    /// adding my first 4 name in to Queue
    Queue<String> str_queue = new LinkedList<>();
    //initialize the queue with values
    str_queue.add("Hawaz");
    str_queue.add("Yonatan");
    str_queue.add("Yordanos");
    str_queue.add("Jose");

    System.out.println(str_queue);
    
    str_queue.remove("yonatan");


    //print the Queue
    System.out.println("The Queue contents:" + str_queue);
   





    }

    
}
