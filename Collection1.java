package collection;// colection interface methods topic
import java.util.ArrayList;
class Collection1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("aa");
        al.add("bb");
        al.add("cc");
        System.out.println(al);

        ArrayList al2= new ArrayList();
      al2.add("dd");
      al2.add("bb");
      al2.add("ff");
        System.out.println(al2);
      al.removeAll(al2);
        System.out.println(al);
    }
}
