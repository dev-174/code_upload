package collection;
// Refer Google Drive notes f
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(2);
        System.out.println(al);

        System.out.println(al.get(2));

        al.add(1, 4);
        System.out.println(al);

        al.set(0,10);
        System.out.println(al);
        System.out.println("Index of 2 at last is: "+al.lastIndexOf(2));
        al.remove(0);
        System.out.println(al);

        System.out.println("Size = "+al.size());

        for(int i = 0;i<al.size();i++){
            System.out.print(al.get(i) +" ");
        }
        System.out.println();

        Collections.sort(al);
        System.out.println(al);
    }
}