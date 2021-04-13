package collections.collectionGeneralCommads;

import java.util.*;


public class CollectionTest {//разница между List and Set
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(1);
        ar.add(2);
        ar.add(2);
        ar.add(3);
        ar.add(3);
        ar.add(4);
        ar.add(4);
        Set<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        System.out.println(ar);
        System.out.println(hs);
    }
}
