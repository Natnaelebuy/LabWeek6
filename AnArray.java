import java.util.HashMap;

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
   
//




    }

    
}
