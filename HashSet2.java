package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);


        hs.add(1);// 1 is not added
        System.out.println(hs.add(1)); // false
        System.out.println(hs.add(5)); // true
        System.out.println(hs);

        //size
        System.out.println("Size : "+hs.size());

        //contains
        System.out.println(hs.contains(1));
        // Iterator
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        /*-------hs.get is not there in hashset
        for(int i=0;i<=hs.size();i++){
            System.out.println(hs.get());
        }*/
    }
}
