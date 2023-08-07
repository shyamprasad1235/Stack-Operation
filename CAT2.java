import java.util.LinkedList;
import java.util.LinkedHashSet;

public class CAT2{
    public static void main(String[] args) {
        LinkedList <Integer> cars = new LinkedList <Integer>();

        cars.add(12);
        cars.add(12);
        cars.add(10);
        cars.add(25);
        cars.add(89);
        cars.add(75);

        System.out.println(cars);        

        LinkedHashSet <Integer> list = new LinkedHashSet <Integer> (cars);
        
        System.out.println(list);
    }     
}        



       
