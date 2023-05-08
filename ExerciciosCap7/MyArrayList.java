import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        items.add("red");
        items.add(0, "yellow");

        System.out.print(
                "Display list contents with counter-controlled loop: \n");

        display(items, "Lista display:");

        items.add("green");
        items.add("blue");
        System.out.println( items.contains("red"));
      

        for (int i = 0; i < items.size(); i++) {
              System.out.println(items.get(0));
        }
      
        
       

      
    }

    static void display(ArrayList<String> items, String header) {
        System.out.printf(header);
        for (String item : items)
            System.out.printf(" %s", item);
        System.out.println();
    }

}
