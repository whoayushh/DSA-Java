import java.util.*;
class ArrayListinJava{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();  //ArrayList Object

        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Maruti");
        System.out.println(cars);


        //to access an item
        cars.get(0);   //returns volvo

        //to change the item
        cars.set(1, "opel"); 

        //to remove an element
        cars.remove(0);

        //to remove all elements of the ArrayList
        cars.clear();

        //to get the size 
        cars.size();

        // retainAll() return the common elements 

        //looping through the  arraylist using for each loop
        for(String i : cars) {
            System.out.println(i);
    }
}
}

