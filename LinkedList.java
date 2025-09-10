package collection;

import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        java.util.LinkedList<Integer> ll = new java.util.LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.add(4);
        ll.addLast(5);
        System.out.println(ll);
        System.out.println(ll.size());
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.print("Enter value: ");
        int value = sc.nextInt();

        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i) == value) {
                System.out.println("Value is present");
                return;
            }
            else{
                System.out.println("Value is not present");
                return;
            }
        }

    }
}
