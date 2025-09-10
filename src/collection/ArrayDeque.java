package collection;

import java.util.ArrayDeque;

class Test21062{
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.addFirst(30);
        ad.addLast(40);
        ad.add(50);
        ad.add(50);
        System.out.println(ad);
        ad.remove();
       /* ad.offer(60);
        System.out.println(ad);
        ad.poll();
        ad.pollFirst();
        ad.pollLast();*/
        System.out.println(ad);
    }
}